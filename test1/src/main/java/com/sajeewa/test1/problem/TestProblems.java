package com.sajeewa.test1.problem;

import java.util.Arrays;
import java.util.List;

public class TestProblems {
    public void testAllProblems(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        One one= new One();
        System.out.println("problem 1 answer using for loop:" + one.sumUsingForLoop(numbers));
        System.out.println("problem 1 answer using while loop:" + one.sumUsingWhileLoop(numbers));
        System.out.println("problem 1 answer using recursion:" + one.sumUsingRecursion(numbers));


        Two two = new Two();
        List<String> list1 = List.of("a", "b", "c");
        List<Integer> list2 = List.of(1, 2, 3);
        System.out.println("problem 2 answer:" + two.combineAlternating(list1, list2));

        Three three = new Three();
        System.out.println("problem 3 answer:" + three.generateFirst100Fibonacci());

        Four four = new Four();
        List<Integer> nums=Arrays.asList(3, 30, 34, 5, 9);
        System.out.println("problem 4 answer:" + four.largestNumberPossible(numbers));

        Five five = new Five();
        System.out.println("problem 5 answer:");
//        five.findExpressionsTo100();//uncomment to run
    }
}
