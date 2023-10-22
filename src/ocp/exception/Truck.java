package ocp.exception;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author $ Devalère
 **/
public class Truck implements AutoCloseable {
    public void close() throws Exception {
        throw new Exception("Cannot close.");
    }
    public void load() {
        System.out.println("Loading truck.");
    }
    public static void main(String[] args) {
        try (var tl = new Truck()) {
            tl.load();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    void task5() throws Exception {
        try {
            throw new FileNotFoundException();
        } catch (IOException e) {
            throw e;
        }
    }

}
