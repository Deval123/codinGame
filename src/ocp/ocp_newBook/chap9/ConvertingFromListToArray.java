package ocp.ocp_newBook.chap9;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $ Devalère
 **/
public class ConvertingFromListToArray {
    public static void main(String [] args){
        //Let’s start with turning a List into an array:
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        System.out.println(list);
        System.out.println("********");
        Object[] objectArray = list.toArray();
        String[] stringArray = list.toArray(new String[0]);
        list.clear();
        System.out.println(objectArray.length); // 2
        System.out.println(stringArray.length); // 2
        for (String elt: stringArray) {
            System.out.println(elt);

        }
    }
}
