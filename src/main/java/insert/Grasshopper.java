package main.java.insert;

import main.java.animal.Hopper;

/**
 * @author $ Devalère
 **/
// Grasshopper.java
public class Grasshopper extends Hopper {
    public void move() {
        hop(); // p1
    }
    public static void main(String[] args) {
        var hopper = new Grasshopper();
        hopper.move(); // p2
        hopper.hop(); // p3
    } }
