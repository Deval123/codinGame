package ocp.ocp_newBook.chap9;

import java.util.HashMap;
import java.util.Map;

/**
 * @author $ Devalère
 **/
public class GettingValuesSafely {
    public static void main(String[] args){
/*        The get() method returns null if the requested key is not in the map. Sometimes you
        prefer to have a different value returned. Luckily, the getOrDefault() method makes this
        easy. Let’s compare the two methods:*/
         Map<Character, String> map = new HashMap<>();
         map.put('x', "spot");
         System.out.println("X marks the " + map.get('x'));
         System.out.println("X marks the " + map.getOrDefault('x', ""));
         System.out.println("Y marks the " + map.get('y'));
         System.out.println("Y marks the " + map.getOrDefault('y', ""));
         /*As you can see, lines 16 and 17 have the same output because get() and getOrDefault()
behave the same way when the key is present. They return the value mapped by that key.
Lines 18 and 19 give different output, showing that get() returns null when the key is not
present. By contrast, getOrDefault() returns the empty string we passed as a parameter.*/
    }
}
