package Pattern;

public class Number_Pattern {

	public static void main(String[] args) {
		
	int num =1;
	
	for(int i=0;i<4;i++)
	{
		num=1;
		for(int j=0;j<4;j++)
		{
			if(i>=j+1)
			{
				System.out.print(" ");
			}
			
			
			else
			{
				System.out.print(num);
			
			num++;
			}
		}
		System.out.println();
	}
		
	}
}
