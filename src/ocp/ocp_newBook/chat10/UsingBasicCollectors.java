package ocp.ocp_newBook.chat10;

import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 **/
public class UsingBasicCollectors {
    public static void main(String[] args){
//        Luckily, many of these collectors work the same way. Let’s look at an example:
        var ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result); // lions, tigers, bears
        /*Notice how the predefined collectors are in the Collectors class rather than the Collector interface.
        This is a common theme, which you saw with Collection versus Collections.
        In fact, you see this pattern again in Chapter 14 when working with Paths and Path and other related types.*/
 //       Let’s try another one. What is the average length of the three animal names?
        var ohMye = Stream.of("lions", "tigers", "bears");
        Double resulte = ohMye.collect(Collectors.averagingInt(String::length));
        System.out.println(resulte); // 5.333333333333333


/*
        Often, you’ll find yourself interacting with code that was written without streams. This
        means that it will expect a Collection type rather than a Stream type. No problem. You
        can still express yourself using a Stream and then convert to a Collection at the end.
        For example:*/
        var ohMy1 = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result1 = ohMy1
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result1); // [tigers]

        /**
         * This time we have all three parts of the stream pipeline. Stream.of() is the source
         * for the stream. The intermediate operation is filter(). Finally, the terminal operation is
         * collect(), which creates a TreeSet. If we didn’t care which implementation of Set we
         * got, we could have written Collectors.toSet(), instead.
         * At this point, you should be able to use all of the Collectors in Table 10.10 except
         * groupingBy(), mapping(), partitioningBy(), toMap(), and teeing().*/
    }
}
