package ocp.chater2;

/**
 * @author $ Devalère
 **/
import java.util.*;
import java.util.function.Predicate;
import java.util.function.Supplier;

record Boss(String name) {
    @Override public String toString() {
        return name.toUpperCase();
    }

/*    public boolean equalsIgnoreCase(String s) {
        return name.equalsIgnoreCase(s);
    }*/
}
public class Initech {
    public static void main(String[] reports) {
        final List<Boss> bosses = new ArrayList(8);
        bosses.add(new Boss("Peter"));
        bosses.add(new Boss("Samir"));
        bosses.add(new Boss("Michael"));
        //bosses.removeIf(s -> s.equalsIgnoreCase("samir"));
        System.out.print(bosses);

/*         Comparator<String> c1 = s -> false;
         Comparator<String, String> c2 = (s1, s2) -> false;
         Predicate<String> p1 = String s -> false;
         Predicate<String> p2 = (String s) -> false;
         Supplier<String> s1 = String s -> false;
         Supplier<String> s2 = (String s) -> false;*/
    }
}
/*
public interface Serval {
    static void printName(String name) {}
    boolean cat(String name) { return true; }
}*/
