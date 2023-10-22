package ocp.ocp_newBook.chat10;

import java.util.List;
import java.util.Spliterator;

/**
 * @author $ Devalère
 **/
public class UsingSpliterator {
    public static void main(String[] args){
//       Now let’s look at an example where we divide the bag into three:
         var stream = List.of("bird-", "bunny-", "cat-", "dog-", "fish-", "lamb-", "mouse-");
         Spliterator<String> originalBagOfFood = stream.spliterator();
         Spliterator<String> emmasBag = originalBagOfFood.trySplit();
         emmasBag.forEachRemaining(System.out::print); // bird-bunny-cat-

         Spliterator<String> jillsBag = originalBagOfFood.trySplit();
         jillsBag.tryAdvance(System.out::print); // dog-
         jillsBag.forEachRemaining(System.out::print); // fish-

         originalBagOfFood.forEachRemaining(System.out::print); // lamb-mouse

        /**
         * On lines 12 and 13, we define a List. Lines 14 and 15 create two Spliterator references. The first is the original bag, which contains all seven elements. The second is our split
         * of the original bag, putting roughly half of the elements at the front into Emma’s bag. We
         * then print the three contents of Emma’s bag on line 16.
         * Our original bag of food now contains four elements. We create a new Spliterator on
         * line 18 and put the first two elements into Jill’s bag. We use tryAdvance() on line 19 to
         * output a single element, and then line 20 prints all remaining elements (just one left!).
         * We started with seven elements, removed three, and then removed two more. This leaves
         * us with two elements in the original bag created on line 14. These two items are output
         * on line 22.*/
    }
}
