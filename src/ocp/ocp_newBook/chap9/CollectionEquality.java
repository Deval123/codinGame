package ocp.ocp_newBook.chap9;

import java.util.List;
import java.util.Set;

/**
 * @author $ Devalère
 **/
public class CollectionEquality {
    public static void main (String[] args){
/*        There is a custom implementation of equals() so you can compare two Collections to compare
        the type and contents. The implementation will vary. For example, ArrayList checks order, while HashSet does not.*/
        // boolean equals(Object object)
        //The following shows an example:
         var list1 = List.of(1, 2);
         var list2 = List.of(2, 1);
         var set1 = Set.of(1, 2);
         var set2 = Set.of(2, 1);

         System.out.println(list1.equals(list2)); // false
         System.out.println(set1.equals(set2)); // true
         System.out.println(list1.equals(set1)); // false
/*        Line 17 prints false because the elements are in a different order, and a List cares
        about order. By contrast, line 18 prints true because a Set is not sensitive to order. Finally,
                line 19 prints false because the types are different.*/
    }
}
