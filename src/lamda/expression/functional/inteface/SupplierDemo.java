package lamda.expression.functional.inteface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Predicate<Integer> predicate = number -> number % 2 == 0;
        Supplier<Integer> supplier = () -> 10;

        List<Integer> list1 = Arrays.asList(1,3,5,7);
        List<Integer> list2 = Arrays.asList(1,2,5,6);

        System.out.println(list2.stream().filter(predicate).findAny().orElseGet(supplier));
        System.out.println(list1.stream().filter(predicate).findAny().orElseGet(supplier));
    }
}
