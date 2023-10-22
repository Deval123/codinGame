package ocp.ocp_newBook.chat10;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 **/
public class MappingMethodsBetweenStream {
    public static void main(String[] args){
/*        Obviously, they have to be compatible types for this to work. Java requires a mapping
        function to be provided as a parameter, for example:*/
        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());
    }

 //   Additionally, you can create a Stream from a primitive stream. These methods show two ways of accomplishing this:
    private static Stream<Integer> mapping(IntStream stream) {
        return stream.mapToObj(x -> x);
    }
    private static Stream<Integer> boxing(IntStream stream) {
        return stream.boxed();
    }
/*    The first one uses the mapToObj() method we saw earlier. The second one is more succinct.
    It does not require a mapping function because all it does is autobox each primitive to
    the corresponding wrapper object.
    The boxed() method exists on all three types of primitive streams.*/
}
