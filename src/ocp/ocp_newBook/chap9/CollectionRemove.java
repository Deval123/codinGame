package ocp.ocp_newBook.chap9;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author $ Devalère
 **/
public class CollectionRemove {
    public static void main(String[] args) {

//  This time, the boolean return value tells us whether a match was removed. The following shows how to use this method:
        Collection<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println("\n");
        System.out.println("********");
        System.out.println(birds.remove("cardinal")); // false
        System.out.println(birds.remove("hawk")); // true
        System.out.println(birds); // [hawk]
    }
}
