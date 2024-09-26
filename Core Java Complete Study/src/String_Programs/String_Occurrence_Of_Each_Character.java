package String_Programs;

import java.util.Scanner;

//   16.Write a JAVA program to search all occurrences of a character in given string

public class String_Occurrence_Of_Each_Character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");

        String str = sc.nextLine();
        char ch[] = str.toCharArray();


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

               for (int k = i + 1; k < ch.length; k++) {
                    if (currentChar == ch[k]) {
                        ch[k] = ' '; // Change to space to mark as counted
                    }
                }
            }
        }

      sc.close();
    }
}
