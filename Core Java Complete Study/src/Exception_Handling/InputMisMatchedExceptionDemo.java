package Exception_Handling;

import java.util.*;

public class InputMisMatchedExceptionDemo {

	 static class UserDefinedException extends RuntimeException {
	        UserDefinedException(String msg) {
	            super(msg);
	        }
	    }

	    static class CheckNumberValid {
	        public void checkValidNumber(String s, String s2) {
	        	
	        	char ch [] =s.toCharArray();
	        	char ch2 [] =s2.toCharArray();
	        	
	        	for(int i=0;i<ch.length;i++)
	        	{
	        		 if ((ch[i]>='a' && ch[i]<='z' )|| ch2[i]>='a' && ch2[i]<='z' ) {
			                throw new UserDefinedException("You entered an invalid number:");
			            }         		 
	        	}
	        	
	           
	        }
	    }

	    public static void main(String x[]) {
	        String a, b;
	        int num1 = 0, num2 = 0, c;

	        Scanner sc = new Scanner(System.in);

	        
	       do
	       {
	    	   
	       
	        System.out.println("Enter two numbers to add:");

	        a = sc.nextLine();
	        b = sc.nextLine();

	        CheckNumberValid ch = new CheckNumberValid();
	        
	        try {
	            ch.checkValidNumber(a, b);

	            // If the numbers are valid, parse them
	            num1 = Integer.parseInt(a);
	            num2 = Integer.parseInt(b);
	            c = num1 + num2;

	            System.out.println("The Addition is: " + c);
	        } catch (UserDefinedException u) {
	            System.out.println(u.getMessage());
	        } catch (NumberFormatException e) {
	        	System.out.println("I am dummy statemnet : ");
	            System.out.println("Failed to parse numbers.");
	        }
	   }while(a!=null);
	
	    
}
}
