package ocp.ocp_newBook.chat10;

import java.util.stream.Stream;

/**
 * @author $ Devalère
 * The filter() method returns a Stream with elements that match a given expression. Here is the
 * method signature:
 * public Stream<T> filter(Predicate<? super T> predicate)
 * This operation is easy to remember and powerful because we can pass any Predicate to
 * it. For example, this retains all elements that begin with the letter m:
 **/
public class Filtering {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m"))
                .forEach(System.out::print); // monkey

        /**
         * Removing Duplicates
         * The distinct() method returns a stream with duplicate values removed. The duplicates do not
         * need to be adjacent to be removed. As you might imagine, Java calls equals() to determine
         * whether the objects are equivalent. The method signature is as follows:
         * public Stream<T> distinct()*/

        //Here’s an example:
        Stream<String> s1 = Stream.of("duck", "duck", "duck", "goose");
        s1.distinct().forEach(System.out::print); // duckgoose

        /**
         * Restricting by Position
         * The limit() and skip() methods can make a Stream smaller, or limit() could make a
         * finite stream out of an infinite stream. The method signatures are shown here:
         * public Stream<T> limit(long maxSize)
         * public Stream<T> skip(long n)
         * The following code creates an infinite stream of numbers counting from 1. The skip()
         * operation returns an infinite stream starting with the numbers counting from 6, since it skips
         * the first five elements. The limit() call takes the first two of those. Now we have a finite
         * stream with two elements, which we can then print with the forEach() method:*/

        Stream<Integer> s3 = Stream.iterate(1, n -> n + 1);
        s3.skip(5)
                .limit(2)
                .forEach(System.out::print); // 67
    }
}
