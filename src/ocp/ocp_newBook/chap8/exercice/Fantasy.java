package ocp.ocp_newBook.chap8.exercice;

/**
 * @author $ Devalère
 **/
import java.util.function.Function;
import java.util.function.Supplier;

public class Fantasy {
    public static void scary(String animal) {
/*        var dino = s -> "dino".equals(animal);
        var dragon = s -> "dragon".equals(animal);
        var combined = dino.or(dragon);
        System.out.println(combined.test(animal));*/
    }
    public static void main(String[] args) {
        scary("dino");
        scary("dragon");
        scary("unicorn");
        Function<Integer, Integer> s = a -> a + 4;
        Function<Integer, Integer> t = a -> a * 3;
        Function<Integer, Integer> c = s.compose(t);
        System.out.print(c.apply(1));
        System.out.println("\n");

        int length = 3;
        for (int i = 0; i<3; i++) {
            if (i%2 == 0) {
                Supplier<Integer> supplier = () -> length; // A
                System.out.println(supplier.get()); // B
            } else {
                int j = i;
                Supplier<Integer> supplier = () -> j; // C
                System.out.println(supplier.get()); // D
            }
        }
    }
}
