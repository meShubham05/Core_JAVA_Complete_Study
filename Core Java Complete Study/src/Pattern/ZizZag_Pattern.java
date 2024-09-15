package Pattern;

/*   
 		
 		*   *   *
 		 * * * *
  		  *   *
  		 * * * *
 		*   *   *
 		
 		
 */
public class ZizZag_Pattern {

	public static void main(String x[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(i==j || (i+j==4) ||(j-i==4)||(i+j==8))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
