package ocp.chater2;

/**
 * @author $ Devalère
 **/
public class DoMethod {
    public static void main(String[] args) {
/*        var gas = true;
        do {
            System.out.println("helium");
            gas = gas ^ gas;
            gas = !gas;
        } while (!gas);
 */
        int m = 0, n = 0;
        while (m < 5) {
            n++;
            if (m == 3)
                continue;
            switch (m) {
                case 0:
                case 1:
                    n++;
                default:
                    n++;
            }
            m++;
        }
        System.out.println(m + " " + n);
    }

}
