package String_Programs;

import java.util.Scanner;

public class String_Highest_Frequency_of_Character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");

        String str = sc.nextLine();
        char ch[] = str.toCharArray();

        char maxChar = '\0'; // Variable to store the character with the highest frequency
        int maxCount = 0; // Variable to store the maximum count

        for (int i = 0; i < ch.length; i++) {
            char currentChar = ch[i];
            int count = 0;

            // Check if the character is alphabetic
            if (currentChar >= 'a' && currentChar <= 'z') {
                // Count occurrences of the current character
                for (int j = 0; j < ch.length; j++) {
                    if (currentChar == ch[j]) {
                        count++;
                    }
                }

                // Print the count for the current character
                System.out.println("Count of: " + currentChar + " " + count);

                // Check if this character has the highest frequency
                if (count > maxCount) {
                    maxCount = count;
                    maxChar = currentChar;
                }

                // Mark this character as counted by replacing it with a space
                for (int k = i + 1; k < ch.length; k++) {
                    if (currentChar == ch[k]) {
                        ch[k] = ' '; // Change to space to mark as counted
                    }
                }
            }
        }

        // Print the character with the highest frequency
        if (maxCount > 0) {
            System.out.println("Character with highest frequency: " + maxChar + " (" + maxCount + " times)");
        }
        sc.close();
    }
}
