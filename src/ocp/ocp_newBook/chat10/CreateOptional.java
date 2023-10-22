package ocp.ocp_newBook.chat10;

import java.util.Optional;

/**
 * @author $ Devalère
 **/
public class CreateOptional {
    //Creating an Optional
    //Here’s how to code our average method:
         public static Optional<Double> average(int... scores) {
         if (scores.length == 0) return Optional.empty();
         int sum = 0;
         for (int score: scores) sum += score;
         return Optional.of((double) sum / scores.length);
         }

         public static void main(String [] args){
             //Calling the method shows what is in our two boxes:
             System.out.println(average(90, 100)); // Optional[95.0]
             System.out.println(average()); // Optional.empty
             Optional<Double> opt = average(90, 100);
             if (opt.isPresent())
                 System.out.println(opt.get()); // 95.0

             /**
              * First we check whether the Optional contains a value. Then we print it out.
              * What if we didn’t do the check, and the Optional was empty?
              * Optional<Double> opt = average();
              * System.out.println(opt.get()); // NoSuchElementException
              * We’d get an exception since there is no value inside the Optional.
              * java.util.NoSuchElementException: No value presentt
              * When creating an Optional, it is common to want to use empty() when the value is
              * null. You can do this with an if statement or ternary operator. We use the ternary operator
              * (? :) to simplify the code, which you saw in Chapter 2, “Operators.”
              * Optional o = (value == null) ? Optional.empty() : Optional.of(value);
              * If value is null, o is assigned the empty Optional. Otherwise, we wrap the value.
              * Since this is such a common pattern, Java provides a factory method to do the same thing.
              * Optional o = Optional.ofNullable(value);*/

             Optional<Double> opt1 = average(90, 100);
             opt1.ifPresent(System.out::println);
             /*Using ifPresent() better expresses our intent. We want something done if a value is
             present. You can think of it as an if statement with no else.*/
         }
}
