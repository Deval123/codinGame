package ocp.in_out;

import java.nio.file.*;

/**
 * @author $ Devalère
 **/
public class Magician {
    public String doTrick(Path path) {
        return path.subpath(2, 3)
         .getName(1)
         .toAbsolutePath()
         .toString();
        }


    public static void main(String... cards) {
/*
        final Magician m = new Magician();
        System.out.print(m.doTrick(Paths.get("/bag/of/tricks/.././disappear.txt")));
*/

        Path halleysComet = Path.of("stars/./rocks/../m1.meteor");
        System.out.println(halleysComet);
        }
}
