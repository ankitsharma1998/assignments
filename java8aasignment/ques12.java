package com.introductiontojava8;
import java.util.List;
import java.util.Optional;

public class ques12 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(15,89,43,75,74,26,88,45,66);
        Optional<Integer> n =  nums.stream()
                .filter(x -> x%2==0 & x>3 )
                .findFirst();
        System.out.println("first even number greater than 3 are: " + n);
    }
}
