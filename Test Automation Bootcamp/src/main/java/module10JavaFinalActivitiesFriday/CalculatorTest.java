package module10JavaFinalActivitiesFriday;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    //Test 1 add two numbers
    @Test
    public void testAddTwoNums() {
        assertEquals(20, calculator.add(15, 5));
        System.out.println("Test 1 Add Two Nums " + calculator.add(15, 5));

    }

    //Test 2 add two numbers with one being negative number
    @Test
    public void testaddtwonumsonenegative() {
        assertEquals(15, calculator.add(20, -5));
        System.out.println("Test 2 Add Two Numbers One Is -Ve " + calculator.add(20, -5));
    }

    //Test 3 add three numbers
    @Test
    public void testaddthreenums() {
        assertEquals(150, calculator.add(50, 50, 50));
        System.out.println("Test 3 Add Three Numbers " + calculator.add(50, 50, 50));
    }

    //Test 4 add three number one being zero
    @Test
    public void testaddthreenumsonezero() {
        assertEquals(20, calculator.add(10, 0, 10));
        System.out.println("Test 4 Add Three Numbers One Is Zero " + calculator.add(10, 0, 10));
    }

    //Test 5 subtraction of two numbers
    @Test
    public void testsubtractionoftwonums() {
        assertEquals(10, calculator.subtract(20, 10));
        System.out.println("Test 5 Subtraction of Two Numbers " + calculator.subtract(20, 10));
    }

    //Test 6 subtraction of two numbers with -ve result
    @Test
    public void testsubtractionwithnegativeresults() {
        assertEquals(-10, calculator.subtract(10, 20));
        System.out.println("Test 6 Subtraction of Two Numbers With -ve Result " + calculator.subtract(10, 20));
    }

    //Test 7 division of two numbers
    @Test
    public void testdividetwonums() {
        assertEquals(5, calculator.divide(100, 20));
        System.out.println("Test 7 Division of Two Numbers " + calculator.divide(100, 20));
    }

    //Test 8 division by zero
    @Test
    public void testdivisionbyzero() {

        try {
            calculator.divide(100, 0);
            fail("Exception Expected");
        } catch (ArithmeticException e) {
            System.out.println("Test 8 Division by Zero ");
            assertEquals("/ by zero", e.getMessage());
        }
    }

    //Test 9 valid multiplication of two numbers
    @Test
    public void testvalidmultiplication() throws InvalidMultiplicationException {
        assertEquals(24, calculator.multiply(4, 6));
        System.out.println("Test 9 Valid Multiplication of Two Numbers ");
    }

    //Test 10 invalid multiplication
    @Test
    public void testinvalidmultiplication() throws InvalidMultiplicationException {
        try {
            calculator.multiply(444444444, 66666666);
            fail("Exception Expected");
        } catch (InvalidMultiplicationException e) {
            System.out.println("Test 10 Invalid Multiplication of Two Large Numbers ");

            assertEquals("InvalidMultiplicationException", e.getMessage());
        }
    }
}
