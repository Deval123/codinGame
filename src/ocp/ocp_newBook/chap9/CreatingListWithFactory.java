package ocp.ocp_newBook.chap9;

import java.util.Arrays;
import java.util.List;

/**
 * @author $ Devalère
 **/
public class CreatingListWithFactory {
    public static void main(String[] args) {
        //Let’s take a look at an example of these three methods:
        String[] array = new String[]{"a", "b", "c"};
        List<String> asList = Arrays.asList(array); // [a, b, c];  creates a List that is backed by an array.
        List<String> of = List.of(array); // [a, b, c] create an immutable List.
        List<String> copy = List.copyOf(asList); // [a, b, c] create an immutable List.

        array[0] = "z"; //changes the array

        System.out.println(asList); // [z, b, c] // reflects that change
        System.out.println(of); // [a, b, c]
        System.out.println(copy); // [a, b, c]

        asList.set(0, "x");
        System.out.println(Arrays.toString(array)); // [x, b, c]  show the other direction where changing the List
        // updates the underlying array.

        copy.add("y"); // UnsupportedOperationException; shows it is immutable by throwing an exception when trying to add a value
    }
}
