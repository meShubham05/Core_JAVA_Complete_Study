package String_Programs;

import java.util.*;

// 23.Write a JAVA program to remove all occurrences of a character from string.

public class String_Remove_All_Occurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine(); // Read the input string

        char[] originalChars = str.toCharArray(); 
        char[] resultChars = new char[originalChars.length]; 
        int index = 0; // Index for the resultChars array


        for (int i = 0; i < originalChars.length; i++) {
            if (originalChars[i] != ' ') { // Skip spaces
                int count = 0; 
                for (int j = 0; j < originalChars.length; j++) {
                    if (originalChars[i] == originalChars[j]) {
                        count++; 
                    }
                }
         
                if (count == 1) {
                    resultChars[index] = originalChars[i];
                    index++;
                }
            }
        }


        String resultString = "";
        for (int i = 0; i < index; i++) {
            resultString += resultChars[i]; 
            if (i < index - 1) {
                resultString += " "; 
            }
        }

    
        System.out.println("Unique characters: " + resultString);
        sc.close();
    }
}
