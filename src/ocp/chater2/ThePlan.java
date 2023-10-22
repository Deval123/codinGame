package ocp.chater2;

import java.util.List;

/**
 * @author $ Devalère
 **/
public class ThePlan {
    public static void main(String[] input) {
/*        var race = "";
        loop:
        do {
            race += "x";
            break loop;
        } while (true);
        System.out.println(race);*/

/*        int count = 0;
        char letter = 'A';
        switch (letter) {
            case 'A' -> count++;
            case 'B' -> count++;
        }
        System.out.println(count);
        var bottles = List.of("glass", "plastic", "can");
        for (int type = 0; type < bottles.size();) {
            System.out.print(bottles.get(type) + "-");
            if(type < bottles.size()) break;
        }
        System.out.print("end");*/
        final int GOOD = 100;
        int score = 10;
        switch (score) {
            default:
                System.out.print("1-");
                break;
            case -1:
                System.out.print("2-");
                break;
            case 4:
            case 5:
                System.out.print("3-");
                break;
            case 6:
                System.out.print("4-");
                break;
            case 9:
                System.out.print("5-");
                break;
        }

    }

    public void perform(String[] circus) {
        for (int i=circus.length-1; i>=0; i--)
            System.out.print(circus[i]);

        for (int i=circus.length; i>0; i--)
            System.out.print(circus[i-1]);

        for (var i=0; i<circus.length; i++)
            System.out.print(circus[circus.length-i-1]);
    }
}


