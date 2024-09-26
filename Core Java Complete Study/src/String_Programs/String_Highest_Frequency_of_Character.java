package String_Programs;

import java.util.Scanner;

public class String_Highest_Frequency_of_Character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");

        String str = sc.nextLine();
        char ch[] = str.toCharArray();

        char maxChar = '\0'; 
        int maxCount = 0; 
        for (int i = 0; i < ch.length; i++) {
            char currentChar = ch[i];
            int count = 0;

            if (currentChar >= 'a' && currentChar <= 'z') {
             
                for (int j = 0; j < ch.length; j++) {
                    if (currentChar == ch[j]) {
                        count++;
                    }
                }
                System.out.println("Count of: " + currentChar + " " + count);

                if (count > maxCount) {
                    maxCount = count;
                    maxChar = currentChar;
                }

                for (int k = i + 1; k < ch.length; k++) {
                    if (currentChar == ch[k]) {
                        ch[k] = ' '; 
                    }
                }
            }
        }

        
        if (maxCount > 0) {
            System.out.println("Character with highest frequency: " + maxChar + " (" + maxCount + " times)");
        }
        sc.close();
    }
}
