package multithreading;

/**
 * @author $ Devalère
 **/
public class TreadTester {
    public static void main(String[] args){
        System.out.println("main is starting");

        Thread1 thread1 = new Thread1();
        thread1.run();

        Thread thread2 = new Thread(new Thread2());
        thread2.start();

        System.out.println("main is existing");
    }
}
