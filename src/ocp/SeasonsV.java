package ocp;

/**
 * @author $ Devalère
 **/
public class SeasonsV {
    enum Season { WINTER, SPRING, SUMMER, FALL }
    public static void main(String[] args) {
        int monthNumber = 11;
        Season season = switch(monthNumber) {
            case 12, 1, 2 -> Season.WINTER;
            case 3, 4, 5 -> Season.SPRING;
            case 6, 7, 8 -> Season.SUMMER;
            case 9, 10, 11 -> Season.FALL;
            default -> throw new IllegalArgumentException(monthNumber + " not a value.");
        };
        System.out.println(season);
    }
}

class IfTest {
    public static void main(String[] args) {
        if (true)
            if (false)
                System.out.println("a");
            else
                System.out.println("b");
    }
}

class Switching {
    public static void main(String[] args) {
        final int iLoc = 3;
        switch (6) {
            case 1:
            case iLoc:
            case 2 * iLoc:
                System.out.println("I am not OK.");
            default:
                System.out.println("You are OK.");
            case 4:
                System.out.println("It's OK.");
        }
    }
}