package ocp.ocp_newBook.chat10;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 * Up until now, all of the streams we’ve created used the Stream interface with a generic type,
 * like Stream<String>, Stream<Integer>, and so on. For numeric values, we have been using
 * wrapper classes. We did this with the Collections API in Chapter 9, so it should feel natural.
 * Java actually includes other stream classes besides Stream that you can use to work with
 * select primitives: int, double, and long. Let’s take a look at why this is needed. Suppose that
 * we want to calculate the sum of numbers in a finite stream:
 **/
public class WorkingWithPrimitiveStreams {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3);
        System.out.println(stream.reduce(0, (s, n) -> s + n)); // 6
/*      Not bad. It wasn’t hard to write a reduction. We started the accumulator with zero. We
        then added each number to that running total as it came up in the stream. There is another
        way of doing that, shown here:*/
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        System.out.println(stream1.mapToInt(x -> x).sum()); // 6
        /**
         * This time, we converted our Stream<Integer> to an IntStream and asked the
         * IntStream to calculate the sum for us. An IntStream has many of the same intermediate
         * and terminal methods as a Stream but includes specialized methods for working with
         * numeric data. The primitive streams know how to perform certain common operations
         * automatically.
         * So far, this seems like a nice convenience but not terribly important. Now think about
         * how you would compute an average. You need to divide the sum by the number of elements.
         * The problem is that streams allow only one pass. Java recognizes that calculating an average
         * is a common thing to do, and it provides a method to calculate the average on the stream
         * classes for primitives.
         * */

        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble()); // 2.0
        /**
         * Not only is it possible to calculate the average, but it is also easy to do so. Clearly, primitive streams are important. We look at creating and using such streams, including optionals
         * and functional interfaces.
         */
    }
}
