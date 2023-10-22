package ocp.exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static ocp.exception.Appendage.putO;

/**
 * @author $ Devalère
 **/
public class ARMy {

    public static void methodB(String filename) throws IOException {
        var fis = new FileReader(filename);
        try (var br = new BufferedReader(fis)) {
        }
    }

    public static void methodC(String filename) throws FileNotFoundException {
        var fis = new FileReader(filename);
        try (var br = new BufferedReader(fis)) {
        } catch (IOException ioe) {
        }
    }


    public static void methodE(String filename) throws IOException {
        try (FileReader fis = null; BufferedReader br = null) {
        }
    }

    public static void main(String[] args) {
        Integer i = Integer.valueOf(-10);
        Integer j = Integer.valueOf(-10);

        Integer k = -10;
        System.out.print((i == j) + "|");
        System.out.print(i.equals(j) + "|");
        System.out.print((i == k) + "|");
        System.out.print(i.equals(k));
    }


}

class MyClass {
    public static void main(String[] args) {
        String str1 = "str1";
        String str2 = "str2";
        String str3 = "str3";
        str1.concat(str2);
        System.out.println(str3.concat(str1));
    }
}

class RefEq {
    public static void main(String[] args) {
        String s = "ab" + "12";
        String t = "ab" + 12;
        String u = new String("ab12");
        System.out.println((s == t) + " " + (s == u));
    }
}

class FunCharSeq {
    static String txt = """
               a
                 b
               c
            """;

    private static void putO(String s1) {
        s1 = s1.trim();
        s1 += "O";
    }

    public static void main(String[] args) {
        String s1 = " W ";
        putO(s1);
        s1.concat("W");
        System.out.println("|" + s1 + "|");

        int from = 0;
        int to = txt.indexOf('\n');
        String line = null;
        while(to < txt.length()-1) {
            to = txt.indexOf('\n', from);
            line = txt.substring(from, to);
            System.out.print(line.length());
            from = to+1;
        }
    }
}
 class Appendage {
     static void putO(StringBuilder s1) {
         s1.append("O");
     }
 }
 class MyClass2 {
    public static void main(String[] args) {
        double v = 10.4;
        System.out.println(Math.ceil(v)); // (1)
        System.out.println(Math.round(v)); // (2)
        System.out.println(Math.floor(v)); // (3)
        System.out.println((int) Math.ceil(v)); // (4)
        System.out.println((int) Math.floor(v)); // (5)

    }
}
