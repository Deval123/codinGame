package ocp.ocp_newBook.chap14;

import java.nio.file.Paths;

/**
 * @author $ Devalère
 * The Path interface includes the subpath() method to select portions of a path. It takes two
 * parameters: an inclusive beginIndex and an exclusive endIndex. This should sound familiar as
 * it is how String’s substring() method works, as you saw in Chapter 4, “Core APIs.”
 * The following code snippet shows how subpath() works. We also print the elements of the
 * Path using getName() so that you can see how the indices are used.
 **/
public class CreatingPartOfPath {
    public static void main(String[] args) {
        var p = Paths.get("/mammal/omnivore/raccoon.image");
        System.out.println("Path is: " + p);
        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println(" Element " + i + " is: " + p.getName(i));
        }
        System.out.println();
        System.out.println("subpath(0,3): " + p.subpath(0, 3));
        System.out.println("subpath(1,2): " + p.subpath(1, 2));
        System.out.println("subpath(1,3): " + p.subpath(1, 3));
        /**
         * The output of this code snippet is the following:
         * Path is: /mammal/omnivore/raccoon.image
         * Element 0 is: mammal
         * Element 1 is: omnivore
         * Element 2 is: raccoon.image
         * subpath(0,3): mammal/omnivore/raccoon.image
         * subpath(1,2): omnivore
         * subpath(1,3): omnivore/raccoon.image
         * Like getNameCount() and getName(), subpath() is zero-indexed and does not
         * include the root. Also like getName(), subpath() throws an exception if invalid indices are provided.
         * */
        var q = p.subpath(0, 4); // IllegalArgumentException
        var x = p.subpath(1, 1); // IllegalArgumentException
    }


}
