package com.sajeewa.test1.problem;

import java.util.ArrayList;
import java.util.List;

public class Five {


    public  void findExpressionsTo100() {
        List<String> results = new ArrayList<>();
        generateExpressions("1", 2, results);

        for (String expr : results) {
            System.out.println(expr);
        }
    }

    private  void generateExpressions(String expression, int nextNumber, List<String> results) {
        if (nextNumber == 10) {
            if (evaluateExpression(expression) == 100) {
                results.add(expression);
            }
            return;
        }

        generateExpressions(expression + "+" + nextNumber, nextNumber + 1, results);
        generateExpressions(expression + "-" + nextNumber, nextNumber + 1, results);
        generateExpressions(expression + nextNumber, nextNumber + 1, results);  // Concatenation
    }

    private  int evaluateExpression(String expression) {
        List<Integer> numbers = new ArrayList<>();
        List<Character> operators = new ArrayList<>();

        int num = 0;
        char sign = '+';
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            if (!Character.isDigit(ch) || i == expression.length() - 1) {
                if (sign == '+') {
                    numbers.add(num);
                } else if (sign == '-') {
                    numbers.add(-num);
                }
                num = 0;
                if (!Character.isDigit(ch)) {
                    sign = ch;
                }
            }
        }

        return numbers.stream().mapToInt(Integer::intValue).sum();
    }
}
