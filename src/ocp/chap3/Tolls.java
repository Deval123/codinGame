package ocp.chap3;

/**
 * @author $ Devalère
 **/
public class Tolls {
    private static int yesterday = 1;
    int tomorrow = 10;
    public static void main(String[] args) {
        var tolls = new Tolls();
        int today = 20, tomorrow = 40; // line x
        System.out.print(
                today + tomorrow + yesterday); // line y


    } }
