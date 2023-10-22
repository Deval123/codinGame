package ocp.ocp_newBook.chap3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author $ Devalère
 **/
public class Squawk {
    public static void main(String[] args) {
        int sing = 8, squawk = 2, notes = 0;
        while (sing > squawk) {
            sing--;
            squawk += 2;
            notes += sing + squawk;
        }
        System.out.println(notes);

/*        double iguana = 0;
        do {
            int snake = 1;
            System.out.print(snake++ + " ");
            iguana--;
        } while (snake <= 5);
        System.out.println(iguana);*/

/*        int height = 1;
        L1:
        while (height++ < 10) {
            long humidity = 12;
            L2:
            do {
                if (humidity-- % 12 == 0) ; continue ;
                int temperature = 30;
                L3:
                for (; ; ) {
                    temperature++;
                    if (temperature > 50) ;continue ;
                }
            } while (humidity > 4);
        }*/
        final char a = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {
            default:
            case a:
            case 'B': case 'C': System.out.print("great ");
            case 'D': System.out.print("good "); break;
            case e:
            case 'F': System.out.print("not good ");
        }
    }

    public void pen() {
        int att = -6;
        for (var penguin : new int[2])
            System.out.println(penguin);
        var ostrich = new Character[3];
        for (var emu : ostrich)
            System.out.println(emu);
        List<Integer> parrots = new ArrayList<Integer>();
        for (var macaw : parrots)
            System.out.println(macaw);

        final char a = 'A', e = 'E';
        char grade = 'B';
        switch (grade) {
            default:
            case a:
            case 'B', 'C':
                System.out.print("great ");
            case 'D':
                System.out.print("good ");
                break;
            case e:
            case 'F':
                System.out.print("not good ");
        }
    }
}
