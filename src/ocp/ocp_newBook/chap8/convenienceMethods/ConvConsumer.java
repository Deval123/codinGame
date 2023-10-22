package ocp.ocp_newBook.chap8.convenienceMethods;

import java.util.function.Consumer;

/**
 * @author $ Devalère
 **/
public class ConvConsumer {
    public static void main(String[] args){
/*        Let’s take a look at the andThen() method, which runs two
        functional interfaces in sequence:*/
        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.print(",2: " + x);
        Consumer<String> combined = c1.andThen(c2);
        combined.accept("Annie"); // 1: Annie,2: Annie
    }
}
