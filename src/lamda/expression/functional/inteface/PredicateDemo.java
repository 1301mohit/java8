package lamda.expression.functional.inteface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = number -> number % 2 == 0;
        System.out.println(predicate.test(7));

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().filter(number -> number % 2 == 0).forEach(even -> System.out.println(even));

        list.stream().filter(predicate).forEach(System.out::println);
    }
}
