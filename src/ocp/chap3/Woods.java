package ocp.chap3;

/**
 * @author $ Devalère
 **/
public class Woods {
    static class Tree {}
    public static void main(String[] leaves) {
        int heat = 2;
        final int water = 10-heat;
        final class Oak extends Tree { // p1
            public int getWater() {
                return water; // p2
            }
        }
        System.out.print(new Oak().getWater());
        //water = 0;
    } }
