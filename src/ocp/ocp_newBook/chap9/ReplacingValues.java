package ocp.ocp_newBook.chap9;

import java.util.HashMap;
import java.util.Map;

/**
 * @author $ Devalère
 **/
public class ReplacingValues {
    public static void main(String[] args){
        //These methods are similar to the List version, except a key is involved:
         Map<Integer, Integer> map = new HashMap<>();
         map.put(1, 2);
         map.put(2, 4);
         System.out.println(map); //before the replace call
         Integer original = map.replace(2, 10); // 4
         System.out.println(map); // {1=2, 2=10}
         map.replaceAll((k, v) -> k + v);
         System.out.println(map); // {1=3, 2=12}
/*        Line 16 replaces the value for key 2 and returns the original value. Line 18 calls a
        function and sets the value of each element of the map to the result of that function. In our
        case, we added the key and value together.*/
    }
}
