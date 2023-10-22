package ocp.ocp_newBook.chap9.working_with_generics;

import ocp.chap3.Robot;

/**
 * @author $ Devalère
 * The following concrete class says that it deals only with
 *         robots. This lets it declare the ship() method with a Robot parameter:
 **/

class ShippableRobotCrate implements Shippable<Robot> {
    public void ship(Robot t) { }
}

/*    The next way is to create a generic class. The following concrete class allows the caller to
        specify the type of the generic:*/
class ShippableAbstractCrate<U> implements Shippable<U> {
    public void ship(U t) { }
}

/**
 * In this example, the type parameter could have been named anything, including T. We
 * used U in the example to avoid confusion about what T refers to.
 * The exam won’t mind trying to confuse you by using the same type parameter name.
 * The final way is to not use generics at all. This is the old way of writing code. It generates
 * a compiler warning about Shippable being a raw type, but it does compile. Here the ship()
 * method has an Object parameter since the generic type is not defined:
 */
class ShippableCrate implements Shippable {
    public void ship(Object t) { }
}