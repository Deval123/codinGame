package ocp.in_out;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 * @author $ Devalère
 **/
public class Cat {
    public static void main(String[] args) {
/*        LocalDate catDay = LocalDate.of(2022, 10, 29);
        var formatter = DateTimeFormatter
                .ofPattern("Holiday: yyyy dd MMM");
        System.out.println(catDay.format(formatter));*/

        double p = 1_909.2;
        var nf1 = NumberFormat.getCompactNumberInstance();
        var nf2 = NumberFormat.getCompactNumberInstance(
                Locale.getDefault(), NumberFormat.Style.SHORT);
        var nf3 = NumberFormat.getCompactNumberInstance(
                Locale.getDefault(), NumberFormat.Style.LONG);
        System.out.println(nf1.format(p));
        System.out.println(nf2.format(p));
        System.out.println(nf3.format(p));
    } }
