package ocp.ocp_newBook.chap9;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author $ Devalère
 **/
public class CollectionCount {
    public static void main(String[] args) { //The following shows how to use these methods:
        Collection<String> birds = new ArrayList<>();
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size()); // 0
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size()); // 2


    }


}
