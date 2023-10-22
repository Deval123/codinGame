package ocp.chater2;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 **/
public class Summary {
    public static void main(String[] args) {
        record Pet(int age) {}
        record PetSummary(long count, int sum) {}
        var summary = Stream.of(new Pet(2), new Pet(5), new Pet(8))
                .collect(Collectors.teeing(
                        Collectors.counting(),
                        Collectors.summingInt(Pet::age),
                        PetSummary::new));
        System.out.println(summary);

/*        var s = "fish";
        Predicate<String> pred = s::contains;
        System.out.println(pred.test("is"));*/

        Predicate<String> pred1 = (final String s) -> s.isEmpty();
        //Predicate<String> pred2 = (final s) -> s.isEmpty();
        Predicate<String> pred3 = (final var s) -> s.isEmpty();
        Predicate<String> pred4 = (String s) -> s.isEmpty();
        Predicate<String> pred5 = (var s) -> s.isEmpty();

/*
        var p = List.of(1,3,5);
        var q = p.parallelStream().reduce(0f,
                (w,x) -> w.floatValue() + x.floatValue(),
                (y,z) -> y.floatValue() + z.floatValue());
        System.out.println(q);
*/

        Set<String> set = new HashSet<>();
        set.add("tire-");
        List<String> list = new LinkedList<>();
        Deque<String> queue = new ArrayDeque<>();
        queue.push("wheel-");
        Stream.of(set, list, queue)
                .flatMap(x -> x.stream())
                .forEach(System.out::print);
    }
}
