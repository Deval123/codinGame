package ocp;

/**
 * @author $ Devalère
 **/
public class RQ810A40 {

    static void print(Object... obj) {
        System.out.println("Object...: " + obj[0]);
    }
    public static void main(String[] args) {
        // (1) INSERT METHOD CALL HERE
        //print(9, 1, 1);
        //print("9", "1", "1");
        print(new int[] {9, 1, 1});
        // print(new Integer[] {9, 1, 1});
        // print(new String[] {"9", "1", "1"});
        // print(new Object[] {"9", "1", "1"});

    }
}

