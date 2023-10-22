package ocp;

/**
 * @author $ Devalère
 **/
public class LabeledSkip {//  Labeled continue Statement

    public static void main(String[] args) {
        int[][] squareMatrix = {{4, 3, 5}, {2, 1, 6}, {9, 7, 8}};
        int sum = 0;
        outer:
        for (int i = 0; i < squareMatrix.length; ++i) { // (1)
            for (int j = 0; j < squareMatrix[i].length; ++j) { // (2)
                if (j == i) continue; // (3)
                System.out.println("Element[" + i + ", " + j + "]: " +
                        squareMatrix[i][j]);
                sum += squareMatrix[i][j];
                if (sum > 10) continue outer; // (4)
                // (5) Continue with update expression in the inner loop
            } // end inner loop
            // (6) Continue with update expression in the outer loop h
        } // end outer loop
        System.out.println("sum: " + sum);
    }
}


class AnotherClass {// The code will compile without error, but will never terminate when run.
    public static void main(String[] args) {
        int i = 0;
        for (; i < 10; i++) ; // (1)
        for (i = 0; ; i++) break; // (2)
        for (i = 0; i < 10; ) i++; // (3)
        for (; ; ) ; // (4)
    }
}
