package Pattern;

/*
 		 
 		 *********
          *******
           *****
            ***
             *
  
 */


public class Inverted_Pyramid_Withourt_Space {

	public static void main(String x[])
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(i>=j || j<=8-i)
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
