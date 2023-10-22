package ocp;

/**
 * @author $ Devalère
 **/
public class SeasonsII {//  Nested switch Statements with the Arrow Notation

    public static void main(String[] args) {
        int monthNumber = 11;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Snow in the winter.");
            case 3, 4, 5 -> System.out.println("Green grass in the sprint");
            case 6, 7, 8 -> System.out.println("Sunshine in the summer.");
            case 9, 10, 11 -> {
                switch (monthNumber) { // Nested switch
                    case 10 -> System.out.println("Halloween.");
                    case 11 -> System.out.println("Thanksgiving.");
                }
                // Always printed for case constants 9, 10, 11:
                System.out.println("Yellow leaves in the fall.");
            }
            default -> throw new IllegalArgumentException(monthNumber + " is not a valid month.");
        }
    }
}
