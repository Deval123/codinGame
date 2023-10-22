package ocp.ocp_newBook.chap9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author $ Devalère
 **/
public class WorkingWithListMethods {
    public static void main(String[] args) {
        //    The following statements demonstrate most of these methods for working with a List:
        List<String> list = new ArrayList<>();
        list.add("SD"); // [SD]
        list.add(0, "NY"); // [NY,SD]
        list.set(1, "FL"); // [NY,FL] remember that set replace the element at the specific index
        System.out.println(list.get(0)); // NY
        list.remove("NY"); // [FL]
        list.remove(0); // []
        //list.set(0, "?"); // IndexOutOfBoundsException.

/*        Now let’s take a look at the replaceAll() method. It uses a UnaryOperator that takes one
        parameter and returns a value of the same type:*/
        var numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(x -> x*3);
        System.out.println(numbers); // [2, 4, 6]
/*        This lambda doubles the value of each element in the list. The replaceAll() method
        calls the lambda on each element of the list and replaces the value at that index.*/
    }
}
