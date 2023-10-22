package ocp.chater2;

import java.util.List;

/**
 * @author $ Devalère
 **/
enum Admission {ADULT, SENIOR, CHILD}

public class Movie {
    public static void main(String[] args) {
        var price = switch (Admission.CHILD) {
            case ADULT -> 12.50;
            case SENIOR, CHILD -> 10;
        };
        System.out.println(price);

        var quest = List.of(3)
                ;
        for(var zelda : quest) {
            System.out.print(zelda);
        }


    }

    public void zero(Object number) {

    }
}
