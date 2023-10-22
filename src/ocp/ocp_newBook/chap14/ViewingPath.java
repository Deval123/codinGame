package ocp.ocp_newBook.chap14;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 **/
public class ViewingPath {

    /**
     * Now let’s try to use some of these APIs. The following is a sample program using only
     * legacy I/O APIs. Given a file path, it outputs information about the file or directory, such as
     * whether it exists, what files are contained within it, and so forth:
     */
    public static void io() {
        var file = new File("C:\\data\\zoo.txt");
        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Parent Path: " + file.getParent());
            if (file.isFile()) {
                System.out.println("Size: " + file.length());
                System.out.println("Last Modified: " + file.lastModified());
            } else {
            }
            for (File subfile : file.listFiles()) {
                System.out.println(" " + subfile.getName());
            }
        }
    }

    /**
     * In the previous example, we used two backslashes (\\) in the path
     * String, such as C:\\data\\zoo.txt. When the compiler sees a \\ inside
     * a String expression, it interprets it as a single \ value.
     * Now, let’s write that same program using only NIO.2 and see how it differs:
     */

    public static void nio() throws IOException {
        var path = Path.of("C:\\Users\\d.kamguia.tchuenkam\\Documents\\PERSONAL\\devalere\\Java_Coding_Game.pdf");
        if (Files.exists(path)) {
            System.out.println("Absolute Path: " + path.toAbsolutePath());
            System.out.println("Is Directory: " + Files.isDirectory(path));
            System.out.println("Parent Path: " + path.getParent());
            if (Files.isRegularFile(path)) {
                System.out.println("Size: " + Files.size(path));
                System.out.println("Last Modified: "
                        + Files.getLastModifiedTime(path));
            } else {
                try (Stream<Path> stream = Files.list(path)) {
                    stream.forEach(p ->
                            System.out.println(" " + p.getName(1)));
                }
            }
        }
    }



    /**
     * Viewing the Path
     * The Path interface contains three methods to retrieve basic information about the path representation. The toString() method returns a String representation of the entire path.
     * In fact, it is the only method in the Path interface to return a String. Many of the other
     * methods in the Path interface return Path instances.
     * The getNameCount() and getName() methods are often used together to retrieve the
     * number of elements in the path and a reference to each element, respectively. These two
     * methods do not include the root directory as part of the path.
     * */
    public static void testPaph(){
        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The Path Name is: " + path);
        for(int i=0; i<path.getNameCount(); i++)
            System.out.println(" Element " + i + " is: " + path.getName(i));

        System.out.println("*******");
        var p = Path.of("/");
        System.out.print(p.getNameCount()); // 0
        System.out.print(p.getName(0)); // IllegalArgumentException
    }
    public static void main(String[] args) throws IOException {
       // io();
        //nio();
        testPaph();
    }
}