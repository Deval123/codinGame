package ocp.ocp_newBook.chat10;

import java.util.stream.Stream;

/**
 * @author $ Devalère
 **/
public class FindAny {
    public static void main(String [] args){
       // This example finds an animal:
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s.findAny().ifPresent(System.out::println); // monkey (usually)
        infinite.findAny().ifPresent(System.out::println); // chimp
/*      Finding any one match is more useful than it sounds. Sometimes we just want to sample
        the results and get a representative element, but we don’t need to waste the processing
        generating them all. After all, if we plan to work with only one element, why bother
        looking at more?*/
    }
}
