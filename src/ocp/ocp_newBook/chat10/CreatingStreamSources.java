package ocp.ocp_newBook.chat10;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 * In Java, the streams we have been talking about are represented by the Stream<T> interface,
 * defined in the java.util.stream package.
 **/
public class CreatingStreamSources {
    public static void main(String[] args) {
/*        Creating Finite Streams
        For simplicity, we start with finite streams. There are a few ways to create them.*/
        Stream<String> empty = Stream.empty(); // count = 0
        Stream<Integer> singleElement = Stream.of(1); // count = 1
        Stream<Integer> fromArray = Stream.of(1, 2, 3); // count = 3
/*        Line 11 shows how to create an empty stream. Line 12 shows how to create a stream
        with a single element. Line 13 shows how to create a stream from a varargs.
                Java also provides a convenient way of converting a Collection to a stream.*/
        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();
/*        Line 15 shows that it is a simple method call to create a stream from a list. This is helpful
        since such conversions are common.*/

        /*Creating a Parallel Stream
        It is just as easy to create a parallel stream from a list.*/
        var list1 = List.of("a", "b", "c");
        Stream<String> fromListParallel = list1.parallelStream();


/*        Creating Infinite Streams
        So far, this isn’t particularly impressive. We could do all this with lists. We can’t create an
        infinite list, though, which makes streams more powerful.*/
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        /**
         * First line  generates a stream of random numbers. How many random numbers? However
         * many you need. If you call randoms.forEach(System.out::println), the program will
         * print random numbers until you kill it. Later in the chapter, you learn about operations like
         * limit() to turn the infinite stream into a finite stream.
         * Second line gives you more control. The iterate() method takes a seed or starting value as the
         * first parameter. This is the first element that will be part of the stream. The other parameter
         * is a lambda expression that is passed the previous value and generates the next value. As
         * with the random numbers example, it will keep on producing odd numbers as long as you
         * need them.*/
    }
}
