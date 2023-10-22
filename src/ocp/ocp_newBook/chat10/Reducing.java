package ocp.ocp_newBook.chat10;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 * The reduce() method combines a stream into a single object. It is a reduction, which means it
 * processes all elements. The three method signatures are these:
 * public T reduce(T identity, BinaryOperator<T> accumulator)
 * public Optional<T> reduce(BinaryOperator<T> accumulator)
 * public <U> U reduce(U identity,
 * BiFunction<U,? super T,U> accumulator,
 * BinaryOperator<U> combiner)
 * Let’s take them one at a time. The most common way of doing a reduction is to start with
 * an initial value and keep merging it with the next value.
 * Think about how you would concatenate an array of String objects into a single String without functional programming.
 **/
public class Reducing {
    public static void main(String[] args){
        //It might look something like this:
        var array = new String[] { "w", "o", "l", "f" };
        var result = "";
        for (var s: array) result = result + s;
        System.out.println(result); // wolf
        /*The identity is the initial value of the reduction, in this case an empty String.
        The accumulator combines the current result with the current value in the stream. With lambdas, we
        can do the same thing with a stream and reduction:*/
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s + c);
        System.out.println(word); // wolf
        /*Notice how we still have the empty String as the identity. We also still concatenate the
        String objects to get the next value. We can even rewrite this with a method reference:*/
        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        String word1 = stream1.reduce("", String::concat);
        System.out.println(word1); // wolf
        /*Let’s try another one. Can you write a reduction to multiply all of the Integer objects in
        a stream? Try it. Our solution is shown here:*/
        Stream<Integer> stream2 = Stream.of(3, 5, 6);
        System.out.println(stream2.reduce(1, (a, b) -> a*b)); // 90

        /**
         * We set the identity to 1 and the accumulator to multiplication. In many cases, the identity isn’t really necessary, so Java lets us omit it. When you don’t specify an identity, an
         * Optional is returned because there might not be any data. There are three choices for what
         * is in the Optional:
         * ■ If the stream is empty, an empty Optional is returned.
         * ■ If the stream has one element, it is returned.
         * ■ If the stream has multiple elements, the accumulator is applied to combine them.
         * The following illustrates each of these scenarios:*/

        System.out.println("************");
        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElements = Stream.of(3, 5, 6);
        empty.reduce(op).ifPresent(System.out::println); // no output
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElements.reduce(op).ifPresent(System.out::println); // 90

        /*The third method signature is used when we are dealing with different types. It allows
        Java to create intermediate reductions and then combine them at the end. Let’s take a look at
        an example that counts the number of characters in each String:*/
        Stream<String> stream3 = Stream.of("w", "o", "l", "f!");
        int length = stream3.reduce(0, (i, s) -> i+s.length(), (a, b) -> a+b);
        System.out.println(length); // 5

        /**
         * The first parameter (0) is the value for the initializer. If we had an empty stream, this
         * would be the answer. The second parameter is the accumulator. Unlike the accumulators you
         * saw previously, this one handles mixed data types. In this example, the first argument, i, is
         * an Integer, while the second argument, s, is a String. It adds the length of the current
         * String to our running total. The third parameter is called the combiner, which combines
         * any intermediate totals. In this case, a and b are both Integer values.
         * The three-argument reduce() operation is useful when working with parallel streams
         * because it allows the stream to be decomposed and reassembled by separate threads. For
         * example, if we needed to count the length of four 100-character strings, the first two values
         * and the last two values could be computed independently. The intermediate result (200 +
         * 200) would then be combined into the final value.*/
    }
}
