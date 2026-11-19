package mod.module7and8.Thursday;

// Needs to be completed
// This program accepts a user name and checks user's validity
// The user name is checked against an array of names.
public class CustomExceptionActivityTest {

    // 1 - Type main method and call validateUser() from it.
    static void main(String[] args) {
        CustomExceptionActivityTest test = new CustomExceptionActivityTest();
        test.validateUser("Username");

        // Call this method with different names to test it.
        test.validateUser("Password");
        test.validateUser("Jha");
        test.validateUser("Shanti");
        test.validateUser("AmitKumar");
    }

    void validateUser(String name) {

        // Array of names

        String[] validUsers = {"John", "Mike", "Shanti", "Stacie"};

        // Flag stores 1 if a match is found else it should remain 0

        int flag = 0;
        for (int i = 0; i < validUsers.length; i++) {
            if (name.equals(validUsers[i])) {

                flag = 1;
                break;
            }
        }
        for (int i = 0; i < 4; i++) {

            // 2 - Write code to check if parameter name contains a value which is found in validUsers array and change flag's value accordingly
            try {
                // 3 - Check if flag is zero, throw CustomExceptionActivity Exception.
                if (flag == 0) {
                    // You may also have to declare this exception in the method signature using throws.
                    throw new CustomExceptionActivity();
                }
                // 4 - Else if flag is one, print a message "Welcome to Payroll program".
                else {
                    System.out.print("Welcome to Payroll program");
                }
            } catch (CustomExceptionActivity e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
