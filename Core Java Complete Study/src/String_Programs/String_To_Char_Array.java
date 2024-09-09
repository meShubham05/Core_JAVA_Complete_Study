package String_Programs;

import java.util.*;

public class String_To_Char_Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String :");
		
		String str = sc.nextLine();
		
		char ch[] = str.toCharArray();
		
		for(char c :ch)
		{
			System.out.print(" "+c);
		}
		
		
		System.out.println("\n By using charAt() Function :");
		char ch2[] = new char[str.length()];
		
		for(int i=0;i<ch2.length;i++)
		{
			ch2[i]=str.charAt(i);
			System.out.print(" "+ch2[i]);
			
		}
		
		
	}

}
