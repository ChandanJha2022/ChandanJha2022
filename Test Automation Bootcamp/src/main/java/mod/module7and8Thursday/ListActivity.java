package mod.module7and8Thursday;

import java.util.ArrayList;
import java.util.List;

public class ListActivity {

    static void main(String[] args) {
        // TODO: 1 - Type code to create a list of names. Use ArrayList.
        // Add "John", "John", "Harry", and "Daniel" to the list.
        List listofnames = new ArrayList();
        listofnames.add("John");
        listofnames.add("John");
        listofnames.add("Harry");
        listofnames.add("Daniel");
        // TODO: 2 - Call print method to print the list passed as its parameter.
        print(listofnames);
    }

    static void print(List listofnames) {
        // TODO: 3 - Type code to print this list
        // Notice the order in which elements get printed.

        System.out.println(listofnames);
    }
}

