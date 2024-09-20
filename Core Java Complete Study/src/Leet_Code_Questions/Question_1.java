package Leet_Code_Questions;
/*  
  		
  		
  		
	Problem Statement First 

	Chef has to travel to another place. For this, he can avail any one of two cab services.
	•	The first cab service charges XX rupees.
	•	The second cab service charges YY rupees.
	Chef wants to spend the minimum amount of money. Which cab service should Chef take?
	Input Format
	•	The first and only line of each test case contains two integers XX and YY - the prices of first and second cab services respectively.
	Output Format
	For each test case, output FIRST if the first cab service is cheaper, output SECOND if the second cab service is cheaper, output ANY if both cab services have the same price.
	You may print each character of FIRST, SECOND and ANY in uppercase or lowercase (for example, any, aNy, Any will be considered identical).
	Constraints
	1<=T<=100
	1<X<Y<=100
	Sample 1:
	Input	Output:
	3
	30 65        First 
	42 42        Any
	90  50        Second
	Explanation:
	Test case 11: The first cab service is cheaper than the second cab service.
	Test case 22: Both the cab services have the same price.
	Test case 33: The second cab service is cheaper than the first cab service.


 */

import java.util.*;

public class Question_1 {
	
	public static void main(String x[])
	{
		int fCab=0;
		int sCab=0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter the first cab charges :");
			fCab=sc.nextInt();
			System.out.println("Enter  the second cab charges :");
			sCab =sc.nextInt();
			
			if(fCab<sCab)
			{
				System.out.println("First");
			}
			else if(fCab>sCab)
			{
				System.out.println("Second");
			}
			else
			{
				System.out.println("Any");
			}
		}
		
	}
}
