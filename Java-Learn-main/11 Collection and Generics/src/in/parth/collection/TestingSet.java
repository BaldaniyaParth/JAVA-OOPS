package in.parth.collection;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Parth"));
        System.out.println(names.add("Prince"));
        System.out.println(names.add("Java Developer"));
        Utility.print(names);

        System.out.println(names.add("Parth"));
        System.out.println(names.size());
        Utility.print(names);

        System.out.println(names.contains("Parth"));
        System.out.println(names.remove("Parth"));
        Utility.print(names);
        System.out.println(names.remove("Parth"));
    }
}








