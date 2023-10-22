package ocp.ocp_newBook.chap9.working_with_generics;

/**
 * @author $ Devalère
 **/
// Generics can also be used with records. This record takes a single generic type parameter:
public record CrateRecord<T>(T contents) {
    @Override
    public T contents() {
        if (contents == null)
            throw new IllegalStateException("missing contents");
        return contents;
    }
}
/**
 * This works the same way as classes. You can create a record of the robot!
 * Robot robot = new Robot();
 * CrateRecord<Robot> record = new CrateRecord<>(robot);
 * This is convenient. Now we have an immutable, generic record!
 */
