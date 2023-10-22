package ocp;

/**
 * @author $ Devalère
 **/
public class SeasonsIII {// A yield Statement in a switch Expression with the Colon Notation
    enum Season { WINTER, SPRING, SUMMER, FALL } // (1)
    public static void main(String[] args) {
        int monthNumber = 11;
        Season season = switch(monthNumber) { // (2)
            case 12: case 1: case 2: // (3)
                System.out.println("Snow in the winter.");
                yield Season.WINTER; // (4)
            case 3, 4: case 5: // (5)
                System.out.println("Green grass in the spring.");
                yield Season.SPRING; // (6)
            case 6, 7, 8: // (7)
                System.out.println("Sunshine in the summer.");
                yield Season.SUMMER; // (8)
            case 9, 10, 11: // (9)
                System.out.println("Yellow leaves in the fall.");
                yield Season.FALL; // (1)
            default: // (1)
                throw new IllegalArgumentException(monthNumber + " not a value");
        }; // (1
        System.out.println(season);
    }
}
