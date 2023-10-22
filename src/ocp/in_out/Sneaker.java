package ocp.in_out;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

/**
 * @author $ Devalère
 **/
public class Sneaker {
    public void setupInventory(Path d) throws Exception {
        Path suggestedPath = Paths.get("sneakers");
        if(Files.isSameFile(suggestedPath, d) // j1
                && !Files.exists(suggestedPath))
            Files.createDirectories(d); // j2
    }
    public static void main(String[] socks) throws Exception {
/*        Path w = new File("/stock/sneakers").toPath(); // j3
        new Sneaker().setupInventory(w);*/

        Path p = Paths.get("/glasses/lens");
        Files.walk(p)
                .map(z -> z.toAbsolutePath().toString())
                .filter(s -> s.endsWith(".java"))
                .collect(Collectors.toList()).forEach(System.out::println);
        Files.find(p,Integer.MAX_VALUE,
                        (w,a) -> w.toAbsolutePath().toString().endsWith(".java"))
                .collect(Collectors.toList()).forEach(System.out::println);
    }

}
