package com.introductiontojava8;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
interface EvenSquare{
    Predicate<Integer> checkEven = num -> num % 2 == 0;
    Function<Integer, Integer> square = num -> num * num;
    Consumer<Integer> println = num -> System.out.println(num);
    Supplier<Double> randomValue = () -> Math.random();
}
public class ques5 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(15,89,45,5,6,74,26);
        System.out.println("Supplier functional interface: " + EvenSquare.randomValue.get());
        nums.stream()
                .filter(EvenSquare.checkEven)
                .map(EvenSquare.square)
                .forEach(EvenSquare.println);
    }
}
