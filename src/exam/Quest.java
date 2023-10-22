package exam;

import java.io.File;
import java.nio.file.Path;

/**
 * @author $ Devalère
 **/
public class Quest {
    String s = "10_00";
    int a = 10_00;

/*
    Integer res = 250 + s;
    Integer res = 250 + Integer.valueOf(a);
    Integer res = 250 + Integer(a);
*/


    // static name
    // record replace line by class

    File file = new File("rabbit");
    Path nowPath = file.toPath();
    File backToFile = nowPath.toFile();
}
