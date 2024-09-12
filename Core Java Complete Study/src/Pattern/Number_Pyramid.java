package Pattern;

/*   
    			 1
  				121
 			   12321
			  1234321
    
    
    
 */
public class Number_Pyramid {

	public static void main(String x[])
	{
		int num =1;
		
		 for(int i=0;i<4;i++)
		 {
			num=1;
			 for(int j=0;j<8;j++)
			 { 
				 if(j<3-i || j>3+i)
				 {
					 System.out.print(" ");
				 }
				 else
				 {
					 System.out.print(num);
					
					 if(j<3)
					 {
						 num++;
					 }
					 else
					 {
						 num--;
					 }
							 
				 }
			 }
			 System.out.println();
		 }
	} 
}
