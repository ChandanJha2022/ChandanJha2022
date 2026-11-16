package org.module2Monday;

public class MultiplicationTable {
    static void main() {

        for (int i = 11; i <= 20; i++) {

            System.out.println("Multiplication Table of " + i);

            for (int j = 1; j <= 10; j++) {

                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}