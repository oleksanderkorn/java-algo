package com.lkskrn;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public void printTriangle(int nrOfLines) {
        int[][] pascalsTriangle = new int[nrOfLines][];
        for (int i = 0; i < nrOfLines; i++) {
            pascalsTriangle[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    pascalsTriangle[i][j] = 1;
                } else {
                    pascalsTriangle[i][j] = pascalsTriangle[i - 1][j - 1] + pascalsTriangle[i - 1][j];
                }
            }
        }
        for (int i = 0; i < nrOfLines; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(pascalsTriangle[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

    public List<List<Integer>> generate(int numRows) {
        var res = new ArrayList<List<Integer>>();
        res.add(List.of(1));
        for(int i = 1; i < numRows;i++) {
            var prev = res.get(i-1);
            var curr = new ArrayList<Integer>();
            curr.add(1);
            for(int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            res.add(curr);
        }
        return res;
    }

    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0) return List.of(1);
        var res = new ArrayList<List<Integer>>();
        res.add(List.of(1));
        for(int i = 1; i <= rowIndex;i++) {
            var prev = res.get(i-1);
            var curr = new ArrayList<Integer>();
            curr.add(1);
            for(int j = 1; j < i; j++) {
                curr.add(prev.get(j-1)+prev.get(j));
            }
            curr.add(1);
            res.add(curr);
        }
        return res.get(rowIndex);
    }

    public static void main(String[] args) {
        var pascalsTriangle = new PascalsTriangle();
        System.out.println("Pascal's Triangle:");
        System.out.println(pascalsTriangle.generate(6));
        pascalsTriangle.printTriangle(6);
        System.out.println(pascalsTriangle.getRow(0));
        System.out.println(pascalsTriangle.getRow(1));
        System.out.println(pascalsTriangle.getRow(2));
        System.out.println(pascalsTriangle.getRow(3));
        System.out.println(pascalsTriangle.getRow(4));
        System.out.println(pascalsTriangle.getRow(5));
    }
}
