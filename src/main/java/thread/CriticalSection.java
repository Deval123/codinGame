package main.java.thread;

import java.io.File;
import java.nio.file.FileVisitor;
import java.nio.file.Files;

/**
 * @author $ Devalère
 **/
public class CriticalSection {

    /*You can declare a method as a critical section by using the keyword synchronized
before the method’s return type, as shown:*/
    public synchronized void someMethod_1() {
// Method code goes here
    }
    public static synchronized void someMethod_2() {
// Method code goes here
    }
}
/*Note You can declare both an instance method and a static method as
synchronized. a constructor cannot be declared as synchronized. a constructor
is called only once by only one thread, which is creating the object. so it makes no
sense to synchronize access to a constructor.*/