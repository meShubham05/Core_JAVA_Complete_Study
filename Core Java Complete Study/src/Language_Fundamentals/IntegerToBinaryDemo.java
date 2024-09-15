package Language_Fundamentals;

public class IntegerToBinaryDemo {

	public static void main(String x[])
	{
		int num =1800,i=0,sum=0,mul=1; 
		int count=0;
		int temp=num;
		while (temp>0)
		{
			temp=temp/2;
			count++;
		}
		System.out.println("Given number is :"+num);
		int binary[] = new int[count];
		while(num>0)
		{
			binary[i++]=num%2;
			num =num/2;	
		}
		System.out.println("after converting into binary :");
		for(int j=binary.length-1;j>=0;j--)
		{
			System.out.print(binary[j]);
		}
		
		for(int j=binary.length-1;j>=0;j--)
		{
			mul=1;
			
			if(binary[j]==1)
			{   
				for(i=1;i<=j;i++)
				{
					mul=mul*2;
				}
					sum+=mul;
			}
		}
		
		System.out.println("\nAfter converting binary into decimal :"+sum);
	}
}
