package lamda.expression.functional.inteface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {
        Consumer<Integer> consumer = number -> System.out.println("Printing : "+number);
        consumer.accept(10);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.forEach(number -> System.out.println("Print : "+ number));

        list.forEach(consumer);
    }
}
