package Leet_Code_Questions;

/*
 			An automobile company manufactures both a two wheeler (TW) and a four wheeler (FW). A company manager wants to make the production of both types of vehicle according to the given data below:
	•	1st data, Total number of vehicle (two-wheeler + four-wheeler)=v
	•	2nd data, Total number of wheels = W
	The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the given data.
	Example :
	Input :
	•	200  -> Value of V
	•	540   -> Value of W
	Output :
	•	TW =130 FW=70 
	Explanation:  
	130+70 = 200 vehicles
	(70*4)+(130*2)= 540 wheels
	Constraints :
	•	2<=W
	•	W%2=0
	•	V<W
	Print “INVALID INPUT” , if inputs did not meet the constraints.
	The input format for testing 
	The candidate has to write the code to accept two positive numbers separated by a new line.
	•	First Input line – Accept value of V.
	•	Second Input line- Accept value for W.
	
 		
 		
 		
 */

import java.util.*;


public class Qeustion18 {

	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Total Number of Vehicles You want to make :");
		
		int total = sc.nextInt();
		int two_wheeler=0,four_wheeler=0;
		System.out.println("Enter the total wheels You have in your Showroom :");
		int  wheels =sc.nextInt();
		
	
		
		for(int i=1;i<200;i++)
		{
			for(int j=1;j<150;j++)
			{
				if(((4*j + 2*i)==wheels) && (i+j==total))
				{
				two_wheeler=i;
				four_wheeler=j;
				
				 System.out.println(i+" "+j);
				break;
				}
			}
		}
		
		System.out.println("The two Wheeler :"+two_wheeler);
		System.out.println("The four Wheeler :"+four_wheeler);
		
	}
}
