package ocp;

/**
 * @author $ {USER}
 **/
public class DefaultValuesTest {
    int[] ia = new int[1];
    boolean b;
    int i;
    Object o;

    public static void main(String[] args) {
        DefaultValuesTest instance = new DefaultValuesTest();
        instance.print();
    }

    public void print() {
        System.out.println(ia[0] + " " + b + " " + i + " " + o);
    }
}
