package ocp.ocp_newBook.chap9.comparable;

/**
 * @author $ Devalère
 **/

import java.util.*;

public class Duck implements Comparable<Duck> {
    private String name;

    public Duck(String name) {
        this.name = name;
    }

    public String toString() { // use readable output
        return name;
    }

    public int compareTo(Duck d) {
        return name.compareTo(d.name); // sorts ascendingly by name
    }

    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        Collections.sort(ducks); // sort by name
        System.out.println(ducks); // [Puddles, Quack]
    }

    /**Without implementing that interface, all we have is a method named compareTo(), but
     it wouldn’t be a Comparable object. We could also implement Comparable<Object> or
     some other class for T, but this wouldn’t be as useful for sorting a group of Duck objects.*/
}