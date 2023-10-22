package ocp.ocp_newBook.chat10;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author $ Devalère
 * Suppose you want to return two things. As we’ve learned, this is problematic with streams
 * because you only get one pass. The summary statistics are good when you want those operations.
 * Luckily, you can use teeing() to return multiple values of your own.
 * First, define the return type. We use a record here:
 * record Separations(String spaceSeparated, String commaSeparated) {}
 * Now we write the stream. As you read, pay attention to the number of Collectors:
 **/
record Separations(String spaceSeparated, String commaSeparated) {}
public class TeeingCollectors {
    public static void main(String[] args){
        var list = List.of("x", "y", "z");
        Separations result = list.stream()
                .collect(Collectors.teeing(
                        Collectors.joining(" "),
                        Collectors.joining(","),
                        (s, c) -> new Separations(s, c)));
        System.out.println(result);


        /**
         * When executed, the code prints the following:
         * Separations[spaceSeparated=x y z, commaSeparated=x,y,z]
         * There are three Collectors in this code. Two of them are for joining() and produce
         * the values we want to return. The third is teeing(), which combines the results into the
         * single object we want to return. This way, Java is happy because only one object is returned,
         * and we are happy because we don’t have to go through the stream twice.
         * */
    }
}
