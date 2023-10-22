package ocp.ocp_newBook.chap8;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * @author $ Devalère
 **/
public class ConsumerImpl {
    public static void main(String [] args){
//        Printing is a common use of the Consumer interface:
        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);
        c1.accept("Annie"); // Annie
        c2.accept("Annie"); // Annie
        /*BiConsumer is called with two parameters. They don’t have to be the same type. For
        example, we can put a key and a value in a map using this interface:*/
        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);
        b1.accept("chicken", 7);
        b2.accept("chick", 1);
        System.out.println(map); // {chicken=7, chick=1}
//        As another example, we use the same type for both generic parameters:
        var map1 = new HashMap<String, String>();
        BiConsumer<String, String> b11 = map1::put;
        BiConsumer<String, String> b21 = (k, v) -> map1.put(k, v);
        b11.accept("chicken", "Cluck");
        b21.accept("chick", "Tweep");
        System.out.println(map1); // {chicken=Cluck, chick=Tweep}
        /*This shows that a BiConsumer can use the same type for both the T and U generic
        parameters.*/
    }
}
