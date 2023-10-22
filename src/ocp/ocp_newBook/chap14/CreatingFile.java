package ocp.ocp_newBook.chap14;

import java.io.File;
import java.io.IOException;

/**
 * @author $ Devalère
 **/
public class CreatingFile {
    public static String workPath = "C:\\Users\\d.kamguia.tchuenkam\\Documents\\PERSONAL";
    public static void main(String[] args) throws IOException {
//        The File class is created by calling its constructor. This code shows three different constructors:
        File zooFile1 = new File(workPath + "\\stripes.txt");
        zooFile1.createNewFile();
        File zooFile2 = new File(workPath + "\\home\\tiger", "data\\stripes.txt");


        File parent = new File(workPath + "\\home\\tiger");
        File zooFile3 = new File(parent, "data\\stripes.txt");
        System.out.println(zooFile1.exists());
    }
}
