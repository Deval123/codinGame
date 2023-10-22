package ocp.ocp_newBook.chap9;

import java.util.HashSet;
import java.util.Set;

/**
 * @author $ Devalère
 **/
public class WorkingWithSetMethods {
    public static void main(String[] args){
        //Like a List, you can create an immutable Set in one line or make a copy of an existing one.
        //Set<Character> letters = Set.of('z', 'o', 'o');
        //Set<Character> copy = Set.copyOf(letters);
/*      Those are the only extra methods you need to know for the Set interface for the exam!
        You do have to know how sets behave with respect to the traditional Collection methods.
        You also have to know the differences between the types of sets. Let’s start with HashSet:*/
         Set<Integer> set = new HashSet<>();
         boolean b1 = set.add(66); // true
         boolean b2 = set.add(10); // true
         boolean b3 = set.add(66); // false
         boolean b4 = set.add(8); // true
         set.forEach(System.out::println);
    }
}
