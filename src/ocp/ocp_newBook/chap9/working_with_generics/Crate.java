package ocp.ocp_newBook.chap9.working_with_generics;

/**
 * @author $ Devalère
 * The generic type T is available anywhere within the Crate class. When you instantiate the
 * class, you tell the compiler what T should be for that particular instance.
 **/
public class Crate<T> {
    private T contents;
    public T lookInCrate() {
        return contents;
    }
    public void packCrate(T contents) {
        this.contents = contents;
    }
}
/**
 *Naming Conventions for Generics
 * A type parameter can be named anything you want.
 * The convention is to use single uppercase letters to make it obvious that they aren’t real class names.
 * The following are common letters to use:
 * ■ E for an element
 * ■ K for a map key
 * ■ V for a map value
 * ■ N for a number
 * ■ T for a generic data type
 * ■ S, U, V, and so forth for multiple generic types
 */