package Collection_Framework.Vector;

import java.util.*;

public class Vector_findString_Ends_With_sh {

	
	    public static void main(String[] args) {

	        Vector<String> strings = new Vector<>();
	        Scanner sc = new Scanner(System.in);

	
	        System.out.println("Enter 10 string values:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("String " + (i + 1) + ": ");
	            strings.add(sc.nextLine());
	        }

	        System.out.println("\nStrings that end with 'sh':");


	        for (String str : strings) {
	            
	        	if((str.length()>2) && (str.charAt(str.length()-2)=='s') && (str.charAt(str.length()-1) =='h'))
	        	{
	        		
	        		
	        		System.out.println(str);
	            }
	        }

	        sc.close();
	    }
	}


