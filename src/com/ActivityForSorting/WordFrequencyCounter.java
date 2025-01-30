package com.ActivityForSorting;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a block of text:");
        String text = scanner.nextLine();

        Map<String, Integer> wordFrequency = countWordFrequency(text);
        System.out.println(wordFrequency);
    }

    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Normalize the text
        text = text.toLowerCase().replaceAll("[^a-z\\s]", "");

        // Split the text into words
        String[] words = text.split("\\s+");

        // Count the frequency of each word
        for (String word : words) {
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        return frequencyMap;
    }
}

/*import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "hello world hello everyone";
        String[] words = text.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        // Counting the frequency of each word
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Displaying the word frequencies
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
*/

