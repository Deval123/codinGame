package ocp;

/**
 * @author $ Devalère
 **/

enum SpiceGrade {MILD, MEDIUM, MEDIUM_HOT, HOT, SUICIDE;} // (1)

public class SwitchingFun {// Enums in a switch Statement

    public static void main(String[] args) {
        SpiceGrade spicing = SpiceGrade.HOT;
        switch (spicing) { // (2)
            case HOT -> System.out.println("Have fun!"); // (3a) OK!
            // case SpiceGrade.HOT // (3b) Compile-time error
            // -> System.out.println("Have fun!");
            case SUICIDE -> System.out.println("Good luck!");
            default -> System.out.println("Enjoy your meal!");
        }
    }
}

class test{
    public static void main(String[] args){
        char value = 3;
        String yield =
                switch (value) {
                    case 2,3,5,7: yield "Prime";
                    case 1,4,6,8,9: yield "Composite";
                    default: yield "Unknown";
                };
        System.out.println(yield);


    }
}

class RQ462 {
    public static void main(String[] args) {
        int price = 1;
        int discount = switch (price) {
            case 5, 1, 2 -> price - 1;
            case 4, 3, 6 -> price - 2;
            default -> 0;
        };
        System.out.println(discount);
    }
}