package ocp.ocp_newBook.chap9.working_with_generics;

/**
 * @author $ Devalère
 * Just like a class, an interface can declare a formal type parameter. For example, the following
 * Shippable interface uses a generic type as the argument to its ship() method:
 **/
public interface Shippable<T> {
    void ship(T t);
}
/*There are three ways a class can approach implementing this interface. The first is to
specify the generic type in the class.*/