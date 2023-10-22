package ocp.in_out;

/**
 * @author $ Devalère
 **/
import java.io.*;
import java.util.*;
public class Itinerary {
    private List<String> activities = new ArrayList<>();
    private static Itinerary getItinerary(String name) {
        return null;
    }
/*    public static void printItinerary() throws Exception {
        Console c = new Console();
        final String name = c.readLine("What is your name?");
        final var stuff = getItinerary(name);
        stuff.activities.forEach(s -> c.printf(s));
    }*/
    public static void main(String[] h) throws Exception {
        //printItinerary();
    }

/*    public void test(){
        String fn = "icecream.txt";
        try (var w = new BufferedWriter(new FileOutputStream(fn));
             var s = System.out) {
            w.write("ALERT!");
            w.flush();
            w.write('!');
            System.out.print("1");
        } catch (IOException e) {
            System.out.print("2");
        } finally {
            System.out.print("3");
        }
    }*/
}
