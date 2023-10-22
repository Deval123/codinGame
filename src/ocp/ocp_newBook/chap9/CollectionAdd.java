package ocp.ocp_newBook.chap9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author $ Devalère
 **/
public class CollectionAdd {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow")); // true
        System.out.println(list.add("Sparrow")); // true

        Collection<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow")); // true
        System.out.println(set.add("Sparrow")); // false


    }


}
