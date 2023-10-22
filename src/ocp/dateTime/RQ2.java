package ocp.dateTime;

import java.time.*;

/**
 * @author $ Devalère
 **/
public class RQ2 {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(2021, 1, 1);
        System.out.println(d1.lengthOfMonth());
        System.out.println(d1.withDayOfMonth(d1.lengthOfMonth()));
        d1 = d1.withDayOfMonth(d1.lengthOfMonth()).withMonth(2);
        System.out.println(d1);
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("*****************************");


/*        var localDate = LocalDate.of(2022, 3, 13);
        var localTime = LocalTime.of(1, 0);
        var zone = ZoneId.of("America/New_York");
        var z = ZonedDateTime.of(localDate, localTime, zone);
        var offset = z.getOffset();
        var duration = Duration.ofHours(3);
        var later = z.plus(duration);
        System.out.println(later.getHour() + " "
                + offset.equals(later.getOffset()));
        System.out.println("*****************************");
        System.out.println("*****************************");
         var line = new StringBuilder("-");
         var anotherLine = line.append("-");
        System.out.print(line == anotherLine);
         System.out.print(" ");
         System.out.print(line.length());
        System.out.println("*****************************");
        System.out.println("*****************************");
        var localDate = LocalDate.of(2022, 3, 13);
        var localTime = LocalTime.of(3, 0);
        var zone = ZoneId.of("America/New_York");
        var z = ZonedDateTime.of(localDate, localTime, zone);
        var block = """

             green
               yellow
        """;
        System.out.println(block);

         var waffleDay = LocalDate.of(2022, Month.MARCH, 25);
         var period = Period.of(1, 6, 3);
         var later = waffleDay.plus(period);
         later.plusDays(1);
         var thisOne = LocalDate.of(2023, Month.SEPTEMBER, 28);
         var thatOne = LocalDate.of(2023, Month.SEPTEMBER, 29);
        System.out.println(period);
         System.out.println(later.isBefore(thisOne) + " "
                 + later.isBefore(thatOne));

        var montyPythonDay = LocalDate.of(2023, Month.MAY, 10);
        var aprilFools = LocalDate.of(2023, Month.APRIL, 1);
        var duration = Duration.ofDays(1);
        var result = montyPythonDay.minus(duration);
        System.out.println(result + " " + aprilFools.isBefore(result));
         var line = new String("-");
         var anotherLine = line.concat("-");
         System.out.print(line == anotherLine);
         System.out.print(" ");
         System.out.print(line.length());

        var localDate = LocalDate.of(2022, Month.NOVEMBER, 6);
        var localTime = LocalTime.of(1, 0);
        var zone = ZoneId.of("America/New_York");
        var z = ZonedDateTime.of(localDate, localTime, zone);
        var offset = z.getOffset();
        for (int i = 0; i < 6; i++)
            z.plusHours(1);
        System.out.print(z.getHour() + " "
                + offset.equals(z.getOffset()));
        var baa = 8;
        var bleat = ~baa;
        var sheep = ~bleat;
        System.out.printf(bleat + " " + sheep);
        var time = LocalTime.of(1,2,3,4);
        System.out.println(time);
        //double num1, int num2 = 0;
        int num1 = 0, num2 = 0;
        var teams = new StringBuilder("333");
        teams.append(" 806");
        teams.append(" 1601");
        System.out.print(teams);

        var localDate = LocalDate.of(2022, 3, 13);
        var localTime = LocalTime.of(13, 0);
        var zone = ZoneId.of("America/New_York");
        var z = ZonedDateTime.of(localDate, localTime, zone);
        var offset = z.getOffset();
        var duration = Duration.ofHours(3);
        var later = z.plus(duration);
        System.out.println(later.getHour() + " "
                + offset.equals(later.getOffset()));

        var happy = " :) - (: ";
        var really = happy.trim();
        var question = happy.substring(1, happy.length() - 1);
        System.out.println(really.equals(question));
        double num1 = 2.718;
        //double num2 = 2._718;
        double num3 = 2.7_1_8;
       // double num4 = _2.718;

        var montyPythonDay = LocalDate.of(2022, Month.MAY, 10);
        var time = LocalTime.of(5, 40);
        var dateTime = LocalDateTime.of(montyPythonDay, time);
        var duration = Duration.ofDays(1);
        var result = dateTime.minus(duration);
        System.out.println(result);*/

        var numPigeons = Long.valueOf ("100");
        System.out.println(numPigeons.toString());
    }
    public static void secret(StringBuilder mystery) {
        char ch = mystery.charAt(3);
        mystery = mystery.insert(1, "more");
        int num = mystery.length();
        System.out.println(num);

    }
}
