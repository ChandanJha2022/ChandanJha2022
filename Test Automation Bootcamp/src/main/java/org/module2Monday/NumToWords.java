package org.module2Monday;

public class NumToWords {
    static void main() {
        int number = 5;
        String word = "";

        switch (number) {
            case 1:
                word = "One";
                System.out.println("The first number is " + word);
                break;

            case 2:
                word = "Two";
                System.out.println("The second number is " + word);
                break;

            case 3:
                word = "Three";
                System.out.println("The third number is " + word);
                break;

            case 4:
                word = "Four";
                System.out.println("The fourth number is " + word);
                break;

            case 5:
                word = "Five";
                System.out.println("The fifth number is " + word);
                break;

            case 6:
                word = "Six";
                System.out.println("The sixth number is " + word);
                break;

            case 7:
                word = "Seven";
                System.out.println("The seventh number is " + word);
                break;

            case 8:
                word = "Eight";
                System.out.println("The eighth number is " + word);
                break;

            case 9:
                word = "Nine";
                System.out.println("The nine number is " + word);
                break;

            case 10:
                word = "Ten";
                System.out.println("The tenth number is " + word);
                break;

            default:
                word = "Invalid Number";
                System.out.println("Invalid Number");
                break;
        }
    }
}
