package ocp.ocp_newBook.chat10;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 * The collect() method is a special type of reduction called a mutable reduction. It is more efficient than a regular reduction because we use the same mutable object while accumulating.
 * Common mutable objects include StringBuilder and ArrayList. This is a really useful method,
 * because it lets us get data out of streams and into another form. The method signatures are
 * as follows:
 * public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)
 * public <R,A> R collect(Collector<? super T, A,R> collector)
 **/
public class Collecting {
    public static void main(String[] args) {
        /*Let’s start with the first signature, which is used when we want to code specifically
        how collecting should work. Our wolf example from reduce can be converted to use collect():*/
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append);
        System.out.println(word); // wolf

        /**
         * The first parameter is the supplier, which creates the object that will store the results
         * as we collect data. Remember that a Supplier doesn’t take any parameters and returns a
         * value. In this case, it constructs a new StringBuilder.
         * The second parameter is the accumulator, which is a BiConsumer that takes two parameters and doesn’t return anything. It is responsible for adding one more element to the data
         * collection. In this example, it appends the next String to the StringBuilder.
         * The final parameter is the combiner, which is another BiConsumer. It is responsible for
         * taking two data collections and merging them. This is useful when we are processing in
         * parallel. Two smaller collections are formed and then merged into one. This would work
         * with StringBuilder only if we didn’t care about the order of the letters. In this case, the accumulator and combiner have similar logic.
         * Now let’s look at an example where the logic is different in the accumulator
         * and combiner:*/
        System.out.println("***********");

        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set = stream1.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll);
        System.out.println(set); // [f, l, o, w]

        System.out.println("***********");

        /**
         * The collector has three parts as before. The supplier creates an empty TreeSet. The accumulator adds a single String from the Stream to the TreeSet. The combiner adds all of
         * the elements of one TreeSet to another in case the operations were done in parallel and
         * need to be merged.
         * We started with the long signature because that’s how you implement your own collector.
         * It is important to know how to do this for the exam and understand how collectors work. In
         * practice, many common collectors come up over and over. Rather than making developers
         * keep reimplementing the same ones, Java provides a class with common collectors cleverly
         * named Collectors. This approach also makes the code easier to read because it is more
         * expressive. For example, we could rewrite the previous example as follows:*/

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set2 = stream2.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set2); // [f, l, o, w]

        //If we didn’t need the set to be sorted, we could make the code even shorter:
        Stream<String> stream3 = Stream.of("w", "o", "l", "f");
        Set<String> set3 = stream3.collect(Collectors.toSet());
        System.out.println(set3); // [f, w, l, o]

        /*You might get different output for this last one since toSet() makes no guarantees as
to which implementation of Set you’ll get. It is likely to be a HashSet, but you shouldn’t
expect or rely on that.*/
    }
}
