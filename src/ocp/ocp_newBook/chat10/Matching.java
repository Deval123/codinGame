package ocp.ocp_newBook.chat10;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 * The allMatch(),anyMatch(), and noneMatch()methods search a stream and return information
 * about how the stream pertains to the predicate. These may or may not terminate for infinite
 * streams. It depends on the data. Like the find methods, they are not reductions because they
 * do not necessarily look at all of the elements.
 * The method signatures are as follows:
 * public boolean anyMatch(Predicate <? super T> predicate)
 * public boolean allMatch(Predicate <? super T> predicate)
 * public boolean noneMatch(Predicate <? super T> predicate)
 **/
public class Matching {
    public static void main(String [] args){
        //This example checks whether animal names begin with letters:
        var list = List.of("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        System.out.println(list.stream().anyMatch(pred)); // true
        System.out.println(list.stream().allMatch(pred)); // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infinite.anyMatch(pred)); // true
    }

    /**
     * This shows that we can reuse the same predicate, but we need a different stream each
     * time. The anyMatch() method returns true because two of the three elements match. The
     * allMatch() method returns false because one doesn’t match. The noneMatch() method
     * also returns false because at least one matches. On the infinite stream, one match is found,
     * so the call terminates. If we called allMatch(), it would run until we killed the program.
     *
     * Remember that allMatch(), anyMatch(), and noneMatch() return a
     * boolean. By contrast, the find methods return an Optional because
     * they return an element of the stream.
     * */
}
