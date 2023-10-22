package ocp.ocp_newBook.chap9.casting_compareTo_argument;

/**
 * @author $ Devalère
 * When dealing with legacy code or code that does not use generics, the compareTo() method
 * requires a cast since it is passed an Object.
 **/

public class LegacyDuck implements Comparable {
    private String name;
    public int compareTo(Object obj) {
        LegacyDuck d = (LegacyDuck) obj; // cast because no generics
        return name.compareTo(d.name);
    }
}
/**    Since we don’t specify a generic type for Comparable, Java assumes that we want an
        Object, which means that we have to cast to LegacyDuck before accessing instance variables on it.*/
