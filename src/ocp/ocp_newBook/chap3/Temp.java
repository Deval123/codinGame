package ocp.ocp_newBook.chap3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $ Devalère
 **/
public class Temp {
    public static void main(String[] args) {
/*        int temperature = 4;
        long humidity = -temperature + temperature * 3;
        if (temperature >= 4)
        if (humidity < 6) System.out.println("Too Low");
        else System.out.println("Just Right");
        else System.out.println("Too High");*/
        Temp temp = new Temp();
        temp.printReptile(6);
        Zoo zoo = new Zoo();
        Zoo.Animal animal = Zoo.Animal.BIRD;
        zoo.printLocation(animal);

        List<Integer> myFavoriteNumbers = new ArrayList<>();
        myFavoriteNumbers.add(10);
        myFavoriteNumbers.add(14);
        for (var a : myFavoriteNumbers) {
            System.out.print(a + ", ");
            break;
        }
        for (int b : myFavoriteNumbers) {
            continue;
            //System.out.print(b + ", ");
        }
        for (Object c : myFavoriteNumbers)
            System.out.print(c + ", ");

        int[] weather = {1, 3, 2, 45, 67, 89};
        for (int i = weather.length - 1; i >= 0; i--) {

        }
    }

    void printReptile(int category) {
        var type = switch (category) {
            case 1, 2 -> "Snake";
            case 3, 4 -> "Lizard";
            case 5, 6 -> "Turtle";
            case 7, 8 -> "Alligator";
            default -> "Notdefined";
        };
        System.out.print(type);
    }

/*    void printType(Object o) {
        if (o instanceof Integer bat) {
            System.out.print("int");
        } else if (o instanceof Integer bat && bat < 10) {
            System.out.print("small int");
        } else if (o instanceof Long bat || bat <= 20) {
            System.out.print("long");
        }
        default  {
            System.out.print("unknown");
        }
    }*/

    /*private DayOfWeek getWeekDay(int day, final int thursday) {
        int otherDay = day;
        int Sunday = 0;
        switch (otherDay) {
            default:
            case 1:
                continue;
            case thursday:
                return DayOfWeek.THURSDAY;
            case 2, 10:
                break;
            case Sunday:
                return DayOfWeek.SUNDAY;
            case DayOfWeek.MONDAY:
                return DayOfWeek.MONDAY;
        }
        return DayOfWeek.FRIDAY;
    }*/


}
class Zoo {
    enum Animal {BIRD, FISH, MAMMAL}

    void printLocation(Animal a) {
        long type = switch (a) {
            case BIRD -> 1;
            case FISH -> 2;
            case MAMMAL -> 3;
            default -> 4;
        };
        System.out.print(type);
    }
}