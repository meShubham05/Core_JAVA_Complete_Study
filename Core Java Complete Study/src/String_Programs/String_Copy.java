package String_Programs;

//   2. Write a JAVA program to copy one string to another string

import java.util.*;

public class String_Copy {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the original string: ");
        String original = sc.nextLine();  // Input string from user
        
     
        char[] copiedString = new char[original.length()];
        
   
        for (int i = 0; i < original.length(); i++) {
            copiedString[i] = original.charAt(i);
        }
        
       
        String copied = new String(copiedString);
        
       
        System.out.println("Copied string: " + copied);
	}
}
