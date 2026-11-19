package mod.module7and8.Thursday;

public class Person {

    private int weight;
    private float height;

    // TODO: Create getters and setters for weight and height

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }


//     * TODO: Complete getBodyMassIndex(double weight, double height)

    public String getBodyMassIndex(double weight, double height) {

        /*return weight / (height * height);
         * 1. Return "Invalid input" if weight <= 0, weight > 600, height <= 0, or height > 3.0
         */
        if (weight <= 0 || weight > 600 || height <= 0 || height > 3.0) {
            return "Invalid input";
        }

        /** 2. Calculate BMI using: weight / (height * height)*/
        double BMI = weight / (height * height);
        /** 3. Return classification:
         *    - BMI < 18.5             -> "Underweight"
         *    - 18.5 <= BMI < 25       -> "Normal weight"
         *    - 25 <= BMI < 30         -> "Overweight"
         *    - BMI >= 30              -> "Obese"*/
        if (BMI < 18.5) {
            return "Underweight";
        } else if (BMI < 25) {
            return "Normal weight";
        } else if (BMI < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }

    }

}