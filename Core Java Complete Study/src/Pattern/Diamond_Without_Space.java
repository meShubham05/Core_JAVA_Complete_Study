package Pattern;



/*
     
        		*
        	   ***
  			  *****
 			 *******
 			  *****
  			   ***
   				*                	
    
     
 */
public class Diamond_Without_Space {

	public static void main(String x[])
	{
		for (int i=0;i<4;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(i<3-j ||j>=4+i)
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
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<7;j++)
			{
				if(i>=j ||j>=6-i)
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
