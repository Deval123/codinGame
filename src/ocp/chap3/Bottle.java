package ocp.chap3;

/**
 * @author $ Devalère
 **/
public class Bottle {
    public static class Ship {

        private enum Sail { // w1
            TALL {
                protected int getHeight() {
                    return 100;
                }
            },
            SHORT {
                protected int getHeight() {
                    return 2;
                }
            };

            protected abstract int getHeight();
        }

        public Sail getSail() {
            return Sail.TALL;
        }
    }

    public static void main(String[] stars) {
        var bottle = new Bottle();
        Ship q = new Ship(); // w2 to use "Bottle.new Ship();" you must remove static keyword on the Ship class.
        System.out.print(q.getSail());
    }
}

