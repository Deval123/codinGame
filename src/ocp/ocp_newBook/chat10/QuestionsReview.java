package ocp.ocp_newBook.chat10;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.*;

/**
 * @author $ Devalère
 **/
public class QuestionsReview {
    public static void main(String[] args) {
/*        var stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));*/

/*        System.out.println("***");
        Predicate<String> predicate = s -> s.startsWith("g");
        var stream1 = Stream.generate(() -> "growl!");
        var stream2 = Stream.generate(() -> "growl!");
        var b1 = stream1.anyMatch(predicate);
        var b2 = stream2.allMatch(predicate);
        System.out.println(b1 + " " + b2);*/


/*        Predicate<String> predicate = s -> s.length()> 3;
        var stream = Stream.iterate("-",
                s -> ! s.isEmpty(), (s) -> s + s);
        var b1 = stream.noneMatch(predicate);
        var b2 = stream.anyMatch(predicate);
        System.out.println(b1 + " " + b2);*/


/*        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));*/

/*        double result = LongStream.of(6L, 8L, 10L)
                .mapToInt(x -> (int) x)
                .boxed()
                .collect(Collectors.groupingBy(x -> x, Collectors.toSet()))
                .keySet()
                .stream()
                .collect(Collectors.averagingInt(x -> x));
        System.out.println(result);*/

/*        var s = Stream.generate(() -> "meow");
        var match = s.anyMatch (String::isEmpty); //allMatch
        System.out.println(match);*/

/*        var stream = LongStream.of(1, 2, 3);
         var opt = stream.map(n -> n * 10)
         .filter(n -> n < 5).findFirst();
        opt.ifPresent(System.out::println);*/

/*        Stream.generate(() -> "1")
                //.filter(x -> x.length() > 1)
                //.peek(System.out::println)
                .limit(10)
                .forEach(System.out::println);*/
/*        String result = Stream.iterate(1, x -> ++x)
                .limit(5).map(x -> ""+x)
                .collect(Collectors.joining());
        System.out.println(result);*/

/*        Set<String> birds = Set.of("oriole", "flamingo");
        Stream.concat(birds.stream(), birds.stream(), birds.stream())
                .sorted() // line X
                .distinct()
                .findAny()
                .ifPresent(System.out::println);*/

/*        List<Integer> x1 = List.of(1, 2, 3);
        List<Integer> x2 = List.of(4, 5, 6);
        List<Integer> x3 = List.of();
        Stream.of(x1, x2, x3).map(x -> x + 1)
                .flatMap(x -> x.stream())
                .forEach(System.out::print);*/

/*         Stream<Integer> s = Stream.of(1);
         IntStream is = s.boxed();
         DoubleStream ds = s.mapToDouble(x -> x);
         Stream<Integer> s2 = ds.mapToInt(x -> x);
         s2.forEach(System.out::print);*/

/*        var s = DoubleStream.of(1.2, 2.4);
        s.peek(System.out::println).filter(x -> x> 2).count();*/

/*        List<Integer> x = IntStream.range(1, 6)
                .mapToObj(i -> i)
                .collect(Collectors.toList());
        x.forEach(System.out::println);*/
      //  IntStream.range(1, 6).forEach(System.out::println);
/*        IntStream.range(1, 6)
                .mapToObj(i -> i)
                .forEach(System.out::println);*/

        var spliterator = Stream.generate(() -> "x")
                .spliterator();
        spliterator.tryAdvance(System.out::print);
        var split = spliterator.trySplit();
        split.tryAdvance(System.out::print);
    }

/*
    void test(){
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        var result = Stream.generate(() -> "")
                .limit(10)
                .filter(notEmpty)
                .collect(Collectors.groupingBy(k -> k))
                .entrySet()
                .stream()
                .map(Entry::getValue)
                .flatMap(Collection::stream)
                .collect(Collectors.partitioningBy(notEmpty));
        System.out.println(result);
    }
*/
}
