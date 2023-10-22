package ocp.ocp_newBook.chap9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author $ Devalère
 **/
public class CollectionRemoveWithCondition {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list); // [Magician, Assistant]
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list); // [Magician]
/*        Line 16 shows how to remove all of the String values that begin with the letter A. This
        allows us to make the Assistant disappear. Let’s try an example with a method reference:*/
        Collection<String> set = new HashSet<>();
        set.add("Wand");
        set.add("");
        set.removeIf(String::isEmpty); // s -> s.isEmpty() we remove any empty String objects from set.
        System.out.println(set); // [Wand]
    }


}
