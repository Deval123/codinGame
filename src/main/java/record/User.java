package main.java.record;

/**
 * @author $ Devalère
 **/
import java.time.*;
import java.time.temporal.*;
public record User(LocalDate creationDate) {
    static LocalDate today = LocalDate.now();
    public User {
        creationDate = today;
        creationDate = today;
    }
    public static void main(String[] p) {
        LocalDate yesterday = LocalDate.now()
                .minus(1, ChronoUnit.DAYS);
        var u = new User(yesterday);
        System.out.print(u.creationDate());
    } }
