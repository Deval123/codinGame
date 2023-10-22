package ocp.classes;

/**
 * @author $ Devalère
 **/

public class RQ800A20 {
    static void compute(int... ia) {
        System.out.print("|");
        for(int i : ia) {
            System.out.print(i + "|");
        }
        System.out.println();
    }
    static void compute(int[] ia1, int... ia2) {
        compute(ia1);
        compute(ia2);
    }
    static void compute(int[] ia1, int[]... ia2d) {
        for(int[] ia : ia2d) {
            compute(ia);
        }
    }
    public static void main(String[] args) {
        compute(new int[] {10, 11}, new int[] {12, 13, 14});
        compute(15, 16);
        compute(new int[] {17, 18}, new int[][] {{19}, {20}});
        compute(null, new int[][] {{21}, {22}});
    }
}
