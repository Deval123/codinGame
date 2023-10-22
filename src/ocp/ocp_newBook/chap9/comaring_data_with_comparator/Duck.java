package ocp.ocp_newBook.chap9.comaring_data_with_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author $ Devalère
 * Sometimes you want to sort an object that did not implement Comparable, or you want to
 * sort objects in different ways at different times. Suppose that we add weight to our Duck class.
 * We now have the following:
 *
 * Here, we do show
 * the import to call attention to the fact that Comparable and Comparator are in different
 * packages: java.lang and java.util, respectively. That means Comparable can be used
 * without an import statement, while Comparator cannot.
 **/


public class Duck implements Comparable<Duck> {
    private String name;
    private int weight;

    // Assume getters/setters/constructors provided

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }

    public static void main(String[] args) {
        Comparator<Duck> byWeight = new Comparator<Duck>() {
            public int compare(Duck d1, Duck d2) {
                return d1.getWeight() - d2.getWeight();
            }
        };
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks);
        System.out.println(ducks); // [Puddles, Quack]
        Collections.sort(ducks, byWeight);
        System.out.println(ducks); // [Quack, Puddles]
    }
}

/**Comparator is a functional interface since there is only one abstract method to implement.
 This means that we can rewrite the Comparator on lines 18–22 using a lambda expression, as
 shown here:
 Comparator<Duck> byWeight = (d1, d2) -> d1.getWeight()-d2.getWeight();
 Alternatively, we can use a method reference and a helper method to specify that we want
 to sort by weight.
 Comparator<Duck> byWeight = Comparator.comparing(Duck::getWeight);
 */