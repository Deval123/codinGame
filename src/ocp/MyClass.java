package ocp;

/**
 * @author $ {USER}
 **/
public class MyClass { // The program will compile and run without error and will print 0 twenty times.
    public static void main(String[] args) {
        int size = 20;
        int[] arr = new int[size];
        for (int i = 0; i < size; ++i) {
            System.out.println(arr[i]);
        }
    }
}
