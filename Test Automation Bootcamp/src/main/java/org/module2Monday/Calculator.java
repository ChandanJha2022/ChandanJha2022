package org.module2Monday;

public class Calculator {
    static void main() {
        int x = 10;
        int y = 5;

        int[] nums = {1, 2, 3, 4};

        System.out.println("Addition - " + add(x, y));
        System.out.println("Subtraction - " + subtract(x, y));
        System.out.println("Multiply - " + multiply(nums));
        System.out.println("Divide - " + divide(x, y));
    }
    private static int add(int x, int y) {
        int sum = x + y;
        return sum;
    }
    private static int subtract(int x, int y) {
        //TODO implement subtraction
        int subtraction = x-y;
        return subtraction;
    }
    private static int multiply(int[] numbers) {
        int temp = 1;

        for (int i = 0; i < numbers.length; i++) {
            temp = temp * numbers[i];
        }
        return temp;
    }
    private static int divide(int x, int y) {
        //TODO implement subtraction
        int division = x/y;
        return division;
    }
    }
