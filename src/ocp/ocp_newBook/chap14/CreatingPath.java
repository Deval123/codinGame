package ocp.ocp_newBook.chap14;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author $ Devalère
 * Since Path is an interface, we can’t create an instance directly. After all, interfaces don’t have
 * constructors! Java provides a number of classes and methods that you can use to obtain
 * Path objects.
 * The simplest and most straightforward way to obtain a Path object is to use a static
 * factory method defined on Path or Paths. All four of these examples point to the same reference on disk:
 **/
public class CreatingPath {
    public static String workPath = "C:\\Users\\d.kamguia.tchuenkam\\Documents\\PERSONAL";

    public static void main(String [] args){
        Path zooPath1 = Path.of("\\home\\tiger\\data\\stripes.txt");
        Path zooPath2 = Path.of(workPath+ "\\home", "tiger", "data", "stripes.txt");
        Path zooPath3 = Paths.get("\\home\\tiger\\data\\stripes.txt");
        Path zooPath4 = Paths.get("\\home", "tiger", "data", "stripes.txt");
        System.out.println(Files.exists(zooPath1));
        System.out.println(Files.exists(zooPath2));
    }
}
