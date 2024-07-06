package in.parth.challenge107;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> names = List.of("Parth", "Baldaniya", "Java Learn");
        names.stream()
                .forEach(name -> System.out.println(name));
    }
}
