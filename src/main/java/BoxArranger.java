package main.java;

public class BoxArranger {
    public static String solve(int clawPos, int[] boxes, int boxInClaw) {
        int target = 0;
        for (int numBoxes : boxes) {
            target += numBoxes;
        }
        target /= boxes.length;  // Nombre cible de boîtes par tas
        while (true) {
            if (boxes[clawPos] > target) {  // S'il y a trop de boîtes sur le tas actuel
                if (boxInClaw == 0) {  // Si le bras ne porte pas de boîte, il doit en attraper une
                    return "PICK";
                } else {  // Sinon, il doit la poser et passer au tas suivant
                    return "PLACE";
                }
            }// S'il y a moins de boîtes que la cible, le bras doit se déplacer pour trouver une boîte supplémentaire
            if (clawPos < boxes.length - 1) {
                return "RIGHT";  // Se déplacer vers la droite
            } else if (clawPos > 0) {
                return "LEFT";  // Se déplacer vers la gauche
            } else {
                return "";  // Aucune action à effectuer, la disposition est correcte
            }
        }
    }

    public static void main(String[] args) {
        int clawPos = 2;
        int[] boxes = {5, 4, 6, 3};
        int boxInClaw = 0;

        String command = solve(clawPos, boxes, boxInClaw);
        System.out.println(command);
    }
}
