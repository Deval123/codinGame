package main.java.thread;

/**
 * @author $ Devalère
 **/
public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello Java threads!");
    }

    // Creating an instance:
    Runnable aRunnableObject = new HelloRunnable();
    /*Instead, you can also use a lambda expression to create an instance of the Runnable
interface:*/
    Runnable aRunnableObJt = () ->
            System.out.println("Hello Java threads!");

    /*Create an object of the Thread class using the constructor that accepts a Runnable
object:*/
    Thread myThread = new Thread(aRunnableObject);
}
