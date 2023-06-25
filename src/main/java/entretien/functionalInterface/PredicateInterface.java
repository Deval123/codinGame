package main.java.entretien.functionalInterface;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


/*L'interface fonctionnelle "Predicate" est utilisée dans le cadre de la programmation fonctionnelle pour
représenter une fonction qui prend un argument en entrée et renvoie un résultat booléen, indiquant si l'argument
satisfait une certaine condition ou prédicat.

Un exemple concret d'utilisation de l'interface fonctionnelle "Predicate" serait la vérification de la validité d'un
élément d'une liste selon un critère spécifique.*/


public class PredicateInterface {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Utilisation de l'interface Predicate pour vérifier si un nombre est pair
        Predicate<Integer> isEven = number -> number % 2 == 0;

        // Filtrer les nombres pairs de la liste
        List<Integer> evenNumbers = filterNumbers(numbers, isEven);

        System.out.println("Nombres pairs : " + evenNumbers);
    }

    public static List<Integer> filterNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        // Créer une nouvelle liste pour stocker les nombres validant le prédicat
        List<Integer> filteredNumbers = new ArrayList<>();

        // Parcourir la liste et ajouter les nombres validant le prédicat à la nouvelle liste
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                filteredNumbers.add(number);
            }
        }

        return filteredNumbers;
    }
}

/*
L'utilisation de l'interface Predicate dans cet exemple permet de séparer la logique de test de la validité d'un
élément de la logique de filtrage. Cela rend le code plus modulaire et facilite la réutilisation du prédicat dans
d'autres parties de l'application.

En résumé, l'interface Predicate est utile lorsqu'on souhaite effectuer une évaluation ou un test sur un élément et
obtenir un résultat booléen, comme dans l'exemple de vérification de la parité d'un nombre.*/
