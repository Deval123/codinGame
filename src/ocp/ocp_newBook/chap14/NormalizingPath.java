package ocp.ocp_newBook.chap14;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author $ Devalère
 * So far, we’ve presented a number of examples that included path symbols that were unnecessary.
 * Luckily, Java provides the normalize() method to eliminate unnecessary redundancies in a path.
 * Remember, the path symbol .. refers to the parent directory, while the path symbol . refers
 * to the current directory. We can apply normalize() to some of our previous paths.
 **/
public class NormalizingPath {
    public static void main(String[] args){
        var p1 = Path.of("./armadillo/../shells.txt");
        System.out.println(p1.normalize()); // shells.txt

        var p2 = Path.of("/cats/../panther/food");
        System.out.println(p2.normalize()); // /panther/food
        var p3 = Path.of("../../fish.txt");
        System.out.println(p3.normalize()); // ../../fish.txt
        System.out.println("****");

        /**
         * The first two examples apply the path symbols to remove the redundancies, but what
         * about the last one? That is as simplified as it can be. The normalize() method does not
         * remove all of the path symbols, only the ones that can be reduced.
         * The normalize() method also allows us to compare equivalent paths.
         * Consider the following example:
         * */

        var p11 = Paths.get("/pony/../weather.txt");
        var p12 = Paths.get("/weather.txt");
        System.out.println(p11.equals(p12)); // false
        System.out.println(p11.normalize().equals(p12.normalize())); // true

        /*The equals() method returns true if two paths represent the same value. In the first
comparison, the path values are different. In the second comparison, the path values have
both been reduced to the same normalized value, /weather.txt. This is the primary
function of the normalize() method: to allow us to better compare different paths.*/
    }
}
