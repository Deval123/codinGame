package ocp.ocp_newBook.chap9;

import java.util.HashMap;
import java.util.Map;

/**
 * @author $ Devalère
 **/
public class CallingBasicHashMapMethods {
    public static void main(String[] args){
        //Let’s start out by comparing the same code with two Map types. First up is HashMap:
        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key: map.keySet())
            System.out.print(key + ","); // koala,giraffe,lion,
/*        Here we use the put() method to add key/value pairs to the map and get() to get a
        value given a key.We also use the keySet() method to get all the keys.*/
    }
}
