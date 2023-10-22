package ocp.ocp_newBook.chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author $ Devalère
 * The Files class includes two copy() methods that operate with I/O streams.
 * public static long copy(InputStream in, Path target,
 * CopyOption... options) throws IOException
 * public static long copy(Path source, OutputStream out)
 * throws IOException
 * The first method reads the contents of an I/O stream and writes the output to a file. The
 * second method reads the contents of a file and writes the output to an I/O stream. These
 * methods are quite convenient if you need to quickly read/write data from/to disk.
 * The following are examples of each copy() method:
 **/
public class CopyingFilesIOStreams {
    public static void main(String[] args) throws IOException {
        try (var is = new FileInputStream("source-data.txt")) {
// Write I/O stream data to a file
            Files.copy(is, Paths.get("/mammals/wolf.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Files.copy(Paths.get("/fish/clown.xsl"), System.out);
    }

    /*While we used FileInputStream in the first example, the I/O stream could have been
any valid I/O stream including website connections, in-memory stream resources, and so
forth. The second example prints the contents of a file directly to the System.out stream.*/
}
