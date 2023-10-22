package main.java.codin;

/**
 * @author $ Devalère
 **/
public class LuckyMoneyDistributor {
    public static int luckyMoney(int money, int giftees) {
        // Assurez-vous que le budget est suffisant pour donner au moins 1 yuan à chaque petit-enfant
        if (money < giftees) {
            return 0;  // Impossible de donner un montant égal à 8
        }

        // Initialisation du compteur de dons égaux à 8
        int luckyCount = 0;

        // Parcourez chaque petit-enfant
        for (int i = 0; i < giftees; i++) {
            // Si le budget est suffisant pour donner 8, faites-le
            if (money >= 8) {
                money -= 8;
                luckyCount++;
            }
            // Sinon, donnez tout le reste du budget
            else {
                money = 0;
            }
        }

        return luckyCount;
    }

    public static void main(String[] args) {
        int money = 40;  // Exemple de budget
        int giftees = 5;  // Exemple de nombre de petits-enfants
        int result = luckyMoney(money, giftees);
        System.out.println("Nombre de dons égaux à 8 : " + result);
    }
}
