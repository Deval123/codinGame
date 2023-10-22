package ocp.ocp_newBook.chap8;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author $ Devalère
 **/
public class UnaryOperatorImpl {
    /*UnaryOperator and BinaryOperator are special cases of a Function. They require all
type parameters to be the same type. A UnaryOperator transforms its value into one of the
same type. For example, incrementing by one is a unary operation. In fact, UnaryOperator
extends Function. A BinaryOperator merges two values into one of the same type.
Adding two numbers is a binary operation. Similarly, BinaryOperator extends BiFunction.*/
    public static void main(String[] args) {
        /*This means the method signatures look like this:
        T apply(T t); // UnaryOperator
        T apply(T t1, T t2); // BinaryOperator
        */
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();
        System.out.println(u1.apply("chirp")); // CHIRP
        System.out.println(u2.apply("chIrp")); // CHIRP
/*        This prints CHIRP twice. We don’t need to specify the return type in the generics
        because UnaryOperator requires it to be the same as the parameter.
        And now here’s the binary example:*/
        System.out.printf("\n");
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);
        System.out.println(b1.apply("baby ", "chick")); // baby chick
        System.out.println(b2.apply("baby ", "chick")); // baby chick
    }
}
