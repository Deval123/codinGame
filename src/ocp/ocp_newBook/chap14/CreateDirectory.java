package ocp.ocp_newBook.chap14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author $ Devalère
 * The createDirectory() method will create a directory and throw an
 * exception if it already exists or if the paths leading up to the directory do not exist. The
 * createDirectories() method creates the target directory along with any nonexistent
 * parent directories leading up to the path. If all of the directories already exist,
 * createDirectories() will simply complete without doing anything. This is useful in situations where you want to ensure a directory exists and create it if it does not.
 * Both of these methods also accept an optional list of FileAttribute<?> values to apply
 * to the newly created directory or directories. We discuss file attributes toward the end of
 * the chapter.
 * The following shows how to create directories:
 **/
public class CreateDirectory {
    public static void main(String[] args) throws IOException {
        Files.createDirectory(Path.of("C:\\Users\\d.kamguia.tchuenkam\\Documents\\PERSONAL\\field"));
            Files.createDirectories(Path.of("C:\\Users\\d.kamguia.tchuenkam\\Documents\\PERSONAL\\field\\pasture\\green"));

            /*The first example creates a new directory, field, in the directory /bison, assuming
/bison exists; otherwise, an exception is thrown. Contrast this with the second example,
which creates the directory green along with any of the following parent directories if they
do not already exist, including bison, field, and pasture.*/
    }
}
