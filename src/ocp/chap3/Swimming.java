package ocp.chap3;

/**
 * @author $ Devalère
 **/
public interface Swimming {
    // protected String getName(); not allowed
    String DEFAULT = "Diving!"; // k1
    abstract  int breath();
    private static void stroke() {

        if(/*breath()==1*/true) { // k2
            System.out.print("Go!");
        } else {
            System.out.print(dive()); // k3
        } }
    static String dive() {
        return DEFAULT; // k4
    } }
