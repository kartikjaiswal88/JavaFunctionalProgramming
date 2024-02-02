package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {

        // Printing all the Numbers in List using Structured Approach
        printAllNumbersInListFunctional(List.of(1, 2, 3, 5, 4, 6, 44, 5, 12, 4));
    }

    private static void print(int number) {
        System.out.println(number);
    }

    public static void printAllNumbersInListFunctional(List<Integer> numbers) {
        // Converting the list of numbers into Stream

        numbers.stream().forEach(FP01Functional::print); // Method Reference
    }
}
