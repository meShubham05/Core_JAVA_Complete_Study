package Pattern;



/*    
   
   			1234
			1234
			1234
			1234
   
   
 */
public class Square_Number_pattern {

	public static void main(String c[])
	{
		
		int num=1;
		
		for(int i=0;i<4;i++)
		{
			num=1;
			
			for(int j=0;j<4;j++)
			{
				
				System.out.print(num);
				num++;
			}
			System.out.println();
			
		}
	}
}
