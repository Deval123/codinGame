package ocp.ocp_newBook.chat10;

import java.util.stream.Stream;

/**
 * @author $ Devalère
 * Before you use it, consider if another approach would be better. Developers who learned
 * to write loops first tend to use them for everything. For example, a loop with an if statement could be written with a filter. You will learn about filters in the intermediate operations section.
 * The method signature is as follows:
 * public void forEach(Consumer<? super T> action)
 * Notice that this is the only terminal operation with a return type of void. If you want
 * something to happen, you have to make it happen in the Consumer. Here’s one way to print
 * the elements in the stream (there are other ways, which we cover later in the chapter):
 **/
public class Iterating {
    public static void main(String[] args){
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print); // MonkeyGorillaBonobo

        /**
         * Remember that you can call forEach() directly on a Collection or on a
         * Stream. Don’t get confused on the exam when you see both approaches.
         * Notice that you can’t use a traditional for loop on a stream.
         * Stream<Integer> s = Stream.of(1);
         * for (Integer i : s) {} // DOES NOT COMPILE
         * While forEach() sounds like a loop, it is really a terminal operator for streams. Streams
         * cannot be used as the source in a for-each loop because they don’t implement the Iterable
         * interface.
         * */
    }
}
