package org.module2Monday;

public class FindInArray {
    static void main() {
        int[] numsarray = {99,100, 1, 4, 15,10, 9, 11, 9,5};
        int largest = numsarray[0];
        for (int i = 1; i < numsarray.length; i++) {
            if (numsarray[i] > largest) {
                largest = numsarray[i];
            }
        }
        System.out.println("Largest Number Is : " + largest);
    }
    }
