package Looping_Programs;
import java.util.*;

public class Happy_NumberApp {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		num =sc.nextInt();
		int rem=0,square=0,count=0;
		while(num!=1 && count<1000)
		{
			square=0;
			while(num!=0)
			{
				rem=num%10;
				square=square +rem*rem;
				num=num/10;
				
			}
			num=square;
			count++;
			
			if(num==1)
			{
				System.out.println("Happy Number :");
				break;
			}
//			System.out.println("count :"+count);
			
		} 
		if(num!=1)
		{
			System.out.println("Not Happy Number :");
		}
	}
}
