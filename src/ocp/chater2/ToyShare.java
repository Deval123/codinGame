package ocp.chater2;

import java.util.stream.Stream;

/**
 * @author $ Devalère
 **/
public class ToyShare {


     void shareToys() {
         record Toy(String name){ }

         var toys = Stream.of(
                 new Toy("Jack in the Box"),
                 new Toy("Slinky"),
                 new Toy("Yo-Yo"),
                 new Toy("Rubik's Cube"));

         var spliterator = toys.spliterator();
         var batch = spliterator.trySplit();

         var more = batch.tryAdvance(x -> {});
         System.out.println(more);
         spliterator.tryAdvance(System.out::println);
         }
}
