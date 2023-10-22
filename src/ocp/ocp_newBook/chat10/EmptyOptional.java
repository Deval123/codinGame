package ocp.ocp_newBook.chat10;

import java.util.Optional;

import static ocp.ocp_newBook.chat10.CreateOptional.average;

/**
 * @author $ Devalère
 * The remaining methods allow you to specify what to do if a value isn’t present.
 * There are a few choices. The first two allow you to specify a return value either directly or using a Supplier.
 **/
public class EmptyOptional {
    public static void main(String[] args){
        Optional<Double> opt = average();
         System.out.println(opt.orElse(Double.NaN));
         System.out.println(opt.orElseGet(() -> Math.random()));
         /**
          * Alternatively, we can have the code throw an exception if the Optional is empty.
          *  Optional<Double> opt = average();
          *  System.out.println(opt.orElseThrow());
          *  This prints something like the following:
          * Exception in thread "main" java.util.NoSuchElementException:
          * No value present
          * at java.base/java.util.Optional.orElseThrow(Optional.java:382)
          * Without specifying a Supplier for the exception, Java will throw a
          * NoSuchElementException. */
         EmptyOptional emptyOptional = new EmptyOptional();
        emptyOptional.lastTest();
    }

    /**
     * Without specifying a Supplier for the exception, Java will throw a
     * NoSuchElementException. Alternatively, we can have the code throw a custom exception
     * if the Optional is empty. Remember that the stack trace looks weird because the lambdas are
     * generated rather than named classes.
     * 30: Optional<Double> opt = average();
     * 31: System.out.println(opt.orElseThrow(
     * 32: () -> new IllegalStateException()));
     * This prints something like the following:
     * Exception in thread "main" java.lang.IllegalStateException
     * at optionals.Methods.lambda$orElse$1(Methods.java:31)
     * at java.base/java.util.Optional.orElseThrow(Optional.java:408)
     * Line 32 shows using a Supplier to create an exception that should be thrown. Notice
     * that we do not write throw new IllegalStateException(). The orElseThrow()
     * method takes care of actually throwing the exception when we run it.
     * The two methods that take a Supplier have different names. Do you see why this code
     * does not compile?
     * System.out.println(opt.orElseGet(
     * () -> new IllegalStateException())); // DOES NOT COMPILE*/

    public void lastTest(){
        Optional<Double> opt = average(90, 100);
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(() -> Math.random()));
        System.out.println(opt.orElseThrow());
    }
}
