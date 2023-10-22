package ocp.ocp_newBook.chap2;

/**
 * @author $ Devalère
 **/
public class CandyCounter {
    static double addCandy(double fruit, float vegetables) { //float cause a compilation error
        return (int) fruit + vegetables;
    }

    public static void main(String[] args) {
        System.out.print(addCandy(1.4, 2.4f) + ", ");
        System.out.print(addCandy(1.9, (float) 4) + ", ");
        System.out.print(addCandy((long) (int) (short) 2, (float) 4));
        System.out.println("\n");
             int pig = (short)4;
             pig = pig++;
             long goat = (int)2;
             goat -= 1.0;
             System.out.print(pig + " - " + goat);
            System.out.println("\n");

/*            short height = 1, weight = 3;
            short zebra = (byte) weight * (byte) height;
            double ox = 1 + height * 2 + weight;
            long giraffe = 1 + 9 % height + 1;
            System.out.println(zebra);
            System.out.println(ox);
            System.out.println(giraffe);*/

             int sample1 = (2 * 4) % 3;
             int sample2 = 3 * 2 % 3;
             int sample3 = 5 * (1 % 2);
             System.out.println(sample1 + ", " + sample2 + ", " + sample3);

/*            int note = 1 * 2 + (long)3;
            short melody = (byte)(double)(note *= 2);
            double song = melody;
            float symphony = (float)((song == 1_000f) ? song * 2L : song);*/
            System.out.println("\n");

            int start = 7;
             int end = 4;
             end += ++start;
             start = (byte)(Byte.MAX_VALUE + 1);
            System.out.println(end);
            System.out.println(start);

    }
}
