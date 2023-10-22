package ocp.ocp_newBook.chap9.working_with_generics;

/**
 * @author $ Devalère
 * Unless a method is obtaining the generic formal type parameter from the class/interface,
 * it is specified immediately before the return type of the method. This can lead to some interesting-looking code!
 **/

public class More {
    public static <T> void sink(T t) {
    }

    public static <T> T identity(T t) {
        return t;
    }

/*    public static T noGood(T t) {
        return t;
    } // DOES NOT COMPILE*/
}
/**
 * Line 10 shows the formal parameter type immediately before the return type of void.
 * Line 13 shows the return type being the formal parameter type. It looks weird, but it is correct.
 * Line 17 omits the formal parameter type and therefore does not compile.
 */
