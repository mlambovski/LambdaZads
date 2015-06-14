package lab9zad1;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTests {

    public void method(Function<Double, Double> function) {
        System.out.println("Reference: " + function.apply(5.0));
    }

    public static double addNum(double num) {
        return num + 2.0;
    }

    public double substractNum(double num) {
        return num - 2.0;
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 10;
        System.out.println("Predicate: " + predicate.test(11));
        Computer c1 = new Computer("Delux", 2500);
        Computer c2 = new Computer("Asus", 2322);
        BiPredicate<Computer, Computer> compPredicate
                = (x, y)
                -> x.getProcSpeed() > y.getProcSpeed();
        System.out.println("BiPredicate: " + compPredicate.test(c1, c2));
        Function<Computer, Double> compFunction
                = comp -> new Double(comp.getProcSpeed() * 2 - 15 / 6);
        System.out.println("Function: " + compFunction.apply(c1));
        Consumer<Integer> consumer
                = x -> System.out.println("Consumer: " + x * x);;
        consumer.accept(5);
        Supplier<String> supplier = () -> c2.toString();
        System.out.println("Supplier: " + supplier.get());
        BinaryOperator<Integer> binaryOper = (x1, x2) -> x1 + x2;
        System.out.println("BinaryOperator: " + binaryOper.apply(5, 6));
        LambdaTests test = new LambdaTests();
        test.method(x -> x * x);
        test.method(LambdaTests::addNum);
        test.method(test::substractNum);
        Artist[] artists = new Artist[]{new Artist("John"), new Artist("Maria"),
            new Artist("Cory"), new Artist("Newman")};
        long totalMembers = Arrays.stream(artists).count();
        System.out.println("Total artists: " + totalMembers);
    }
}
