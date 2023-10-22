package ocp.ocp_newBook.chat10;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 **/
public class MinMax {
    public static void main(String [] args){
        //This example finds the animal with the fewest letters in its name:
        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length());
        min.ifPresent(System.out::println); // ape

/**     Notice that the code returns an Optional rather than the value. This allows the method
        to specify that no minimum or maximum was found. We use the Optional method
        ifPresent() and a method reference to print out the minimum only if one is found. As an
        example of where there isn’t a minimum, let’s look at an empty stream:*/
        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent()); // false
        /*Since the stream is empty, the comparator is never called, and no value is present in
        the Optional.*/
    }
}

/**
 * What if you need both the min() and max() values of the same stream?
 * For now, you can’t have both, at least not using these methods.
 * Remember, a stream can have only one terminal operation. Once a
 * terminal operation has been run, the stream cannot be used again. As
 * you see later in this chapter, there are built-in summary methods for
 * some numeric streams that will calculate a set of values for you.
 * */