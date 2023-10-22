package ocp.dateTime;

import java.time.LocalDate;
import java.time.Month;

/**
 * @author $ Devalère
 **/
public class Airplane {
    static int start = 2;
    final int end;
    public Airplane(int x) {
        x = 4;
        end = x;
    }
    public void fly(int distance) {
        System.out.print(end-start+" ");
        System.out.print(distance);
    }
    public static void main(String... start) {
        new Airplane(10).fly(5);
        System.out.print(""" 
         "ape"
         "baboon"
         "gorilla" """);

        var builder = "54321";
         builder = builder.substring(4);
         System.out.println(builder.charAt(2));

         
    }

}
