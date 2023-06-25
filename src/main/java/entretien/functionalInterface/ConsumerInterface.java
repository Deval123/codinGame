package main.java.entretien.functionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/*L'interface fonctionnelle "Consumer" est généralement utilisée dans le cadre de la programmation fonctionnelle
pour représenter une fonction qui consomme (ou utilise) une valeur sans en retourner une nouvelle.
Elle est couramment utilisée dans des opérations telles que le filtrage, la transformation ou l'affichage de
données.

Un exemple concret d'utilisation de l'interface fonctionnelle "Consumer" serait le traitement d'une liste d'objets.
Supposons que nous ayons une liste d'employés et que nous souhaitions afficher le nom de chaque employé à l'écran.*/
    class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public class ConsumerInterface {
        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee("John"),
                    new Employee("Jane"),
                    new Employee("Mike")
            );

            // Utilisation de l'interface Consumer pour afficher le nom de chaque employé
            Consumer<Employee> printName = employee -> System.out.println(employee.getName());

            // Parcourir la liste d'employés et appliquer l'action définie par le Consumer
            employees.forEach(printName);
        }
    }


/*
L'utilisation de l'interface Consumer dans cet exemple permet de séparer la logique de traitement
(l'affichage du nom) de la logique de parcours de la liste. Cela rend le code plus modulaire et facilite la
réutilisation du Consumer dans d'autres parties de l'application.

En résumé, l'interface Consumer est utile lorsqu'on souhaite effectuer des opérations sur des valeurs sans en
retourner de nouvelles, comme dans l'exemple de l'affichage des noms d'employés.*/
