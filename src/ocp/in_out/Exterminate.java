package ocp.in_out;

/**
 * @author $ Devalère
 **/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.file.*;

public class Exterminate {
/*    public void deleteTree(Path q) {
        if (!Files.isDirectory(q))
            Files.delete(q);
        else {
            Files.list(q).forEach(this::deleteTree);
            Files.delete(q);
        }
    }*/

    void copyFile(String source, String target) throws Exception {
        try (var is = new FileInputStream(source);
             OutputStream os = new FileOutputStream(target)) {
            byte[] data = new byte[123];
            int chirps;
// INSERT CODE HERE
            while ((chirps = is.read(data)) > 0)
                os.write(data, 0, chirps);
        } }
}
