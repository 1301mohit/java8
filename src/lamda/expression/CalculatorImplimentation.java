package lamda.expression;

@FunctionalInterface
interface Calculator {
//    void switchOn();

    int subtract(int number1, int number2);
}

public class CalculatorImplimentation {
    public static void main(String[] args) {
//        Calculator calculator = () -> System.out.println("Switch On");
//        calculator.switchOn();

        Calculator calculator = (number1,number2) -> {
            if(number2 < number1)
                throw new RuntimeException("Second number must be greater than first number");
            return number2 - number1;
        };
        System.out.println(calculator.subtract(3,7));
    }
}
