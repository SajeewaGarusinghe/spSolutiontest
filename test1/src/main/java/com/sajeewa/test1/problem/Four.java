package com.sajeewa.test1.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Four {
    public static String largestNumberPossible(List<Integer> nums) {
        ArrayList<String> strNums = new ArrayList<>();
        for (Integer num : nums) {
            strNums.add(String.valueOf(num));
        }

        Collections.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });


        if (strNums.get(0).equals("0")) {
            return "0";
        }


        StringBuilder largestNumber = new StringBuilder();
        for (String num : strNums) {
            largestNumber.append(num);
        }

        return largestNumber.toString();
    }
}
