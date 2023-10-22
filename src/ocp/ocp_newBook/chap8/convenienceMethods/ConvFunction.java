package ocp.ocp_newBook.chap8.convenienceMethods;

import java.util.function.Function;

/**
 * @author $ Devalère
 **/
public class ConvFunction {
    public static void main(String[] args) {
        /*  The compose() method on Function chains functional interfaces. However, it passes along the
        output of one to the input of another.*/
        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;
        Function<Integer, Integer> combined = after.compose(before);
        System.out.println(combined.apply(3)); // 8

        /*This time, the before runs first, turning the 3 into 4. Then the after runs, doubling the 4 to 8.*/
    }
}
