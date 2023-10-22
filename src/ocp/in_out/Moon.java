package ocp.in_out;

import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 **/
public class Moon {
    private volatile AtomicLong green = new AtomicLong(0);
    private volatile int cheese = 0;
    private volatile int rocket = 0;
    private void takeOff() {
        Stream.iterate(0, x -> x + 1).parallel().limit(1000).forEach(q -> {
            green.getAndIncrement();
            cheese++;
            synchronized (this) {
                ++rocket;
            }
        });
        System.out.println(green + "," + cheese + "," + rocket);
    }
    public static void main(String[] tent) {
        new Moon().takeOff();
    } }