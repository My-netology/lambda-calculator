import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> (x - y);
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> devide = (x, y) -> y == 0 ? 0 : x / y;
    BinaryOperator<Integer> devide = (x, y) -> {
        if (y == 0) {
            throw new ArithmeticException("Внимание! На ноль делить нельзя.");
        }
        return x / y;
    };

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x < 0 ? -1 * x : x;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
