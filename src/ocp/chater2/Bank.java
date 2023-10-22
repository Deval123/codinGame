package ocp.chater2;

/**
 * @author $ Devalère
 **/

import java.util.function.*;
import java.util.stream.Stream;

public class Bank {
    private int savingsInCents;
    private static class ConvertToCents {
        static DoubleToIntFunction f = p -> (int) (p*100); //the error cast p*100 to int
    }
    public static void main(String[] currency) {
/*        Bank creditUnion = new Bank();
        creditUnion.savingsInCents = 100;
        double deposit = 1.5;
        creditUnion.savingsInCents +=
                ConvertToCents.f.applyAsInt(deposit); // j1
        System.out.print(creditUnion.savingsInCents);*/

        Stream.generate(() -> "*")
                .limit(3)
                .sorted( )
                .distinct()
                .forEach(System.out::println);
    }
}

