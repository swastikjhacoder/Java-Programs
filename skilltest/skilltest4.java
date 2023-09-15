
import java.util.*;

public class skilltest4 {
	private static List<String> dictionary = new ArrayList<>();

    public static void main(String[] args) {
        // Add words to the dictionary
        dictionary.add("apple");
        dictionary.add("askalite");
        dictionary.add("cat");
        dictionary.add("dog");
        dictionary.add("elephant");
        dictionary.add("fish");
        dictionary.add("grape");

        String input = "al"; // The input to autocomplete

        List<String> suggestions = autocomplete(input);
        for (String suggestion : suggestions) {
            System.out.println(suggestion);
        }
    }

    private static List<String> autocomplete(String input) {
        List<String> suggestions = new ArrayList<>();

        for (String word : dictionary) {
            int prevIndex = -1;
            boolean isValid = true;

            for (char ch : input.toCharArray()) {
                int index = word.indexOf(ch, prevIndex + 1);

                if (index == -1) {
                    isValid = false;
                    break;
                }

                prevIndex = index;
            }

            if (isValid) {
                suggestions.add(word);
            }
        }

        return suggestions;
    }
}
