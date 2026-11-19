package mod.module7and8.Thursday;

import java.util.HashSet;
import java.util.Set;

public class SetActivity {
    static void main(String[] args) {

        // TODO: 1 - Type code to create a set of names using HashSet.
        // Add "John", "John", "Harry", and "Daniel" (and try adding a few more duplicate entries).
        Set setofnames = new HashSet();
        setofnames.add("John");
        setofnames.add("John");
        setofnames.add("Harry");
        setofnames.add("Harry");
        setofnames.add("Daniel");
        setofnames.add("Jha");
        setofnames.add("Amit");
        setofnames.add("Amit Kumar");
        setofnames.add("Shanti");

        // TODO: 2 - Call print method to print the set passed as its parameter.
        print(setofnames);
    }

    static void print(Set setofnames) {
        // TODO: 3 - Type code to print this set
        // Notice the order in which elements get printed and whether duplicates appear.
        System.out.println(setofnames);
    }
}

