package ocp;

/**
 * @author $ Devalère
 **/
class LabeledBreakOut {// Labeled break Statement

    public static void main(String[] args) {
        int[][] squareMatrix = {{4, 3, 5}, {2, 1, 6}, {9, 7, 8}};
        int sum = 0;

        outer:
        for (int i = 0; i < squareMatrix.length; ++i) { // (1)
            for (int j = 0; j < squareMatrix[i].length; ++j) { // (2)
                if (j == i) break; // (3) Terminate inner loop.
                System.out.println("Element[" + i + ", " + j + "]: " +
                        squareMatrix[i][j]);
                sum += squareMatrix[i][j];
                if (sum > 10) break outer; // (4) Terminate both loops.
            } // end inner loop
            // (5) Continue with update expression in the outer loop h
        } // end outer loop
        // (6) Continue here.
        System.out.println("sum: " + sum);
    }
}

