package main.java.entretien.functionalInterface;


import java.util.Random;
import java.util.function.Supplier;

/*L'interface fonctionnelle "Supplier" est utilisée dans le cadre de la programmation fonctionnelle pour
représenter une fonction qui ne prend aucun argument en entrée et qui fournit (ou "supplie") une valeur en retour.
Elle est souvent utilisée pour générer ou fournir des valeurs sur demande.

Un exemple concret d'utilisation de l'interface fonctionnelle "Supplier" serait la génération d'un nombre aléatoire.
Supposons que nous souhaitions obtenir un nombre aléatoire à chaque appel d'une fonction.*/

public class SupplierInterface {
    public static void main(String[] args) {
        // Utilisation de l'interface Supplier pour générer un nombre aléatoire
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();

        // Appel de la fonction pour obtenir un nombre aléatoire
        int randomNumber = randomNumberSupplier.get();

        System.out.println("Nombre aléatoire : " + randomNumber);
    }
}

/*
L'utilisation de l'interface Supplier dans cet exemple permet d'encapsuler la logique de génération du nombre aléatoire
dans une fonction réutilisable. Cela peut être utile lorsque nous avons besoin d'obtenir des valeurs à la demande,
sans avoir à dupliquer la logique de génération à plusieurs endroits.

En résumé, l'interface Supplier est utile lorsque nous avons besoin d'une fonction qui ne prend aucun argument en
entrée et qui fournit une valeur en retour, comme dans l'exemple de génération d'un nombre aléatoire.*/
