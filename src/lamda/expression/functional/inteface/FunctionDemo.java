package lamda.expression.functional.inteface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer, Integer> function = number -> number * 2;
        System.out.println(function.apply(2));

        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream().map(number -> number * 3).forEach(System.out::println);

        list.stream().map(function).forEach(System.out::println);
    }
}
