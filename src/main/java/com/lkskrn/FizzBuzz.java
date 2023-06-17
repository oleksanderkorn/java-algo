package com.lkskrn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {

    enum Method {
        FOR_EACH_LOOP,
        FOR_LOOP,
        WHILE_LOOP,
        ITERATOR,
        STREAM_API,
    }


    public List<String> fizzBuzz(int n, Method method) {
        switch (method) {
            case FOR_LOOP -> {
                return fizzBuzzForLoop(n);
            }
            case FOR_EACH_LOOP -> {
                return fizzBuzzForEachLoop(n);
            }
            case WHILE_LOOP -> {
                return fizzBuzzWhileLoop(n);
            }
            case ITERATOR -> {
                return fizzBuzzIterator(n);
            }
            case STREAM_API -> {
                return fizzBuzzStreamApi(n);
            }
        }
        return new ArrayList<>();
    }

    public List<String> fizzBuzzForLoop(int n) {
        List<String> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            fizzBuzz(i, l);
        }
        return l;
    }


    private List<String> fizzBuzzStreamApi(int n) {
        List<String> l = new ArrayList<>();
        IntStream.rangeClosed(1, n).forEach(i -> fizzBuzz(i, l));
        return l;
    }

    private List<String> fizzBuzzIterator(int n) {
        List<String> l = new ArrayList<>();
        IntStream.iterate(1, i -> i + 1)
                .limit(n)
                .forEach(i -> fizzBuzz(i, l));
        return l;
    }

    private List<String> fizzBuzzWhileLoop(int n) {
        List<String> l = new ArrayList<>();
        int counter = 1;

        while (counter <= n) {
            fizzBuzz(counter, l);
            counter++;
        }
        return l;
    }

    private List<String> fizzBuzzForEachLoop(int n) {
        List<String> l = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        numbers.forEach(i -> fizzBuzz(i, l));
        return l;
    }

    private static void fizzBuzz(int n, List<String> l) {
        boolean isFizz = n % 3 == 0;
        boolean isBuzz = n % 5 == 0;

        if (isFizz && isBuzz) {
            l.add("FizzBuzz");
        } else if (isFizz) {
            l.add("Fizz");
        } else if (isBuzz) {
            l.add("Buzz");
        } else {
            l.add(String.valueOf(n));
        }
    }
}
