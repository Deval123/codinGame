package ocp.static_initializer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author $ Devalère
 **/
public class Initialization {
    private static String msg(String msg) {
        List<String> wordList = new ArrayList<>(); // Using a specif
        wordList.add("two zero two zero"); // Can add string
        //wordList.add(2020); // Compile-time e
//...
        String element = wordList.get(0); // Always returns
//...

        System.out.println(msg);
        return msg;
    }
    public Initialization() { m = msg("1"); }
    { m = msg("2"); }
    String m = msg("3");
    public static void main(String[] args) {
        Object obj = new Initialization();
    }
}

 class  RQ100_70 {
    public static void main(String[] args) {
        List<Integer> glst1 = new ArrayList(); //(1)
        List nglst1 = glst1; //(2)
        List nglst2 = nglst1; //(3)
        List<Integer> glst2 = glst1; //(4)
    }

}

 class Box<T> {
    private T item; // (1)
    //private static T[] storage = new T[100]; // (2)
    public Box(T item) { this.item = item; } // (3)
    public T getItem() { return item; } // (4)
    public void setItem(T newItem) { item = newItem; } // (5)
/*    public static void getAllItems(T newItem) { // (6)
        T temp; // (7)
    }*/

     Map<Integer, HashMap<Integer, String>> map2 = new HashMap<>();
     Map<Integer, Integer> map3 = new HashMap<Integer, Integer>();
     Map<? super Integer, ? super Integer> map5 = new
             HashMap<Number, Number>();
     Map<? extends Number, ? extends Number> map6
             = new HashMap<Number, Number>(); }
