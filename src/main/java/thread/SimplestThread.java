package main.java.thread;
/*The start() method returns after doing some housekeeping work. It puts the thread
in the runnable state. In this state, the thread is ready to receive the CPU time. Note that
invoking the start() method of a Thread object does not guarantee “when” this thread
will start getting the CPU time. That is, it does not guarantee when the thread will start
running. It just schedules the thread to receive the CPU time.*/
/**
 * @author $ Devalère
 **/
public class SimplestThread {

    public static void main(String [] args){
        // Creates a thread object
        Thread simplestThread = new Thread();
        // Starts the thread
        simplestThread.start();
    }
}
