package ocp.ocp_newBook.chat10;

import java.util.stream.Stream;

/**
 * @author $ Devalère
 * What if you wanted just odd numbers less than 100? There’s an overloaded version of iterate() that helps:
 **/
public class PrintingStreamReference {
    public static void main(String[] args){

         Stream<Integer> oddNumberUnder100 = Stream.iterate(
                 1, // seed
                  n -> n < 100, // Predicate to specify when done
                 n -> n + 2); // UnaryOperator to get next value

        /**
         * This method takes three parameters. Notice how they are separated by commas (,) just like in all other methods.
         * The exam may try to trick you by using semicolons since it is similar to a for loop.
         * Similar to a for loop, you have to take care that you aren’t accidentally creating an infinite stream.*/
    }
}
