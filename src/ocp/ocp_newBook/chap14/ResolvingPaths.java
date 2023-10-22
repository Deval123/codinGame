package ocp.ocp_newBook.chap14;

import java.nio.file.Path;

/**
 * @author $ Devalère
 * Suppose you want to concatenate paths in a manner similar to how we concatenate strings.
 * The resolve() method provides overloaded versions that let you pass either a Path or String
 * parameter. The object on which the resolve() method is invoked becomes the basis of the new
 * Path object, with the input argument being appended onto the Path. Let’s see what happens if
 * we apply resolve() to an absolute path and a relative path:
 **/
public class ResolvingPaths {
    public static void main(String[] args){
        Path path1 = Path.of("/cats/../panther");
        Path path2 = Path.of("food");
        System.out.println(path1.resolve(path2));

        /*Like the other methods we’ve seen, resolve() does not clean up path symbols. In this
example, the input argument to the resolve() method was a relative path, but what if it
had been an absolute path?*/

        Path path3 = Path.of("/turkey/food");
        System.out.println(path3.resolve("/tiger/cage"));
    }
}
