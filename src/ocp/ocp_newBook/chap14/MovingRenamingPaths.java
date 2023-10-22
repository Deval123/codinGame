package ocp.ocp_newBook.chap14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author $ Devalère
 * The Files class provides a useful method for moving or renaming files and directories.
 * public static Path move(Path source, Path target,
 * CopyOption... options) throws IOException
 * The following sample code uses the move() method:
 **/
public class MovingRenamingPaths {
    public static void main(String[] args) throws IOException {
        Files.move(Path.of("C:\\zoo"), Path.of("C:\\zoo-new"));
        Files.move(Path.of("C:\\user\\addresses.txt"),
                Path.of("C:\\zoo-new\\addresses2.txt"));
        /*The first example renames the zoo directory to a zoo-new directory, keeping all of the
original contents from the source directory. The second example moves the addresses.txt
file from the directory user to the directory zoo-new and renames it addresses2.txt.*/

        /**
         * Similarities between move() and copy()
         * Like copy(), move() requires REPLACE_EXISTING to overwrite the target if it exists; otherwise, it will throw an exception. Also like copy(), move() will not put a file in a directory
         * if the source is a file and the target is a directory. Instead, it will create a new file with the
         * name of the directory.
         * */
    }
}
