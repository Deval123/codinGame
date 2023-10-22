package ocp.ocp_newBook.chat10;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 * The sorted() method returns a stream with the elements sorted. Just like sorting arrays, Java
 * uses natural ordering unless we specify a comparator. The method signatures are these:
 * public Stream<T> sorted()
 * public Stream<T> sorted(Comparator<? super T> comparator)
 * Calling the first signature uses the default sort order.
 **/
public class Sorting {
    public static void main(String[] args) {
        Stream<String> s = Stream.of("brown-", "bear-");
        s.sorted()
                .forEach(System.out::print); // bear-brown
       /* We can optionally use a Comparator implementation via a method or a lambda. In this
        example, we are using a method:*/
        Stream<String> s1 = Stream.of("brown bear-", "grizzly-");
        s1.sorted(Comparator.reverseOrder())
                .forEach(System.out::print); // grizzly-brown bear
        /*Here we pass a Comparator to specify that we want to sort in the reverse of natural sort
        order. Ready for a tricky one? Do you see why this doesn’t compile?*/
        /**
         * Stream<String> s = Stream.of("brown bear-", "grizzly-");
         *          s.sorted(Comparator::reverseOrder); // DOES NOT COMPILE
         *          Take a look at the second sorted() method signature again. It takes a Comparator,
         *          which is a functional interface that takes two parameters and returns an int. However,
         *          Comparator::reverseOrder doesn’t do that. Because reverseOrder() takes
         *          no arguments and returns a value, the method reference is equivalent to
         *          () -> Comparator.reverseOrder(), which is really a Supplier<Comparator>. This
         *          is not compatible with sorted(). We bring this up to remind you that you really do need to
         *          know method references well.
         */
    }
}
