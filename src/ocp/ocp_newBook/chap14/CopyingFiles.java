package ocp.ocp_newBook.chap14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 * The Files class provides a method for copying files and directories within the file system.
 * public static Path copy(Path source, Path target,
 * CopyOption... options) throws IOException
 * The method copies a file or directory from one location to another using Path objects.
 * The following shows an example of copying a file and a directory:
 **/
public class CopyingFiles {
    public static void main(String[] args) throws IOException {
        Files.copy(Paths.get("C:\\Users\\d.kamguia.tchuenkam\\Documents\\PERSONAL\\Java_Exception.ppt"),
                Paths.get("C:\\Users\\d.kamguia.tchuenkam\\Documents\\PERSONAL\\field\\pasture\\green\\Java_Exception.ppt"));
        //Files.copy(Paths.get("/turtle"), Paths.get("/turtleCopy"));


    }

    /**
     * When directories are copied, the copy is shallow. A shallow copy means that the files and
     * subdirectories within the directory are not copied. A deep copy means that the entire tree
     * is copied, including all of its content and subdirectories. A deep copy typically requires
     * recursion, where a method calls itself.*
     */

    public void copyPath(Path source, Path target) {
        try {
            Files.copy(source, target);
            if (Files.isDirectory(source))
                try (Stream<Path> s = Files.list(source)) {
                    s.forEach(p -> copyPath(p,
                            target.resolve(p.getFileName())));
                }
        } catch (IOException e) {
// Handle exception
        }
    }
    /*The method first copies the path, whether a file or a directory. If it is a directory, only a
shallow copy is performed. Next, it checks whether the path is a directory and, if it is, performs a recursive copy of each of its elements.
What if the method comes across a symbolic
link? Don’t worry: the JVM will not follow symbolic links when using the list() method.*/
}
