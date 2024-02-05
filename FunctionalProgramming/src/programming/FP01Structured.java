package programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {

        // Printing all the Numbers in List using Structured Approach
        List<Integer> numbers = List.of(1, 2, 3, 5, 4, 6, 44, 5, 12, 4);
        printAllNumbersInListStructured(numbers);
        printAllEvenNumbersInListStructured(numbers);
    }

    public static void printAllNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printAllEvenNumbersInListStructured(List<Integer> numbers) {
        for (int number : numbers) {
            if (number % 2 == 0)
                System.out.println(number);
        }
    }
}
