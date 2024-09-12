package Pattern;



/* 
  
  
  		1
		12
		123
		1234
  
  

  
 */
public class RightAngle_Number_Pattern {

	public static void main(String x[])
	{
		int num =1;
		
		for(int i=0;i<4;i++)
		{
			num=1;
			for(int j=0;j<4;j++)
			{
				if(i>=j)
				{
				System.out.print(num);
				num++;
				}
				
			}
			System.out.println();
		}
		
	
	}
}
