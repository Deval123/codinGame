package ocp.ocp_newBook.chap9;

import java.util.ArrayList;

/**
 * @author $ Devalère
 **/
public class UnboxingNulls {
    public static void main(String[] args) {
/*        Java protects us from many problems with Collections. However, it is still possible to
        write a NullPointerException:*/
        var heights = new ArrayList<Integer>();
        heights.add(null);
        int h = heights.get(0); // NullPointerException
/*        On line 13, we add a null to the list. This is legal because a null reference can be assigned
        to any reference variable. On line 14, we try to unbox that null to an int primitive. This is a
        problem. Java tries to get the int value of null. Since calling any method on null gives a
        NullPointerException, that is just what we get. Be careful when you see null in relation to autoboxing.*/
    }
}
