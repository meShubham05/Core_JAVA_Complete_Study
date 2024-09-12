package Pattern;

/*
  
  
     			*
     		   * *
     		  *   *
     		 *******
  
 */
public class Hollow_Pyramid_without_Space {

	public static void main(String x[])
	{
		  for(int i=0;i<4;i++)
		  {
			  for(int j=0;j<7;j++)
			  {
				  if((j<=2-i || j>3+i) || (i==1 && j==3)||(i==2 && j>=2 && j<=4))
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
