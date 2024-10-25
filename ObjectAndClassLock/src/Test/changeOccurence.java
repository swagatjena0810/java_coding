package Test;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class changeOccurence {
    public static void main(String[] args) {
        String originalString = "Replace every 2nd occurrence of this string with $.";
        String searchString = "string";
        String result = replaceEvery2ndOccurrence(originalString, searchString);
        System.out.println(result);
    }

    public static String replaceEvery2ndOccurrence(String originalString, String searchString) {
        String[] words = originalString.split("\\s+");
        int[] occurrences = IntStream.range(0, words.length)
                .filter(i -> words[i].equals(searchString))
                .toArray();

        return IntStream.range(0, words.length)
                .mapToObj(i -> {
                    if (Arrays.binarySearch(occurrences, i) >= 0 && (Arrays.binarySearch(occurrences, i) + 1) % 2 == 0) {
                        return "$";
                    } else {
                        return words[i];
                    }
                })
                .collect(Collectors.joining(" "));
    }
}