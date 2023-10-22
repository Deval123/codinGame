package ocp.ocp_newBook.chat10;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 **/
public class GroupingMapping {
    public static void main(String[] args){
        /**
         * Great job getting this far. The exam creators like asking about groupingBy() and
         * partitioningBy(), so make sure you understand these sections very well. Now suppose
         * that we want to get groups of names by their length. We can do that by saying that we want
         * to group by length.
         * */

        var ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
        /**
         * The groupingBy() collector tells collect() that it should group all of the elements of
         * the stream into a Map. The function determines the keys in the Map. Each value in the Map is
         * a List of all entries that match that key.
         *
         * Note that the function you call in groupingBy() cannot return null. It
         * does not allow null keys.*/

        /*Suppose that we don’t want a List as the value in the map and prefer a Set instead. No
        problem. There’s another method signature that lets us pass a downstream collector. This is
        a second collector that does something special with the values.*/
        var ohMy1 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map1 = ohMy1.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.toSet()));
        System.out.println(map1); // {5=[lions, bears], 6=[tigers]}
 //     We can even change the type of Map returned through yet another parameter.
        var ohMy2 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, Set<String>> map2 = ohMy.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toSet()));
        System.out.println(map2); // {5=[lions, bears], 6=[tigers]}
        /*This is very flexible. What if we want to change the type of Map returned but leave the
        type of values alone as a List? There isn’t a method for this specifically because it is easy
        enough to write with the existing ones.*/
        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, List<String>> map3 = ohMy3.collect(
                Collectors.groupingBy(
                        String::length,
                        TreeMap::new,
                        Collectors.toList()));
        System.out.println(map3);
    }
}
