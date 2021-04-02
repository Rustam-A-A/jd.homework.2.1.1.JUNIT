import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    //BinaryOperator<Integer> devide = (x, y) -> x / y;
    //Причина возникновения ошибки: деление на ноль.
    //Необходимо реализовать предварительную проверку деления на ноль.
    //Решение посредством тернарного оператора
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : -1000000;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> pr = System.out::println;
    Consumer<Boolean> log = System.out::println;
}
