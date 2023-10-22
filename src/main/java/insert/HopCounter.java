package main.java.insert;


import main.java.animal.Hopper;

/**
 * @author $ Devalère
 **/
public class HopCounter extends Grasshopper {
    public static void main(String[] args) {

        var hopper = new Grasshopper();
        var hopper1 = new HopCounter();
        hopper.move(); // p2
        //hopper.hop(); // p3
        hopper1.hop(); // p3
    }
}