package ocp.ocp_newBook.chap9.comparable;

/**
 * @author $ Devalère
 **/

/**
 * ■ The number 0 is returned when the current object is equivalent to the argument to
 * compareTo().
 * ■ A negative number (less than 0) is returned when the current object is smaller than the
 * argument to compareTo().
 * ■ A positive number (greater than 0) is returned when the current object is larger than the
 * argument to compareTo().
 * Let’s look at an implementation of compareTo() that compares numbers instead of String objects:
 * Remember that id - a.id sorts in ascending order, and a.id - id sorts in descending order.
 */

public class Animal implements Comparable<Animal> {
    private int id;

    public int compareTo(Animal a) {
        return id - a.id; // sorts ascending by id
    }

    public static void main(String[] args) {
        var a1 = new Animal();
        var a2 = new Animal();
        a1.id = 5;
        a2.id = 7;
        System.out.println(a1.compareTo(a2)); // -2
        System.out.println(a1.compareTo(a1)); // 0
        System.out.println(a2.compareTo(a1)); // 2
    }
}