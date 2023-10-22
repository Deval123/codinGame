package ocp.ocp_newBook.chap9.working_with_generics;

/**
 * @author $ Devalère
 * The method parameter is the generic type T.
 * Before the return type, we declare the formal type parameter of <T>.
 * In the ship() method, we show how you can use the generic parameter in the return type, Crate<T>, for the method.
 **/
public class Handler {
    public static <T> void prepare(T t) {
        System.out.println("Preparing " + t);
    }
    public static <T> Crate<T> ship(T t) {
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }
}
