package ocp.ocp_newBook.chap8.exercice;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author $ Devalère
 **/
public class Climber {
    public static void main(String[] args) {
        //check((h, m) -> h.append(m).isEmpty(), 5);
    }

    private static void check(Climb climb, int height) {
        if (climb.isTooHigh(height, 10))
            System.out.println("too high");
        else
            System.out.println("ok");
    }

    public void method() {
        x((var x) -> {}, (var x, var y) -> false);
    }
    public void x(Consumer<String> x, BinaryOperator<Boolean> y) {}

    public void remove(List<Character> chars) {
        char end = 'z';
        Predicate<Character> predicate = c -> {char start = 'a'; return start <= c && c <= end; };
// INSERT LINE HERE
        chars = null;
        char c = 'x';
        char start = 'a';
        //end = '1';
    }
}