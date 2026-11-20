package module10JavaFinalActivitiesFriday;

public class Calculator {

    //1st Add
    public int add(int a, int b) {
        return a + b;
    }

    //2nd Add
    public int add(int x, int y, int z) {
        return x + y + z;
    }

    //Subtraction
    public int subtract(int a, int b) {
        return a - b;
    }

    //Division
    public int divide(int a, int b) {
        try {
            int divresult = a / b;
            return divresult;
        } catch (ArithmeticException e) {
            System.out.println("Division By Zero");
            throw e;
        }
    }

    //Multiplication
    public int multiply(int a, int b) throws InvalidMultiplicationException {
        try {
            long multiresult = (long) a * b;
            if (multiresult > Integer.MAX_VALUE || multiresult < Integer.MIN_VALUE) {
                throw new InvalidMultiplicationException("InvalidMultiplicationException");
            }
            return (int) multiresult;
        } catch (InvalidMultiplicationException e) {

            System.out.println(e);
            throw e;
        }
    }

}
