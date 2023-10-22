package ocp.in_out;

/**
 * @author $ Devalère
 **/

import java.util.*;
import java.util.stream.IntStream;

public class Bounce {
    public static void main(String... legend) {
        var db = Collections.synchronizedList(new ArrayList<>());
        IntStream.range(1,6)
                .parallel()
                .map(i -> {db.add(i); return i;})
                .forEachOrdered(System.out::print); // p1
        System.out.println();
        db.forEach(System.out::print);
    }
}