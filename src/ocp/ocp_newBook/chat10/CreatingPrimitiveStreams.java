package ocp.ocp_newBook.chat10;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * @author $ Devalère
 * Here are the three types of primitive streams:
 * ■ IntStream: Used for the primitive types int, short, byte, and char
 * ■ LongStream: Used for the primitive type long
 * ■ DoubleStream: Used for the primitive types double and float
 *
 * Why doesn’t each primitive type have its own primitive stream? These three are the most
 * common, so the API designers went with them.
 **/
public class CreatingPrimitiveStreams {
    public static void main(String[] args){
/*      Some of the methods for creating a primitive stream are equivalent to how we created the
        source for a regular Stream. You can create an empty stream with this:*/
        DoubleStream empty = DoubleStream.empty();
//      Another way is to use the of() factory method from a single value or by using the varargs overload.
        DoubleStream oneValue = DoubleStream.of(3.14);
        oneValue.forEach(System.out::println);
        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        varargs.forEach(System.out::println);

//      You can also use the two methods for creating infinite streams, just like we did with Stream.
        var random = DoubleStream.generate(Math::random);
        var fractions = DoubleStream.iterate(.5, d -> d / 2);
        random.limit(3).forEach(System.out::println);
        fractions.limit(3).forEach(System.out::println);
        /**
         * Since the streams are infinite, we added a limit intermediate operation so that the output
         * doesn’t print values forever. The first stream calls a static method on Math to get a
         * random double. Since the numbers are random, your output will obviously be different. The
         * second stream keeps creating smaller numbers, dividing the previous value by two each time.
         * Fun fact! For example, ints() generates an infinite IntStream of primitives.
         * It works the same way for each type of primitive stream. When dealing with int or long
         * primitives, it is common to count. Suppose that we wanted a stream with the numbers from
         * 1 through 5. We could write this using what we’ve explained so far:*/

        IntStream count = IntStream.iterate(1, n -> n+1).limit(5);
        count.forEach(System.out::print); // 12345
/*      This code does print out the numbers 1–5. However, it is a lot of code to do something so
        simple. Java provides a method that can generate a range of numbers.*/
        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::print); // 12345

/**     This is better. If we wanted numbers 1–5, why did we pass 1–6? The first parameter to the
        range() method is inclusive, which means it includes the number. The second parameter to
        the range() method is exclusive, which means it stops right before that number. However,
        it still could be clearer. We want the numbers 1–5 inclusive. Luckily, there’s another method,
        rangeClosed(), which is inclusive on both parameters.*/
        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::print); // 12345
/*        Even better. This time we expressed that we want a closed range or an inclusive range.
        This method better matches how we express a range of numbers in plain English.*/
    }
}
