package String_Programs;

import java.util.Scanner;

public class String_Reverse_Order_Of_Word {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

        char ch[] = str.toCharArray(); 

        for (int i = 0; i < ch.length; i++) {
            int start = i; // Start of a word

       
            for (; i < ch.length && ch[i] != ' '; i++) {
                
            }
            int end = i - 1; 

         
            for (int j = start; j < end; j++, end--) {
                char temp = ch[j];
                ch[j] = ch[end];
                ch[end] = temp;
            }
        }

        System.out.println("After reversing each word: " + new String(ch));
    }
}
