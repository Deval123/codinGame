package ocp;

/**
 * @author $ Devalère
 **/
public class Seasons {// Nested switch Statements with the Colon Notation

    public static void main(String[] args) {
        int monthNumber = 11;
        switch (monthNumber) { // (
            case 12:
            case 1:
            case 2: // (
                System.out.println("Snow in the winter.");
                break;
            case 3, 4:
            case 5: // (
                System.out.println("Green grass in the spring.");
                break;
            case 6, 7, 8: // (
                System.out.println("Sunshine in the summer.");
                break;
            case 9, 10, 11: // (
                switch (monthNumber) { // Nested switch (
                    case 10:
                        System.out.println("Halloween.");
                        break;
                    case 11:
                        System.out.println("Thanksgiving.");
                        break;
                } // End nested switch
                // Always printed for case constant 9, 10, 11
                System.out.println("Yellow leaves in the fall."); // (
                break;
            default:
                System.out.println(monthNumber + " is not a valid month.");
        }
    }
}
