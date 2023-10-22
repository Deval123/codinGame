package ocp.ocp_newBook.chap9.working_with_generics;

/**
 * @author $ Devalère
 **/

import java.util.*;

public class MyComparator implements Comparator<String> {
    public int compare(String a, String b) {
        return b.toLowerCase().compareTo(a.toLowerCase());
    }

    public static void main(String[] args) {
        //String[] values = { "123", "Abb", "aab" };
        String[] values = {"423", "540", "aab"};
        Arrays.sort(values, new MyComparator());
        for (var s : values)
            System.out.print(s + " ");

        System.out.println("*******");
        var list = List.of(1, 2, 3);
        var set = Set.of(1, 2, 3);
        var map = Map.of(1, 2, 3, 4);
        //list.forEach(System.out::println);
        //set.forEach(System.out::println);
        map.values().forEach(System.out::println);
        map.keySet().forEach(System.out::println);

    }

}
