package String_Programs;

import java.util.Scanner;

public class Remove_Duplicate {

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String to remove the duplicate characters from the string:");

        String str = sc.nextLine();
        sc.close();

        char ch[] = str.toCharArray(); // Convert the string to a char array
        char result[] = new char[ch.length]; // Create a result array to store unique characters
        int index = 0;

        for (int i = 0; i < ch.length; i++) {
            boolean isDuplicate = false;

            // Check if the current character has appeared before in the result array
            for (int j = 0; j < index; j++) {
                if (ch[i] == result[j]) {
                    isDuplicate = true;
                    break; // No need to check further, this character is already in result
                }
            }

            // If the character is not a duplicate, add it to the result array
            if (!isDuplicate) {
                result[index++] = ch[i];
                System.out.println("index :"+index);
            }
        }

        // Print the result array containing unique characters
        for (int i = 0; i < index; i++) {
            System.out.print(result[i]);
        }
    }
}
