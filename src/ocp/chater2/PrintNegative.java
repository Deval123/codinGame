package ocp.chater2;

/**
 * @author $ Devalère
 **/
 import java.sql.DriverManager;
 import java.sql.SQLException;
 import java.util.*;
 import java.util.function.IntFunction;

public class PrintNegative {
 public static void main(String[] args) {
         List<String> list = new ArrayList<>();
         list.add("-5");
         list.add("0");
         list.add("5");
         //list.removeIf(e -> e < 0);
         list.forEach(x -> System.out.println(x));

/*      IntFunction<Integer> f1 =(Integer f) -> f;
      IntFunction<Integer> f2 = (v) -> null;
      IntFunction<Integer> f3 = s -> s;
      IntFunction<Integer> f4 = () -> 5;
      IntFunction<Integer> f5 = () -> Integer.valueOf(9);*/
     List.of("one", "two", "bloat")
             .stream()
             .limit(1)
             .map(String::toUpperCase) // line x
             .sorted()
             .forEach(System.out::println);


 }
 }
