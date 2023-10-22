package ocp.chater2;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author $ Devalère
 **/
public class Kansas {
    public static void main(String[] args){
        Collection<String> kitties = null;
        Kansas kansas = new Kansas();
        kansas.meow(kitties);
    }

    public void meow(Collection<String> kitties) {
        if (kitties instanceof List c) {
            System.out.println("L " + c.size());
        } else if (kitties instanceof Map c) {
            c = new TreeMap<>(); // x1
            System.out.println("M " + c.size());
        } else {
            //System.out.println("E " + c.size());
        }
    }

     public void magic() {
/*         do {
             int trick = 0;
             LOOP: do {
                 trick++;
                 } while (trick < 2--);
             continue LOOP;
             } while (1 > 2);
         System.out.println(trick);*/
         }
}
