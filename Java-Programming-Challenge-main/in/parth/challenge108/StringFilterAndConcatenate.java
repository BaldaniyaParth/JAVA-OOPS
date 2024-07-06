package in.parth.challenge108;

import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs = List.of("Parth Baldaniya", "bad",
                "is Learn java", "ghatiya");

        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("", (a, b) -> a + " " + b);

        System.out.println(result);
    }
}
