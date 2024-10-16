package com.sajeewa.test1.problem;

import java.util.List;

public class One {
    public  int sumUsingForLoop(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    public  int sumUsingWhileLoop(List<Integer> numbers) {
        int sum = 0;
        int i = 0;
        while (i < numbers.size()) {
            sum += numbers.get(i);
            i++;
        }
        return sum;
    }



    public  int sumUsingRecursion(List<Integer> numbers) {
        return sumRecursiveHelper(numbers, 0);
    }

    private  int sumRecursiveHelper(List<Integer> numbers, int index) {
        if (index == numbers.size()) {
            return 0;
        }
        return numbers.get(index) + sumRecursiveHelper(numbers, index + 1);
    }
}
