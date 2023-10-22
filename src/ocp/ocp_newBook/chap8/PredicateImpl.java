package ocp.ocp_newBook.chap8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * @author $ Devalère
 **/
public class PredicateImpl {
    public static void main(String [] args){
//        You can use a Predicate to test a condition.
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();
        System.out.println(p1.test("")); // true
        System.out.println(p2.test("lulu")); // false
        System.out.println("\n");
//        More interesting is a BiPredicate. This example also prints true twice:
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);
        System.out.println(b1.test("chicken", "chick")); // true
        System.out.println(b2.test("chicken", "chick")); // true
    }
}
