package ocp.in_out;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author $ Devalère
 **/
import java.io.*;

public class Turing {
    public static void main(String... robots) throws IOException {
/*        Console c = System.console();
        final String response = c.readLine("Are you human?");
        System.err.print(response);*/
        var p1 = Path.of("/tea/earlgrey/..",".").resolve(Path.of("hot.txt"));
        var p2 = new File("/./tea/./earlgrey/./.././hot.txt").toPath();
        System.out.print(Files.isSameFile(p1,p2));
        System.out.print(" ");
        System.out.print(p1.normalize().equals(p2.normalize()));
        System.out.print(" ");
        System.out.print(Files.mismatch(p1,p2));
    }
}

