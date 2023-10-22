package main.java.codin;

import java.util.List;

public class BlockOrdonner {


    public static int solve(int width, int height, int nb_blocks, List<String> grid) {
        int rightmostBlock = -1;

        for (String row : grid) {
            for (int i = 0; i < row.length(); i++) {
                char ch = row.charAt(i);
                if (Character.isDigit(ch)) {
                    int blockNumber = Character.getNumericValue(ch);
                    boolean canMoveRight = true;

                    // Vérifier si le bloc peut se déplacer vers la droite
                    for (int j = i + 1; j < row.length(); j++) {
                        char nextChar = row.charAt(j);
                        if (nextChar == 'x' || Character.isDigit(nextChar)) {
                            canMoveRight = false;
                            break;
                        }
                    }

                    if (canMoveRight && (rightmostBlock == -1 || blockNumber > rightmostBlock)) {
                        rightmostBlock = blockNumber;
                    }
                }
            }
        }

        return rightmostBlock;
    }
}