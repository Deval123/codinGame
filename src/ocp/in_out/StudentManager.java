package ocp.in_out;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * @author $ Devalère
 **/
record Student(String name) {
    static Integer score = -1;
}

public class StudentManager {
    public static void main(String[] grades) {
        try (var ios = new ObjectInputStream(
                new FileInputStream(new File("s.data")))) {
            Student record;
            while ((record = (Student) ios.readObject()) != null) // p1
                System.out.print(record);
        } catch (EOFException e) {
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}