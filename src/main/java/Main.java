import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = calc.devide.apply(a, b);
        //Причина возникновения ошибки: деление на ноль.
        //Необходимо реализовать предварительную проверку деления на ноль.
        //Решение посредством тернарного оператора

        int d = calc.multiply.apply(23, 2);
        int e = calc.pow.apply(5);
        boolean f = calc.isPositive.test(-345);

        calc.pr.accept(a);
        calc.pr.accept(b);
        if (c == -1000000) {
            System.out.println("Деление на ноль запрещено!");
        } else {
            calc.pr.accept(c);
        }
        calc.pr.accept(d);
        calc.pr.accept(e);
        calc.log.accept(f);
    }
}
