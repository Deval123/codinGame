package ocp.ocp_newBook.chap8.convenienceMethods;

import java.util.function.Predicate;

/**
 * @author $ Devalère
 **/
public class ConvPredicate {
    // Let’s start with these two Predicate variables:
    Predicate<String> egg = s -> s.contains("egg");
    Predicate<String> brown = s -> s.contains("brown");

    /*    Now we want a Predicate for brown eggs and another for all other colors of eggs. We
        could write this by hand, as shown here:*/
    Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
    Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");
    /*    What if we decide the letter e should be capitalized in egg? We’d have to change it in three variables:
        egg, brownEggs, and otherEggs. A better way to deal with this situation is to use two of the default methods on Predicate.*/
    Predicate<String> brownEggs1 = egg.and(brown);
    Predicate<String> otherEggs1 = egg.and(brown.negate());
}
