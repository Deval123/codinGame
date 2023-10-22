package ocp.ocp_newBook.chap9;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @author $ Devalère
 **/
public class MergingData {
    public static void main(String[] args) {
/**        The merge() method adds logic of what to choose. Suppose we want to choose the ride with
        the longest name. We can write code to express this by passing a mapping function to the
        merge() method:*/
        BiFunction<String, String, String> mapper = (v1, v2) -> v1.length() > v2.length() ? v1 : v2;

        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");

        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);

        System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
        System.out.println(jenny); // Bus Tour
        System.out.println(tom); // Skyride

        /**The code on lines 15 takes two parameters and returns a value.
        Our implementation returns the one with the longest name. Line 21 calls this mapping function, and it sees
        that Bus Tour is longer than Skyride, so it leaves the value as Bus Tour. Line 19 calls this
        mapping function again. This time, Tram is shorter than Skyride, so the map is updated.
        Line 21 prints out the new map contents. Lines 25 and 26 show that the result is returned from merge().
*/
        //The merge() method also has logic for what happens if null values or missing keys are
        //involved. In this case, it doesn’t call the BiFunction at all, and it simply uses the new value.

        BiFunction<String, String, String> mapper1 = (v11, v21) -> v11.length() > v21.length() ? v11 : v21;
        Map<String, String> favorites1 = new HashMap<>();
        favorites1.put("Sam", null);
        favorites1.merge("Tom", "Skyride", mapper1);
        favorites1.merge("Sam", "Skyride", mapper1);
        System.out.println(favorites1); // {Tom=Skyride, Sam=Skyride}


/*        The final thing to know about merge() is what happens when the mapping function is
        called and returns null. The key is removed from the map when this happens:*/
        BiFunction<String, String, String> mapper2 = (v1, v2) -> null;
        Map<String, String> favorites2 = new HashMap<>();
        favorites2.put("Jenny", "Bus Tour");
        favorites2.put("Tom", "Bus Tour");
        favorites2.merge("Jenny", "Skyride", mapper2);
        favorites2.merge("Sam", "Skyride", mapper2);
        System.out.println(favorites2); // {Tom=Bus Tour, Sam=Skyride}

/**     Tom was left alone since there was no merge() call for that key. Sam was added since
 that key was not in the original list. Jenny was removed because the mapping function
 returned null.*/
    }
}
