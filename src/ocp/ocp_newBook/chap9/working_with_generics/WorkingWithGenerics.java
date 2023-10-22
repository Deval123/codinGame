package ocp.ocp_newBook.chap9.working_with_generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $ Devalère
 **/
public class WorkingWithGenerics {


    static void printNames(List list) {
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i); // ClassCastException
            System.out.println(name);
            }
        }


    public static void main(String[] args) {
        List names = new ArrayList();
        names.add(new StringBuilder("Webby"));
        printNames(names);
        }

        /**
         *
         * This code throws a ClassCastException. Line 22 adds a StringBuilder to list.
         * This is legal because a non-generic list can contain anything. However, line 14 is written to
         * expect a specific class to be in there. It casts to a String, reflecting this assumption.
         * Since the assumption is incorrect, the code throws a ClassCastException that
         * java.lang.StringBuilder cannot be cast to java.lang.String.
         * Generics fix this by allowing you to write and use parameterized types. Since we specify
         * that we want an ArrayList of String objects, the compiler has enough information to
         * prevent this problem in the first place.
         * List<String> names = new ArrayList<String>();
         * names.add(new StringBuilder("Webby")); // DOES NOT COMPILE
         * Getting a compiler error is good. You’ll know right away that something is wrong rather
         * than hoping to discover it later.
         * */


}
