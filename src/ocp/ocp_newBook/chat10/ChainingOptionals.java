package ocp.ocp_newBook.chat10;

import java.util.Optional;

/**
 * @author $ Devalère
 **/
public class ChainingOptionals {
    public static void main(String[] args){
        ChainingOptionals chainingOptionals = new ChainingOptionals();
        threeDigit(Optional.of(233));

    }
    /*By now, you are familiar with the benefits of chaining operations in a stream pipeline. A few
of the intermediate operations for streams are available for Optional.
Suppose that you are given an Optional<Integer> and asked to print the value, but only if
it is a three-digit number. Without functional programming, you could write the following:*/
    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) { // outer if
            var num = optional.get();
            var string = "" + num;
            if (string.length() == 3) // inner if
                System.out.println(string);
        }
    }

    /*It works, but it contains nested if statements. That’s extra complexity. Let’s try this again
    with functional programming:*/
    private static void threeDigit1(Optional<Integer> optional) {
        optional.map(n -> "" + n) // part 1
                .filter(s -> s.length() == 3) // part 2
                .ifPresent(System.out::println); // part 3
    }
    /*This is much shorter and more expressive. With lambdas, the exam is fond of carving
    up a single statement and identifying the pieces with a comment. We’ve done that here to
    show what happens with both the functional programming and nonfunctional programming
    approaches.*/

    /**
     * Suppose that we are given an empty Optional. The first approach returns false for the outer
     * ifstatement. The second approach sees an empty Optionaland has both map()and filter()pass
     * it through. Then ifPresent() sees an empty Optional and doesn’t call the Consumer parameter.
     * The next case is where we are given an Optional.of(4). The first approach returns
     * false for the inner if statement. The second approach maps the number 4 to "4".
     * The filter() then returns an empty Optional since the filter doesn’t match, and
     * ifPresent() doesn’t call the Consumer parameter.
     * The final case is where we are given an Optional.of(123). The first approach returns
     * true for both if statements. The second approach maps the number 123 to "123".
     * The filter() then returns the same Optional, and ifPresent() now does call the
     * Consumer parameter.*/


/*    Now suppose that we wanted to get an Optional<Integer> representing the length of the
    String contained in another Optional. Easy enough:
    Optional<Integer> result = optional.map(String::length);*/

    /**
     * What if we had a helper method that did the logic of calculating something for us that
     * returns Optional<Integer>? Using map doesn’t work:
     * Optional<Integer> result = optional
     * .map(ChainingOptionals::calculator); // DOES NOT COMPILE
     * The problem is that calculator returns Optional<Integer>. The map() method adds
     * another Optional, giving us Optional<Optional<Integer>>. Well, that’s no good. The
     * solution is to call flatMap(), instead:
     * Optional<Integer> result = optional
     * .flatMap(ChainingOptionals::calculator);
     * This one works because flatMap removes the unnecessary layer. In other words, it flattens the result.
     * Chaining calls to flatMap() is useful when you want to transform one Optional type to another.*/
}
