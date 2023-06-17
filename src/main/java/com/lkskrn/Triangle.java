package com.lkskrn;

public class Triangle {

    void printTriangle(int nrOfLines) {
        int count = 0;
        for (int i = 0; i < nrOfLines; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(++count);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.printTriangle(5);
        triangle.printTriangle(10);
    }
}
