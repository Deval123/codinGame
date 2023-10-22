package ocp.dateTime;

import java.lang.Math;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

/**
 * @author $ Devalère
 **/
public class MathFuntion {

    public static void main(String[] args) {
        var waffleDay = LocalDate.of(2022, Month.MARCH, 25);
        var period = Period.ofYears(1).ofMonths(6).ofDays(3);
        var later = waffleDay.plus(period);
        later.plusDays(1);
        var thisOne = LocalDate.of(2022, Month.SEPTEMBER, 28);
        var thatOne = LocalDate.of(2022, Month.SEPTEMBER, 29);
        System.out.println(later.isBefore(thisOne) + " " + later.isBefore(thatOne));
        System.out.print(""" 
             "ape"
             "baboon"
             "gorilla" 
            """);
        int height = 2, length = 3;
        boolean w = height > 1 | --length < 4;
        var x = height!=2 ? length++ : height;
        boolean z = height % length == 0;
        System.out.println(w + "-" + x + "-" + z);

         var quotes = """
         "The Quotes that Could"
         \"\"\"
         """;
        System.out.print(quotes);

        var sb = new StringBuilder();
        sb.append("red");
        sb.deleteCharAt(0);
        sb.delete(1, 2);
        System.out.println(sb);

/*        Boolean.valueOf("8").booleanValue();
        Character.valueOf('x').byteValue();
        Double.valueOf("9_.3").byteValue();
        Long.valueOf(88).byteValue();*/
    }
    public boolean isItMyBirthday(LocalDateTime dateTime) {
        //ZonedDate now = ZonedDate.now();
        LocalDate now = LocalDate.now();
        return now.getMonth() == dateTime.getMonth()
                && now.getDayOfMonth() == dateTime.getDayOfMonth();
    }
}
