package ocp.ocp_newBook.chap14;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author $ Devalère
 * The Path interface includes a relativize() method for constructing the relative path from
 * one Path to another, often using path symbols. What do you think the following examples
 * will print?
 **/
public class RelativizingPath {
    public static void main(String[] args){
        var path1 = Path.of("fish.txt");
        var path2 = Path.of("friendly/birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));

        /**
         * ../friendly/birds.txt
         * ../../fish.txt
         * The idea is this: if you are pointed at a path in the file system, what steps would
         * you need to take to reach the other path? For example, to get to fish.txt from
         * friendly/birds.txt, you need to go up two levels (the file itself counts as one level)
         * and then select fish.txt.
         * If both path values are relative, the relativize() method computes the paths as if they
         * are in the same current working directory. Alternatively, if both path values are absolute, the
         * method computes the relative path from one absolute location to another, regardless of the
         * current working directory. The following example demonstrates this property when run on a
         * Windows computer:
         * */
        System.out.println("*****");
        Path path3 = Paths.get("E:\\habitat");
        Path path4 = Paths.get("E:\\sanctuary\\raven\\poe.txt");
        System.out.println(path3.relativize(path4));
        System.out.println(path4.relativize(path3));

        /*The relativize() method requires both paths to be absolute or relative and throws an
        exception if the types are mixed.*/
        Path path1_ = Paths.get("/primate/chimpanzee");
        Path path2_ = Paths.get("bananas.txt");
        path1_.relativize(path2_); // IllegalArgumentException
        /*On Windows-based systems, it also requires that if absolute paths are used, both paths
        must have the same root directory or drive letter. For example, the following would also
        throw an IllegalArgumentException on a Windows-based system:*/
        Path path3_ = Paths.get("C:\\primate\\chimpanzee");
        Path path4_ = Paths.get("D:\\storage\\bananas.txt");
        path3_.relativize(path4_); // IllegalArgumentException
    }
}
