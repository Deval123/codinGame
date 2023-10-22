package ocp.exception;

/**
 * @author $ Devalère
 **/
public class ExceptionPropagationExample {

    public static void main(String[] args) {
        try {
            performCalculation();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    public static void performCalculation() {
        try {
            int result = divideNumbers(10, 0);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return dividend / divisor;
    }
}
/*
In this example, we have three methods: main(), performCalculation(), and divideNumbers().
The performCalculation() method calls the divideNumbers() method to perform a division operation.

In the divideNumbers() method, we check if the divisor is zero. If it is, we throw an IllegalArgumentException with
a corresponding error message. This exception is specific to an invalid argument being passed to the method.

Back in the performCalculation() method, we catch the IllegalArgumentException and print a message indicating that
it has been caught.

In the main() method, we call performCalculation(), and since a IllegalArgumentException is thrown, it is caught and
 suppressed within the method. Therefore, the program continues execution without disruption.

However, if we encounter an ArithmeticException in the divideNumbers() method (e.g., dividing by zero),
it is not caught within the method. Instead, it propagates up the call stack to the performCalculation() method,
which also does not catch it. Finally, it reaches the main() method, where it is caught and the corresponding error
message is printed.

Output:

csharp
Copy code
ArithmeticException caught: / by zero
In this example, the IllegalArgumentException was suppressed within the performCalculation() method,
while the ArithmeticException was propagated up the call stack until it reached a higher-level exception handler in
the main() method.*/