package ocp.ocp_newBook.chat10;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * @author $ Devalère
 **/
public class UsingOptionalWithPrimitiveStreams {
    public static void main(String[] args){
        /*Earlier in the chapter, we wrote a method to calculate the average of an int[] and promised
        a better way later. Now that you know about primitive streams, you can calculate the
        average in one line.*/
        var stream = IntStream.rangeClosed(1,10);
        OptionalDouble optional = stream.average();

        /**
         * The return type is not the Optional you have become accustomed to using. It is a new
         * type called OptionalDouble. Why do we have a separate type, you might wonder? Why
         * not just use Optional<Double>? The difference is that OptionalDouble is for a primitive and Optional<Double> is for the Double wrapper class.
         * Working with the primitive optional class looks similar to working with the Optional class itself.
         * */
        optional.ifPresent(System.out::println); // 5.5
        System.out.println(optional.getAsDouble()); // 5.5
        System.out.println(optional.orElseGet(() -> Double.NaN)); // 5.5

        /**
         * The only noticeable difference is that we called getAsDouble() rather than get().
         * This makes it clear that we are working with a primitive. Also, orElseGet() takes a
         * DoubleSupplier instead of a Supplier.
         * */

//        Let’s try an example to make sure that you understand this:
         LongStream longs = LongStream.of(5, 10);
         long sum = longs.sum();
         System.out.println(sum); // 15
         DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
         OptionalDouble min = doubles.min(); // runs infinitely
/*      First line creates a stream of long primitives with two elements. Second line shows that we don’t
        use an optional to calculate a sum. Fourth line creates an infinite stream of double primitives.
        Fifth line is there to remind you that a question about code that runs infinitely can appear with
        primitive streams as well.*/
    }
}
