package ocp.ocp_newBook.chap8.convenienceMethods;

import java.util.function.BooleanSupplier;

/**
 * @author $ Devalère
 **/
public class BooleanSupplierImpl {
    public static void main(String[] args) {
        // It works just as you’ve come to expect from functional interfaces. Here’s an example:
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;
        //Both of each create a BooleanSupplier, which is the only functional interface for boolean.
        System.out.println(b1.getAsBoolean()); // true
        System.out.println(b2.getAsBoolean()); // false
    }

/*    public void variables(int a) {
        int b = 1;
        Predicate<Integer> p1 = a -> {
            int b = 0;
            int c = 0;
            return b == c;
        }
    }*/
}
