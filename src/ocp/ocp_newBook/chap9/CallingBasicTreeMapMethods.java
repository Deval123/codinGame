package ocp.ocp_newBook.chap9;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author $ Devalère
 **/
public class CallingBasicTreeMapMethods {
    public static void main(String[] args){
/*        Java uses the hashCode() of the key to determine the order. The order here happens not
        to be sorted order or the order in which we typed the values. Now let’s look at TreeMap:*/
        Map<String, String> map = new TreeMap<>();
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key: map.keySet())
            System.out.print(key + ","); // giraffe,koala,lion,
/*        TreeMap sorts the keys as we would expect. If we called values() instead of keySet(),
                the order of the values would correspond to the order of the keys.*/
        //NB: cela est trié selon l'ordre croissant des clé, selon qu'il soit alphabétique ou entier
//        System.out.println(map.contains("lion")); // DOES NOT COMPILE
        System.out.println(map.containsKey("lion")); // true
        System.out.println(map.containsValue("lion")); // false
        System.out.println(map.size()); // 3
        map.clear();
        System.out.println(map.size()); // 0
        System.out.println(map.isEmpty()); // true
    }
}
