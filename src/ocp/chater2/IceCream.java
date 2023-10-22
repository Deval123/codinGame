package ocp.chater2;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author $ Devalère
 **/
public class IceCream {
    public final static void main(String... args) {
/*
        var flavors = 30;
        int eaten = 0;
        switch(flavors) {
            case 40: eaten+=2;
            case 30: eaten++;

            default: eaten+=10;

        }
        System.out.print(eaten);
        int numChipmunks =1;
        switch (numChipmunks) {
            case 1: System.out.println("One chipmunk");
            case 2: System.out.println("Two chipmunks");
            case 3: System.out.println("Three chipmunks");
        }
*/

        var list = List.of("Austin", "Boston",
                "San Francisco");
        var c = list.stream()
                .filter(a -> a.length() > 10) // line x
                .peek(System.out::println);
/*        boolean balloonInflated = false;
        do{
            if (balloonInflated) {
                balloonInflated = true;
                System.out.print("inflate-");
            }
        } while(!balloonInflated);
        System.out.println("done");*/

 /*       for (int k=0; k < 5; k++) {
            System.out.print(k);
        }
        System.out.println("********");
        for (int k=1; k <= 5; k++) {
            System.out.print(k);
        }

        System.out.println("********");
        int k=0; do {
            System.out.print(k);
        } while(k++ < 5);
        System.out.println("********");
        int k1=0; while (k1++ < 5) {
            System.out.print(k1);
        }
        System.out.println("********");
        int count = 0;
        var stops = new String[] { "Washington", "Monroe",
                "Jackson", "LaSalle" };
        while (count < stops.length)
            if (stops[++count].length() < 8)
                break;
            else continue;
        System.out.println(count);

        System.out.println("********");*/
/*        int hops = 0;
        int jumps = 0;
        jumps = hops++;
        if(jumps)
            System.out.print("Jump!");
        else
            System.out.print("Hop!");*/
        var stream = Stream.iterate(1, i -> i);
        var b = stream.anyMatch(i -> i > 5);
        System.out.println(b);

    }

    public void o(Object obj) {
        if (!(obj instanceof LocalDate date))
            return;
        else
            System.out.println(date);
    }

    public void r(Object obj) {
        if (!(obj instanceof LocalDate date))
            return;
        System.out.println(date);


    }


}
