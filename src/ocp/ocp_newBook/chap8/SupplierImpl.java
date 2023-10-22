package ocp.ocp_newBook.chap8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

/**
 * @author $ Devalère
 **/
public class SupplierImpl {
    public static void main(String [] args){
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();
        System.out.println(d1); // today date
        System.out.println(d2); // today date
//        For example, we can print two empty StringBuilder objects:
        Supplier<StringBuilder> str1 = StringBuilder::new;
        Supplier<StringBuilder> str2 = () -> new StringBuilder();
        System.out.println(str1.get()); // Empty string
        System.out.println(str2.get()); // Empty string
//        List of String
        Supplier<ArrayList<String>> s3 = ArrayList::new;
        ArrayList<String> a1 = s3.get();
        System.out.println(s3);
        System.out.println(a1); // []
    }
}
