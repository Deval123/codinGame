package main.java.codin;


class PlayerSole {

    public static int solve(int weight0, int weight1, int weight2) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        int[] weights = {weight0, weight1, weight2};
        int maxWeight = Integer.MIN_VALUE;
        int maxIndex = -1;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
}