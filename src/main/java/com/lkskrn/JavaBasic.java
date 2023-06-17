package com.lkskrn;

public class JavaBasic {
     int countBitsForASpecificNumber(int number) {
        int numberOfBits = 0;
        while(number > 0) {
            if((number & 1) == 1) {
                numberOfBits++;
            }
            number = number >>> 1;
        }
        return numberOfBits;
    }

    public int[] countBits(int n) {
        var arr = new int[n+1];
        for(int i = 0; i <= n; i++) {
            arr[i] = countBitsForASpecificNumber(i);
        }
        return arr;
    }
}