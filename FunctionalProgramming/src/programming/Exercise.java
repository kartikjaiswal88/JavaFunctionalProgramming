package programming;

import java.util.List;

public class Exercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 5, 4, 6, 44, 5, 12, 4);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                "Kubernetes");

        System.out.println("Printing the Odd Numbers:");
        numbers.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Printing the Cube of Odd Numbers:");
        numbers.stream()
                .filter(num -> num % 2 == 1)
                .map(num -> num* num * num)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Printing all the Courses");
        courses.stream()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Printing Courses having word 'Spring' ");
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Printing Courses having atleast 4 characters");
        courses.stream()
                .filter(course -> course.length()>=4)
                .forEach(System.out::println);
        System.out.println();

        System.out.println("Printing the number of characters in Each Course    ");
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
        System.out.println();

    }
}
