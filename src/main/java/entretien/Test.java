package main.java.entretien;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares); // Affiche [1, 4, 9, 16, 25]
    }
}
// List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

// Integer[] array = {1, 2, 3, 4, 5};
//List<Integer> numbers = Arrays.stream(array)
//                              .collect(Collectors.toList()); la méthode Stream avec toArray()

// List<Integer> numbers = List.of(1, 2, 3, 4, 5); : la méthode List.of() (disponible à partir de Java 9).