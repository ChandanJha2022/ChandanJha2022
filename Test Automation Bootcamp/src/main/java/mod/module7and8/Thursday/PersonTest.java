package mod.module7and8.Thursday;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person person;

    @Before
    public void setUp() throws Exception {
        // TODO: Initialize person object
        person = new Person();
    }

    @After
    public void tearDown() throws Exception {
        // TODO: Tear down person object (set to null)
        person = null;
    }

    @Test
    public void testGettersAndSetters() {
        // TODO: Test setWeight/getWeight and setHeight/getHeight
        person.setWeight(77);
        assertEquals(77, person.getWeight());

        person.setHeight(1.6F); // F Treat this decimal number as a float
        assertEquals(1.6, person.getHeight(), 0.001f); //The third value delta allows a small difference between the expected and actual values.
    }

    @Test
    public void testGetBodyMassIndex() {

        // TODO: Test valid BMI categories (Underweight, Normal weight, Overweight, Obese)
        assertEquals("Underweight", person.getBodyMassIndex(33, 1.4));
        assertEquals("Normal weight", person.getBodyMassIndex(66, 1.7));
        assertEquals("Overweight", person.getBodyMassIndex(70, 1.6));
        assertEquals("Obese", person.getBodyMassIndex(99, 1.4));

        // TODO: Test invalid and boundary inputs (zero, negative values, > 600 weight, > 3.0 height)
        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.0));
        assertEquals("Invalid input", person.getBodyMassIndex(-6, 1.1));
        assertEquals("Invalid input", person.getBodyMassIndex(660, 1.9));
        assertEquals("Invalid input", person.getBodyMassIndex(66, 0));
        assertEquals("Invalid input", person.getBodyMassIndex(66, -1.4));
        assertEquals("Invalid input", person.getBodyMassIndex(66, 3.4));
//        assertEquals("Underweight", person.getBodyMassIndex(66,1.4));
//        Test valid boundary inputs
        assertEquals("Normal weight", person.getBodyMassIndex(18.5, 1.0));
        assertEquals("Overweight", person.getBodyMassIndex(25, 1.0));
        assertEquals("Obese", person.getBodyMassIndex(30, 1.0));

    }
}
