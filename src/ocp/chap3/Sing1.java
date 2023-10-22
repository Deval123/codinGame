package ocp.chap3;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author $ Devalère
 **/
class Music {
    void make() throws IOException {
        throw new UnsupportedOperationException();
    } }
public class Sing1 extends Music {
    public void make() throws FileNotFoundException {
        System.out.println("do-re-mi-fa-so-la-ti-do");
    } }
