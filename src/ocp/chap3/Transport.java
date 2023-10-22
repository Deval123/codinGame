package ocp.chap3;

/**
 * @author $ Devalère
 **/
interface Vehicle {}
class Bus implements Vehicle {}
public class Transport {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        Bus bus = new Bus();
        boolean n = null instanceof Bus;
        boolean v = vehicle instanceof Vehicle;
        boolean b = vehicle instanceof Bus;
        boolean b1 = bus  instanceof Vehicle;
        System.out.println(n + " " + v + " " + b+ " " + b1);
    } }
