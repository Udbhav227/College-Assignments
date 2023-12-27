import java.util.HashSet; // Don't panic!
import java.util.Set; // Again don't panic!! I'll come to this...

public class Program_7 {
    public static void main(String[] args) {
        String test = "Welcome";
        System.out.println(count(test)); // 3
        System.out.println(countUniqueVowels(test)); // 2
    }

    public static int count(String str) {
        str = str.toLowerCase();
        int vowelCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowelCount++;
        }
        return vowelCount;
    }

    // OUTPUT: 3 (misprint in the given example)

/*  For a moment let's assume it's not a misprint, then it doesn't align with the question's requirement.
    In order to get the correct output we will need to count the number of unique vowels in the given string
    which requires the knowledge of "Collection interface", to be precise "Sets and HashSets".

    Below is the method to count unique vowels using Set data structure:  */

    public static int countUniqueVowels(String str) {
        Set<Character> vowels = new HashSet<>();
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                vowels.add(ch);
        }
        return vowels.size();
    }
}
