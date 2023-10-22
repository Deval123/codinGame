package ocp.ocp_newBook.chat10;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 * This gets all of the animals into the same
 * level and removes the empty list.
 **/
public class UsingFlatMap {
    public static void main(String [] args){
        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        animals.flatMap(m -> m.stream())
                .forEach(System.out::println);

        /**
         * Concatenating Streams
         * While flatMap() is good for the general case, there is a more convenient way to concatenate two streams:
         * var one = Stream.of("Bonobo");
         * var two = Stream.of("Mama Gorilla", "Baby Gorilla");
         * Stream.concat(one, two)
         * .forEach(System.out::println);
         * This produces the same three lines as the previous example. The two streams are
         * concatenated, and the terminal operation, forEach(), is called.*/
    }
}
