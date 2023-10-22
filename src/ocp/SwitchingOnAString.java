package ocp;

/**
 * @author $ Devalère
 **/
public class SwitchingOnAString { // Strings in a switch Statement
    public static final String MEDIUM = "Medium"; // (1)
    public static final String HOT = "Hot"; // (2a)
    //public static String HOT = "Hot"; // (2b) Not O
//public static final String HOT = new String("Hot"); // (2c) Not O
    public static void main(String[] args) {
        String spiceLevel = "Medium_Hot";
        switch (spiceLevel) {
            case "Mild",
                    MEDIUM + "_" + HOT -> System.out.println("Enjoy your me!");
            case HOT -> System.out.println("Have fun!");
            case "Suicide" -> System.out.println("Good luck!");
            default -> System.out.println("You being fun!");
        }
    }
}
