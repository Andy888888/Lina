package lambda;

import core.MainLaunch;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 描述:待描述.
 * <p>
 *
 * @author yanwenqiang.
 * @date 2018/10/22
 */
public class LambdaMain extends MainLaunch {
    @Override
    public void start() {
        consume(s -> System.out.println(s), "哈哈哈");
        System.out.println("=======================");


        andThenConsumer(s -> System.out.println(s.toLowerCase()), s2 -> System.out.println("翻译：大家好"), "HelLO EveryBody ");
        System.out.println("=======================");


        System.out.println(supplier(() -> "你好" + "张三"));
        System.out.println("=======================");


        function(s -> Integer.parseInt(s), "10");
        System.out.println("=======================");


        functionAndThen(s -> Integer.parseInt(s), i -> i *= 10, "10");
        System.out.println("=======================");


        predicate(s -> s.length() > 5, "hello everybody");
        System.out.println("=======================");


        andPredicate(s -> s.length() < 10, s -> s.contains("燕文强"), "hello 燕文强！");
        System.out.println("=======================");


        orPredicate(s -> s.length() < 10, s -> s.contains("燕文强"), "hello 燕文强！");
        System.out.println("=======================");


        negatePredicate(s -> s.length() < 2, "hello");
        System.out.println("=======================");


        method(3, 6, (x, y) -> x * y);
        System.out.println("=======================");


        method1(new Person(12), new Person(18), (a, b) -> new Person(a.money + b.money));


        List<Integer> list = new ArrayList();
        list.add(2);
        list.add(25);
        list.add(86);
        list.add(16);
        list.add(57);
        list.sort((a, b) -> a - b);
        for (Integer item : list) {
            System.out.println(item);
        }

    }

    private void consume(Consumer<String> function, String str) {
        function.accept(str);
    }

    private String supplier(Supplier<String> function) {
        return function.get();
    }

    private void andThenConsumer(Consumer<String> one, Consumer<String> two, String str) {
        one.andThen(two).accept(str);
    }

    private void function(Function<String, Integer> function, String str) {
        int num = function.apply(str);
        System.out.println(num + 20);
    }

    private static void functionAndThen(Function<String, Integer> one, Function<Integer, Integer> two,
                                        String str) {
        int num = one.andThen(two).apply(str);
        System.out.println(num + 50);
    }

    private static void predicate(Predicate<String> predicate, String str) {
        boolean veryLong = predicate.test(str);
        System.out.println("字符串很长吗:" + veryLong);
    }

    private static void andPredicate(Predicate<String> one, Predicate<String> two, String str) {
        boolean isValid = one.and(two).test(str);
        System.out.println("字符串符合要求吗:" + isValid);
    }

    private static void orPredicate(Predicate<String> one, Predicate<String> two, String str) {
        boolean isValid = one.or(two).test(str);
        System.out.println("字符串符合要求吗:" + isValid);
    }

    private static void negatePredicate(Predicate<String> one, String str) {
        boolean isValid = one.negate().test(str);
        System.out.println("字符串符合要求吗:" + isValid);
    }


    private void method(int a, int b, Calclator calclator) {
        int reslut = calclator.clac(a, b);
        System.out.println(reslut);
    }

    private <T> void method1(T a, T b, Calc<T> calclator) {
        T reslut = calclator.clac(a, b);
        System.out.println(reslut);
    }

    private class Person {
        public Person(int money) {
            this.money = money;
        }

        public int money;

        @Override
        public String toString() {
            return "Person{" +
                    "money=" + money +
                    '}';
        }
    }

    interface Calclator {
        int clac(int a, int b);
    }


    interface Calc<T> {
        T clac(T a, T b);
    }
}
