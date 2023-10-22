package main.java.thread;

/**
 * @author $ Devalère
 **/
public class ThreadTest {
    public static void execute() {
        System.out.println("Hello Java threads!");
    }

    public static void main(String [] args){
        Thread myThread = new Thread(ThreadTest::execute);
        myThread.start();
    }
}
