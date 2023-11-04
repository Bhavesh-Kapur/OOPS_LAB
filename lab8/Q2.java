// Question: Search for the first and last occurrence of a character or substring

public class Q2 {
    public static void main(String[] args) {
        // Input string
        String input = "Hello, this is an example string. This is a simple example.";

        // Search for the first occurrence of a substring
        String searchSubstring = "example";
        Integer firstOccurrence = input.indexOf(searchSubstring); // Use Integer wrapper class

        // Search for the last occurrence of a substring
        Integer lastOccurrence = input.lastIndexOf(searchSubstring); // Use Integer wrapper class

        // Display results
        System.out.println("Input String: " + input);
        System.out.println("First Occurrence of '" + searchSubstring + "': " + firstOccurrence);
        System.out.println("Last Occurrence of '" + searchSubstring + "': " + lastOccurrence);
    }
}