package ocp.ocp_newBook.chap9;

import java.util.HashMap;
import java.util.Map;

/**
 * @author $ Devalère
 **/
public class PuttingIfAbsent {
    public static void main(String[] args){
        //The putIfAbsent() method sets a value in the map but skips it if the value is already set to a non-null value.
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}
/*        As you can see, Jenny’s value is not updated because one was already present. Sam
        wasn’t there at all, so he was added. Tom was present as a key but had a null value.
        Therefore, he was added as well.*/
    }
}
