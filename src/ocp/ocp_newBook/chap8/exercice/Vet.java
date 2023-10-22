package ocp.ocp_newBook.chap8.exercice;

/**
 * @author $ Devalère
 **/
public class Vet {
    public static String takeNap(Yawn y) {
        return y.yawn(10, null);
    }

    public static void main(String... unused) {
        System.out.print(takeNap((a,b) -> "Sleep: " + (double)(b==null ? a : a)));
    }
}
