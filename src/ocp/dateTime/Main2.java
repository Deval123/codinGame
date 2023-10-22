package ocp.dateTime;
import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 * @author $ Devalère
 **/

public class Main2 {
    public static void main(String[] args) {
/*        var date = LocalDate.of(2022, 5, 13);
        var time = LocalTime.of(10, 0);
        var trainDay = LocalDateTime.of(date, time);
        var instant = trainDay.toInstant();
        instant = instant.plus(1, ChronoUnit.DAYS);
        System.out.println(instant);*/

        boolean carrot = true;
        Boolean potato = false;
        var broccoli = true;
        carrot = carrot & potato;
        broccoli = broccoli ? !carrot : potato;
        potato = !broccoli ^ carrot;
        System.out.println(carrot + "," + potato + "," + broccoli);
                System.out.println("******");

/*        var sum = 0.0;
        sum = sum + Math.min(3, 5);
        sum = sum + Math.floor(1.8);
        sum = sum + Math.round(5.6);
        System.out.println(sum);
        System.out.println("******");

        var builder = new StringBuilder("54321");
        builder.insert(0,2);
        System.out.println(builder.charAt(1));*/



    }
}
