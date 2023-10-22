package ocp.ocp_newBook.chap9.working_with_generics;

import java.util.List;

/**
 * @author $ Devalère
 * With a lower bound, we are telling Java that the list will be a list of String objects or a
 * list of some objects that are a superclass of String. Either way, it is safe to add a String to
 * that list.
 * Just like generic classes, you probably won’t use this in your code unless you are writing
 * code for others to reuse. Even then, it would be rare. But it’s on the exam, so now is the time
 * to learn it!
 **/
public class LowerBoundedWildcards {
    public static void addSound(List<? super String> list) {
        list.add("quack");

         List<?> q = List.of("mouse", "parrot");
         var v = List.of("mouse", "parrot");

/*         q.removeIf(String::isEmpty);
         q.removeIf(s -> s.length() == 4);
         v.removeIf(String::isEmpty);
         v.removeIf(s -> s.length() == 4);*/
    }

    /**
     * Understanding Generic Supertypes
     * When you have subclasses and superclasses, lower bounds can get tricky.
     * 3: List<? super IOException> exceptions = new ArrayList<Exception>();
     * 4: exceptions.add(new Exception()); // DOES NOT COMPILE
     * 5: exceptions.add(new IOException());
     * 6: exceptions.add(new FileNotFoundException());
     * Line 3 references a List that could be List<IOException> or List<Exception> or
     * List<Object>. Line 4 does not compile because we could have a List<IOException>,
     * and an Exception object wouldn’t fit in there.
     * Line 5 is fine. IOException can be added to any of those types. Line 6 is also fine.
     * FileNotFoundException can also be added to any of those three types. This is tricky
     * because FileNotFoundException is a subclass of IOException, and the keyword says
     * super. Java says, “Well, FileNotFoundException also happens to be an IOException,
     * so everything is fine.
     * */
}
