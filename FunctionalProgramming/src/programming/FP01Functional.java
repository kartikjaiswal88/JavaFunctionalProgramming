package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        // Printing all the Numbers in List using Functional Approach
        List<Integer> numbers = List.of(1, 2, 3, 5, 4, 6, 44, 5, 12, 4);
        printAllNumbersInListFunctional(numbers);
        printSquareOfEvenNumbersInListFunctional(numbers);
    }

    public static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // Converting the list of numbers into Stream

        // numbers.stream().forEach(FP01Functional::/print); // Method Reference
        numbers.stream()
                .filter(num -> num % 2 == 0) // Lambda Expression
                .forEach(System.out::println);
    }

    public static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num ->num*num)
                .forEach(System.out::println);


    }
}
