// Question: Convert all characters of a string to capital letters without using inbuilt function


public class Q1 {
    public static void main(String[] args) {
        
        // Input string
        String input = "This is an example string.";

        // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a lowercase letter
            if (Character.isLowerCase(ch)) {
                // Convert the character to uppercase and append it to the result
                result.append(Character.toUpperCase(ch));
            } else {
                // Append the character as is (not a lowercase letter)
                result.append(ch);
            }
        }

        // Display the original and uppercase string
        System.out.println("Original String: " + input);
        System.out.println("Uppercase String: " + result.toString());
    }
}