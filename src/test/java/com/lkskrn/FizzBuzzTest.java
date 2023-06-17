package com.lkskrn;

import static com.lkskrn.FizzBuzz.Method.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void fizzBuzz() {
        var fb = new FizzBuzz();
        var expected = new String[] {
            "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
            "11", "Fizz", "13", "14", "FizzBuzz"
        };
        assertArrayEquals(expected, fb.fizzBuzz(15, FOR_LOOP).toArray(new String[0]));
        assertArrayEquals(expected, fb.fizzBuzz(15, FOR_EACH_LOOP).toArray(new String[0]));
        assertArrayEquals(expected, fb.fizzBuzz(15, WHILE_LOOP).toArray(new String[0]));
        assertArrayEquals(expected, fb.fizzBuzz(15, ITERATOR).toArray(new String[0]));
        assertArrayEquals(expected, fb.fizzBuzz(15, STREAM_API).toArray(new String[0]));

        // test with 100 elements
        var expected2 = new String[] {
            "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
            "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz",
            "Fizz", "22", "23", "Fizz", "Buzz", "26", "Fizz", "28", "29", "FizzBuzz",
            "31", "32", "Fizz", "34", "Buzz", "Fizz", "37", "38", "Fizz", "Buzz",
            "41", "Fizz", "43", "44", "FizzBuzz", "46", "47", "Fizz", "49", "Buzz",
            "Fizz", "52", "53", "Fizz", "Buzz", "56", "Fizz", "58", "59", "FizzBuzz",
            "61", "62", "Fizz", "64", "Buzz", "Fizz", "67", "68", "Fizz", "Buzz",
            "71", "Fizz", "73", "74", "FizzBuzz", "76", "77", "Fizz", "79", "Buzz",
            "Fizz", "82", "83", "Fizz", "Buzz", "86", "Fizz", "88", "89", "FizzBuzz",
            "91", "92", "Fizz", "94", "Buzz", "Fizz", "97", "98", "Fizz", "Buzz",
        };

        assertArrayEquals(expected2, fb.fizzBuzz(100, FOR_LOOP).toArray(new String[0]));
        assertArrayEquals(expected2, fb.fizzBuzz(100, FOR_EACH_LOOP).toArray(new String[0]));
        assertArrayEquals(expected2, fb.fizzBuzz(100, WHILE_LOOP).toArray(new String[0]));
        assertArrayEquals(expected2, fb.fizzBuzz(100, ITERATOR).toArray(new String[0]));
        assertArrayEquals(expected2, fb.fizzBuzz(100, STREAM_API).toArray(new String[0]));
    }
}