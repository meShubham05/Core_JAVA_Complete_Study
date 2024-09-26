package String_Programs;

import java.util.Scanner;

public class String_Toggle_Case {

	public static void main(String[] args) {
		
	
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the original string: ");
    String str = sc.nextLine();  
    String result="";
    for(int i=0;i<str.length();i++)
    {
    	char ch =str.charAt(i);
    	
    	if(ch>='a' && ch <='z')
    	{
    		result =result + (char)(ch - 32);
    	}
    	if(ch>='A' && ch <='Z')
    	{
    		result = result + (char)(ch + 32);
    	}
    }
    
    System.out.println("After Toggling the String is :"+result);
     
	}	
    
}
