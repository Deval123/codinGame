package ocp.ocp_newBook.chat10;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 * Partitioning is a special case of grouping. With partitioning, there are only two possible
 * groups: true and false. Partitioning is like splitting a list into two parts.
 * Suppose that we are making a sign to put outside each animal’s exhibit. We have two sizes
 * of signs. One can accommodate names with five or fewer characters. The other is needed for
 * longer names. We can partition the list according to which sign we need.
 **/
public class PartitioningMapping {
    public static void main(String[] args) {
        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map); // {false=[tigers], true=[lions, bears]}

        /*Here we pass a Predicate with the logic for which group each animal name belongs in.
        Now suppose that we’ve figured out how to use a different font, and seven characters can
        now fit on the smaller sign. No worries. We just change the Predicate.*/

        var ohMy1 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map1 = ohMy1.collect(
                Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map1); // {false=[], true=[lions, tigers, bears]}

        /*Notice that there are still two keys in the map—one for each boolean value.
        It so happens that one of the values is an empty list, but it is still there. As with groupingBy(),
        we can change the type of List to something else.*/

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map2 = ohMy2.collect(
                Collectors.partitioningBy(
                        s -> s.length() <= 7,
                        Collectors.toSet()));
        System.out.println(map2); // {false=[], true=[lions, tigers, bears]}
        /**
         *  Unlike groupingBy(), we cannot change the type of Map that is returned. However,
         *  there are only two keys in the map, so does it really matter which Map type we use?
         *  Instead of using the downstream collector to specify the type, we can use any of the
         *  collectors that we’ve already shown. For example, we can group by the length of the animal
         *  name to see how many of each length we have.
         */
        var ohMy3 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map3 = ohMy3.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.counting()));
        System.out.println(map3); // {5=2, 6=1}
    }
}
