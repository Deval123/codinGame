package ocp.in_out;

/**
 * @author $ Devalère
 **/

import java.io.IOException;
import java.nio.file.*;

public class Rose {
    public void tendGarden(Path p) throws Exception {
        Files.walk(p, 1)
                .map(q -> {
                    try {
                        return q.toRealPath();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                })
                .forEach(System.out::println);
    }

    public static void main(String... thorns) throws Exception {
        new Rose().tendGarden(Paths.get(thorns[0]));
    }
}