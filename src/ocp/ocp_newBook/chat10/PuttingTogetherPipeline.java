package ocp.ocp_newBook.chat10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 * Streams allow you to use chaining and express what you want to accomplish rather thanhow to do so.
 * Let’s say that we wanted to get the first two names of our friends alphabetically that are four characters long.
 **/
public class PuttingTogetherPipeline {
    public static void main(String[] args) {
        // Without streams, we’d have to write something like the following:

        var list = List.of("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name : list)
            if (name.length() == 4) filtered.add(name);
        Collections.sort(filtered);
        var iter = filtered.iterator();
        if (iter.hasNext()) System.out.println(iter.next());
        if (iter.hasNext()) System.out.println(iter.next());
/*        This works. It takes some reading and thinking to figure out what is going on. The
        problem we are trying to solve gets lost in the implementation. It is also very focused on the
        how rather than on the what. With streams, the equivalent code is as follows:*/
        var list1 = List.of("Toby", "Anna", "Leroy", "Alex");
        list1.stream().filter(n -> n.length() == 4).sorted()
                .limit(2).forEach(System.out::println);
        //   Before you say that it is harder to read, we can format it.
        var list2 = List.of("Toby", "Anna", "Leroy", "Alex");
        list2.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);

        // Let’s try a few more examples to make sure that you understand this well.
        // What do you think the following does?
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
/*        It hangs until you kill the program, or it throws an exception after running out of
        memory. The foreperson has instructed sorted() to wait until everything to sort is present.
        That never happens because there is an infinite stream. What about this example?*/
        Stream.generate(() -> "Elsa")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
/*        This one prints Elsa twice. The filter lets elements through, and limit() stops the earlier operations after two elements. Now sorted() can sort because we have a finite list.
        Finally, what do you think this does?*/
        Stream.generate(() -> "Olaf Lazisson")
                .filter(n -> n.length() == 4)
                .limit(2)
                .sorted()
                .forEach(System.out::println);
/*        This one hangs as well until we kill the program. The filter doesn’t allow anything
        through, so limit() never sees two elements. This means we have to keep waiting and hope
        that they show up.*/


        /**You can even chain two pipelines together. See if you can identify the two sources and
         two terminal operations in this code.
         */
        long count = Stream.of("goldfish", "finch")
         .filter(s -> s.length() > 5)
         .collect(Collectors.toList())
         .stream()
         .count();
        System.out.println(count); // 1
        /**
         * The 3 first lines are one pipeline, and lines 33 and 34 are another. For the first pipeline, line
         * 30 is the source, and the 2 last line are the terminal operation. For the second pipeline, line 33 is the
         * source, and line 34 is the terminal operation. Now that’s a complicated way of outputting the number 1!
         */
    }
}
