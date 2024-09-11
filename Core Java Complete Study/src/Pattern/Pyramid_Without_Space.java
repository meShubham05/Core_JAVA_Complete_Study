package Pattern;


/*
   
      			*
      		   ***
  			  *****
 			 *******
			*********
   
   
   
 */
public class Pyramid_Without_Space {

	public static void main(String x[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(j<4-i || j>4+i )
				{
				System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
}
