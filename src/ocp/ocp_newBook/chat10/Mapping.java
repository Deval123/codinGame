package ocp.ocp_newBook.chat10;

import java.util.stream.Stream;

/**
 * @author $ Devalère
 * The map() method creates a one-to-one mapping from the elements in the stream to the elements of the next step in the stream. The method signature is as follows:
 * public <R> Stream<R> map(Function<? super T, ? extends R> mapper)
 * This one looks more complicated than the others you have seen. It uses the lambda
 * expression to figure out the type passed to that function and the one returned. The return
 * type is the stream that is returned.
 *
 * The map() method on streams is for transforming data. Don’t confuse it
 * with the Map interface, which maps keys to values.
 * As an example, this code converts a list of String objects to a list of Integer objects
 * representing their lengths:
 **/
public class Mapping {
    public static void main(String[] args){
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.map(String::length)
                .forEach(System.out::print); // 676
        /*Remember that String::length is shorthand for the lambda x -> x.length(),
                which clearly shows it is a function that turns a String into an Integer.*/
    }
}
