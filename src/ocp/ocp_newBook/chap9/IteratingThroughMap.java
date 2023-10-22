package ocp.ocp_newBook.chap9;

import java.util.HashMap;
import java.util.Map;

/**
 * @author $ Devalère
 **/
public class IteratingThroughMap {
    public static void main(String[] args){
/*        You saw the forEach() method earlier in the chapter. Note that it works a little differently on
        a Map. This time, the lambda used by the forEach() method has two parameters: the key and
        the value. Let’s look at an example, shown here:*/
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
        map.forEach((k, v) -> System.out.println(v));
/*        The lambda has both the key and value as the parameters. It happens to print out the
        value but could do anything with the key and/or value. Interestingly, since we don’t care
        about the key, this particular code could have been written with the values() method and
        a method reference instead.*/
        map.values().forEach(System.out::println);
/*        Another way of going through all the data in a map is to get the key/value pairs in a Set.
                Java has a static interface inside Map called Entry. It provides methods to get the key and
        value of each pair.*/
        map.entrySet().forEach(e ->
                System.out.println(e.getKey() + " " + e.getValue()));
    }
}
