package Pattern;

/*
  	
  	1
	22
	333
	4444
	55555

 */
public class Number_Increment_Triangle_Pattern {

	public static void main(String[] args) {
		
		int num=0;
		
	for(int i=0;i<5;i++)
	{
		num++;
		for(int j=0;j<5;j++)
		{
			if(j<=i)
			{
				System.out.print(num);
			}
		}
		System.out.println();
	}
	
	
	}
}
