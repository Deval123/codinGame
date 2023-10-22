package ocp.ocp_newBook.chap9.working_with_generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $ Devalère
 * An unbounded wildcard represents any data type. You use ? when you want to specify that any type is okay with you.
 * Let’s suppose that we want to write a method that looks through a list of any type.
 **/
public class UnboundedWildcards {

    public static void printList(List<Object> list) {
        for (Object x : list)
            System.out.println(x);
    }

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
        //  printList(keywords); // DOES NOT COMPILE
        printList1(keywords);// DOES  COMPILE
/**     Wait. What’s wrong? A String is a subclass of an Object. This is true. However,
 List<String> cannot be assigned to List<Object>. We know, it doesn’t sound logical.
 Java is trying to protect us from ourselves with this one.*/

         List<Integer> numbers = new ArrayList<>();
         numbers.add(Integer.valueOf(42));
//         List<Object> objects = numbers; // DOES NOT COMPILE
//         objects.add("forty two");
         System.out.println(numbers.get(1));
    }

 //   The following code does what we expect:
    public static void printList1(List<?> list) {
        for (Object x: list)
            System.out.println(x);
    }
}
/**
 * Finally, let’s look at the impact of var. Do you think these two statements are
 * equivalent?
 * List<?> x1 = new ArrayList<>();
 * var x2 = new ArrayList<>();
 * They are not. There are two key differences. First, x1 is of type List, while x2 is of type
 * ArrayList. Additionally, we can only assign x2 to a List<Object>. These two variables
 * do have one thing in common. Both return type Object when calling the get() method.
 * */