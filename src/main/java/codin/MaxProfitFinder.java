package main.java.codin;

/*Le code fourni est une implémentation d'un algorithme pour trouver le sous-tableau (sous-séquence) d'un tableau donné qui maximise la somme des éléments.
Le tableau d'entrée est représenté par la liste data.
* */

import java.util.Arrays;
        import java.util.List;

public class MaxProfitFinder {

    public static List<Integer> findMaxProfitSubarray(List<Integer> data) {
        int maxProfit = 0;
        int currentProfit = 0;
        int startIndex = 0;
        int endIndex = -1;

        for (int i = 0; i < data.size(); i++) {
            int profit = data.get(i);
            currentProfit += profit;

            if (currentProfit < 0) {
                currentProfit = 0;
                startIndex = i + 1;
            } else if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
                endIndex = i;
            }
        }

        // Ajouter 1 à l'indice startIndex et endIndex pour correspondre à la position réelle
        return Arrays.asList(startIndex + 1, endIndex + 1);
    }

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(-2, -3, 4, -1, -2, 1, 5, -3);
        List<Integer> maxProfitSubarray = findMaxProfitSubarray(data);
        System.out.println("Indice de début : " + maxProfitSubarray.get(0));
        System.out.println("Indice de fin : " + maxProfitSubarray.get(1));
    }
}
