package pl.javastart.euler2;

import java.util.ArrayList;
import java.util.List;

public class Euler2 {

    public static void main(String[] args) {
        Euler2 euler2 = new Euler2();
        int limit = 4000000;
        euler2.calculateSumOfEvenFibonacciElements(limit);
    }

    private List<Integer> createFibonacciElementsFrom1ToSmallerThenLimit(int limit) {
        List<Integer> fibonacciList = new ArrayList<>();
        int number = 0;
        int nextElement = 1;
        while (nextElement < limit) {
            if (number == 0) {
                fibonacciList.add(nextElement);
            } else if (number == 1) {
                nextElement = 2;
                fibonacciList.add(nextElement);
            } else {
                nextElement = fibonacciList.get(number - 2) + fibonacciList.get(number - 1);
                fibonacciList.add(nextElement);
            }
            number++;
        }
        return fibonacciList;
    }

    long calculateSumOfEvenFibonacciElements(int limit) {
        return createFibonacciElementsFrom1ToSmallerThenLimit(limit).stream()
                .filter(x -> x % 2 == 0)
                .reduce(Integer::sum).get();
    }
}
