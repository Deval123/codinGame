package main.java.stocks;

/**
 * @author $ Devalère
 **/
public class Bond {
    private static int price = 5;

    public boolean sell() {
        if (price < 10) {
            price++;
            return true;
        } else if (price >= 10) {
            return false;
        }
        return false; // sell() method won't compile without this return
    }

    public static void main(String[] cash) {
        new Bond().sell();
        new Bond().sell();
        new Bond().sell();
        System.out.print(price);
    }
}

class Fly {
    public Fly Fly() {
        return new Fly();
    }

    public void Fly(int kite) {
    }

    public int Fly(long kite) {
        return 1;
    }

    public static void main(String[] a) {
        var f = new Fly();
        f.Fly();
    }


}