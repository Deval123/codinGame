package ocp.ocp_newBook.chap9;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @author $ Devalère
 **/
public class CollectionIterating {
    /*There’s a forEach() method that you can call on a Collection instead of writing a loop. It uses a
Consumer that takes a single parameter and doesn’t return anything. The method signature is
as follows: public void forEach(Consumer<? super T> action)*/
    public static void main(String[] args) {
        //Cats like to explore, so let’s print out two of them using both method references and lambdas:
        Collection<String> cats = List.of("Annie", "Ripley");
        cats.forEach(System.out::println);
        System.out.println("*******");
        cats.forEach(c -> System.out.println(c));
        //The cats have discovered how to print their names. Now they have more time to play (as do we)!


/*        There are other ways to iterate through a Collection. For example, in Chapter 3, “Making
        Decisions,” you saw how to loop through a list using an enhanced for loop.*/
        for (String element : cats)
            System.out.println(element);
        //You may see another older approach used.
        System.out.println("*******");
        Iterator<String> iter = cats.iterator();
        while (iter.hasNext()) {
            String string = iter.next();
            System.out.println(string);
        }
/*        Pay attention to the difference between these techniques. The hasNext() method checks
        whether there is a next value. In other words, it tells you whether next() will execute
        without throwing an exception. The next() method actually moves the Iterator to the
        next element.*/
    }
}
