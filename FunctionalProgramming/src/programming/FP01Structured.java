package programming;
import java.util.List;

public class FP01Structured {
        public static void main(String[] args) {
            
            // Printing all the Numbers in List using Structured Approach
            printAllNumbersInListStructured(List.of(1,2,3,5,4,6,44,5,12,4));
        }

        public static void printAllNumbersInListStructured(List<Integer> numbers)
        {
            for(int number:numbers)
            {
                System.out.println(number);
            }
        }
}
