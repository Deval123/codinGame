package ocp.ocp_newBook.chat10;

import java.util.stream.Stream;

/**
 * @author $ Devalère
 * The peek() method is our final intermediate operation. It is useful for debugging because it
 * allows us to perform a stream operation without changing the stream. The method signature
 * is as follows:
 * public Stream<T> peek(Consumer<? super T> action)
 * You might notice the intermediate peek() operation takes the same argument as the
 * terminal forEach() operation. Think of peek() as an intermediate version of forEach()
 * that returns the original stream to you.
 * The most common use for peek() is to output the contents of the stream as it goes by. Suppose that we made a typo and counted bears beginning with the letter g instead of b. We are
 * puzzled why the count is 1 instead of 2. We can add a peek() method to find out why.
 **/
public class TakingPeek {
    public static void main(String[] args){
        var stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s -> s.startsWith("g"))
                .peek(System.out::println).count(); // grizzly
        System.out.println(count); // 1

        /**
         * In Chapter 9, you saw that peek() looks only at the first element when working with a
         * Queue. In a stream, peek() looks at each element that goes through that part of the stream
         * pipeline. It’s like having a worker take notes on how a particular step of the process is doing.
         * */
    }

    /**
     * Danger: Changing State with peek()
     * Remember that peek() is intended to perform an operation without changing the result.
     * Here’s a straightforward stream pipeline that doesn’t use peek():
     * var numbers = new ArrayList<>();
     * var letters = new ArrayList<>();
     * numbers.add(1);
     * letters.add('a');
     * Stream<List<?>> stream = Stream.of(numbers, letters);
     * stream.map(List::size).forEach(System.out::print); // 11
     * Now we add a peek() call and note that Java doesn’t prevent us from writing bad
     * peek code:
     * Stream<List<?>> bad = Stream.of(numbers, letters);
     * bad.peek(x -> x.remove(0))
     * .map(List::size)
     * .forEach(System.out::print); // 00
     * This example is bad because peek() is modifying the data structure that is used in the
     * stream, which causes the result of the stream pipeline to be different than if the peek
     * wasn’t present.*/
}
