package ocp.static_initializer;
import java.util.*;

/**
 * @author $ Devalère
 **/

class Fruit {}
class Apple extends Fruit {}

public class RQ100_15 {
    public static void main(String[] args) {
       // List<? extends Apple> lst1 = new ArrayList<Fruit>(); // (1)
        List<? extends Fruit> lst2 = new ArrayList<Apple>(); // (2)
        List<? super Apple> lst3 = new ArrayList<Fruit>(); // (3)
        //List<? super Fruit> lst4 = new ArrayList<Apple>(); // (4)
        //List<?> lst5 = lst1; // (5)
        List<?> lst6 = lst3; // (6)
        List lst7 = lst6; // (7)
        List<?> lst8 = lst7; // (8)
    }
}
class RQ100_11 {
    public static void main(String[] args) {
        Set set = new TreeSet<String>();
        set.add("one");
        set.add(2);
        set.add("three");
        System.out.println(set);
    }
}
class RQ100_00 {
    public static void main(String[] args) {
        List<String> lst1 = new ArrayList<>();
        List<Integer> lst2 = new ArrayList<>();
        List<List<Integer>> lst3 = new ArrayList<>();
        System.out.print(lst1.getClass() + ", ");
        System.out.print(lst2.getClass() + ", ");
        System.out.println(lst3.getClass());
    }
}
