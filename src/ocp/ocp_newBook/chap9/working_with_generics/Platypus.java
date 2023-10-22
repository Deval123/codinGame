package ocp.ocp_newBook.chap9.working_with_generics;

import java.util.*;

/**
 * @author $ Devalère
 **/
public record Platypus(String name, int beakLength) {
    @Override
    public String toString() {
        return "" + beakLength;
    }

    public static void main(String[] args) {
        Platypus p1 = new Platypus("Paula", 3);
        Platypus p2 = new Platypus("Peter", 5);
        Platypus p3 = new Platypus("Peter", 7);
        List<Platypus> list = Arrays.asList(p1, p2, p3);

        //Collections.sort(list, Comparator.comparing(Platypus::beakLength));
        //Collections.sort(list, Comparator.comparing(Platypus::beakLength).reversed());
        //Collections.sort(list, Comparator.comparing(Platypus::name).thenComparing(Platypus::beakLength));
        //Collections.sort(list, Comparator.comparing(Platypus::name).thenComparing(Comparator.comparing(Platypus::beakLength).reversed()));
        //Collections.sort(list, Comparator.comparing(Platypus::name).thenComparing(Platypus::beakLength).reversed());
        Collections.sort(list, Comparator.comparing(Platypus::name).thenComparingInt(Platypus::beakLength).reversed());

        System.out.println(list);
    }
}
