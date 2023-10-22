package ocp.ocp_newBook.chap14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author $ Devalère
 **/
public class CopyingFilesIntoDirectory {
    public static void main(String[] args) throws IOException {
        var file = Paths.get("food.txt");
        var directory = Paths.get("/enclosure");
        Files.copy(file, directory);

        /**
         * If you said it would create a new file at /enclosure/food.txt, you’re way off. It
         * throws an exception. The command tries to create a new file named /enclosure. Since the
         * path /enclosure already exists, an exception is thrown at runtime.
         * On the other hand, if the directory did not exist, the process would create a new file with
         * the contents of food.txt, but the file would be called /enclosure. Remember, we said files
         * may not need to have extensions, and in this example, it matters.
         * This behavior applies to both the copy() and move() methods, the latter of which we cover
         * next. In case you’re curious, the correct way to copy the file into the directory is to do the
         * following:
         * */
    }
}
