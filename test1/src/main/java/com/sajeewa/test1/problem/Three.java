package com.sajeewa.test1.problem;

import java.util.ArrayList;
import java.util.List;

public class Three {

    public static List<Long> generateFirst100Fibonacci() {
        List<Long> fibonacciList = new ArrayList<>(100);

        fibonacciList.add(0L);
        fibonacciList.add(1L);

        for (int i = 2; i < 100; i++) {
            long nextFib = fibonacciList.get(i - 1) + fibonacciList.get(i - 2);
            fibonacciList.add(nextFib);
        }

        return fibonacciList;
    }
}
