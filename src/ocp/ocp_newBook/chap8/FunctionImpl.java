package ocp.ocp_newBook.chap8;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author $ Devalère
 **/
public class FunctionImpl {
    /*A Function is responsible for turning one parameter into a value of a potentially different
type and returning it. Similarly, a BiFunction is responsible for turning two parameters into a
value and returning it.*/
    public static void main(String[] args){
//        For example, this function converts a String to the length of the String:
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        System.out.println(f1.apply("cluck")); // 5
        System.out.println(f2.apply("jeannine")); // 8
//        The types don’t have to be different. The following combines two String objects and produces another String:
        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
    }
}
