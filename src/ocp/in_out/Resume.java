package ocp.in_out;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author $ Devalère
 **/
public class Resume {
    public void writeResume() throws Exception {
/*
        var f1 = Path.of("/templates/proofs");
        f1.createDirectories();
        var f2 = Path.of("/templates");
        f2.createDirectory(); // k1
        try (var w = Files.newBufferedWriter(
                Path.of(f2.toString(), "draft.txt"))) {
            w.append("My dream job");
            w.flush();
        }
        f1.delete(f1);
        f2.delete(f2); // k2
*/


    }

    public static void main(String[] args){
        Path p1 = Path.of("./found/../keys");
        Path p2 = Paths.get("/lost/blue.txt");
        System.out.println(p1.resolve(p2));
        System.out.println(p2.resolve(p1));
    }
}
