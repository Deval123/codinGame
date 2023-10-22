package ocp.chater2;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 **/
interface Marsupial {
    void carryInPouch(int size);
}
public class Opossum {
    public static void main(String[] args) {
        Marsupial mar =
                System.out::println;
        mar.carryInPouch(1);

/*         Stream<Integer> s1 = Stream.of(8, 2);
         Stream<Integer> s2 = Stream.of(10, 20);
         s2 = s1.filter(n -> n > 4);
         s1 = s2.filter(n -> n < 1);
         System.out.println(s1.count());
         System.out.println(s2.count());*/

/*        Predicate<StringBuilder> p = (StringBuilder b) -> {return true;};
        var babies = Arrays.asList("chick", "cygnet", "duckling");
        babies.replaceAll(x -> { var newValue = "baby";
            return newValue; });
        System.out.println(newValue);*/

        //(double m) -> {long p = (long)m; return p;}
    }
}
