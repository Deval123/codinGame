package main.java.entretien.functionalInterface;


import java.util.function.Function;

/*L'interface fonctionnelle "Function" est utilisée dans le cadre de la programmation fonctionnelle pour représenter
une fonction qui prend un argument en entrée, effectue une opération sur cet argument, et renvoie un résultat.

Un exemple concret d'utilisation de l'interface fonctionnelle "Function" serait la transformation d'une valeur
d'un type à un autre.*/


public class FunctionInterface {
    public static void main(String[] args) {
        // Utilisation de l'interface Function pour convertir une chaîne en entier
        Function<String, Integer> stringToInt = str -> Integer.parseInt(str);

        String numberString = "42";
        int number = stringToInt.apply(numberString);

        System.out.println("Nombre : " + number);
    }
}

/*
L'utilisation de l'interface Function dans cet exemple permet de séparer la logique de conversion d'une chaîne en
entier de la logique d'utilisation de cette conversion. Cela rend le code plus modulaire et facilite la réutilisation
de la fonction de conversion dans d'autres parties de l'application.

En résumé, l'interface Function est utile lorsqu'on souhaite effectuer une opération de transformation sur une
valeur et obtenir un résultat, comme dans l'exemple de conversion d'une chaîne de caractères en un entier.*/
