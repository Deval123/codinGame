package ocp.chater2;

import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;
import java.util.function.IntToLongFunction;
import java.util.function.UnaryOperator;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 **/
public class Scientist {
    public static void main(String[] courses) {
/*        final Study s = new BiologyMaterial(); // h1
        System.out.print(s.learn(courses[0],
                Integer.parseInt(courses[1])));*/
/*
        List.of(2,4,6,8)
                //.parallel()
                .parallelStream()
                .parallel()
                .forEach(System.out::print);
*/

/*        var s1 = IntStream.empty();
         System.out.print(s1.average().getAsDouble());

         var s2 = IntStream.of(-1,0, 1);
         System.out.print(s2.average().getAsDouble());*/

/*        Stream.of("fish", "mammal", "amphibian")
         .map( x -> x.length() )
         .findFirst()
         .ifPresent(s -> System.out.println(s));*/

        System.out.println(IntStream.of(1, 2).reduce(0, Integer::sum));
        System.out.println(IntStream.of(1, 2).sum());
        System.out.println(Stream.of(1, 2).reduce(0, Integer::sum));
        //System.out.println(Stream.of(1, 2).sum());

        var stream = LongStream.of(9);
        stream. mapToDouble (p -> p).forEach(System.out::println);

    }
}
