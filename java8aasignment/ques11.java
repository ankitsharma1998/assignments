package com.introductiontojava8;

import java.util.List;
import java.util.OptionalDouble;

public class ques11 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(15,89,45,5,6,74);
        OptionalDouble y =  nums.stream()
                .mapToInt(i -> 2*i)
                .average();
        System.out.println("Average is: " + y);
    }
}
