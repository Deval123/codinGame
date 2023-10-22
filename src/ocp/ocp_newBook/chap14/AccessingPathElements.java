package ocp.ocp_newBook.chap14;

import java.nio.file.Path;

/**
 * @author $ Devalère
 * The Path interface contains numerous methods for retrieving particular elements of a Path,
 * returned as Path objects themselves. The getFileName() method returns the Path element of
 * the current file or directory, while getParent() returns the full path of the containing directory.
 * The getParent() method returns null if operated on the root path or at the top of a relative
 * path. The getRoot() method returns the root element of the file within the file system, or null
 * if the path is a relative path.
 **/
public class AccessingPathElements {

//    Consider the following method, which prints various Path elements:
    public void printPathInformation(Path path) {
        System.out.println("Filename is: " + path.getFileName());
        System.out.println(" Root is: " + path.getRoot());
        Path currentParent = path;
        while((currentParent = currentParent.getParent()) != null)
            System.out.println(" Current parent is: " + currentParent);
        System.out.println();
    }
    public static void main(String[] args){
        AccessingPathElements pathElements = new AccessingPathElements();
        pathElements.printPathInformation(Path.of("C:\\Users\\d.kamguia.tchuenkam\\Documents\\PERSONAL\\devalere"));
        pathElements.printPathInformation(Path.of("zoo"));
        pathElements.printPathInformation(Path.of("/zoo/armadillo/shells.txt"));
        pathElements.printPathInformation(Path.of("./armadillo/../shells.txt"));
    }
}
