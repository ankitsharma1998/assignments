package com.introductiontojava8;

import java.util.List;

public class ques10 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(15,89,43,75,74,26,88,45,66);
        int n = nums.stream()
                .filter(x -> x>5)
                .reduce(0,(x,y) -> x+y );

        System.out.println("sum is: " + n);
    }
}
