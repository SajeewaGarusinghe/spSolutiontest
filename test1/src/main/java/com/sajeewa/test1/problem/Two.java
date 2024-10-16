package com.sajeewa.test1.problem;

import java.util.ArrayList;
import java.util.List;

public class Two {
    public static <T, U> List<Object> combineAlternating(List<T> list1, List<U> list2) {
        List<Object> result = new ArrayList<>();
        int size = Math.min(list1.size(), list2.size());

        for (int i = 0; i < size; i++) {
            result.add(list1.get(i));
            result.add(list2.get(i));
        }

        if (list1.size() > size) {
            result.addAll(list1.subList(size, list1.size()));
        }
        if (list2.size() > size) {
            result.addAll(list2.subList(size, list2.size()));
        }

        return result;
    }
}
