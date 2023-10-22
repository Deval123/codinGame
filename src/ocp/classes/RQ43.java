package ocp.classes;

/**
 * @author $ Devalère
 **/
public class RQ43 {
    public static void main(String[] args) {
        Object x = "acme";
        if (x instanceof String s && s.length() > 5) {
            x = s.equals("acme") ? "1" : "2";
        } else {
           // x = s.equals("acme") ? "3" : "4";
            System.out.println("// x = s.equals(\"acme\") ? \"3\" : \"4\";");

        }
        System.out.println(x);
        Number y = Integer.valueOf(42);
        if (y instanceof  Integer s) {
            System.out.print(s.intValue());
        }



    }
}

