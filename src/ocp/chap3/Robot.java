package ocp.chap3;

/**
 * @author $ Devalère
 **/
/*public class Robot {
    public static final void apply(
            Bend instruction, double input) {
        instruction.bend(input);
    }

    public static void main(String... future) {
        final Robot r = new Robot();
        r.apply(x -> System.out.print(x + " bent!"), 5);
        Supplier<double> s = Ready::getNumber;
    }
}*/
import java.util.function.*;
import java.util.stream.*;
public class Robot {
    public static void main(String[] args) {
        var hide = Stream.of(true, false, true);
        Predicate<Boolean> pred = b -> b;
        var found = hide.filter(pred).allMatch (pred);
        System.out.println(found);
    } }