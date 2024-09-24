package Pattern;


/* 
  	
  		A
		A B A
		A B C B A
		A B C D C B A
		A B C D E D C B A 
  	
  	
  	
 */
public class ABC_Pattern {

	public static void main(String[] args) {
		
		char ch ='A';
		
		for(int i=0;i<5;i++)
		{
			ch='A';
			for(int j=0;j<9;j++)
			{
				if(j<=2*i)
				{
					if(j>(2*i)/2)
					{
						ch--;
					System.out.print(ch+" ");
					
					}
					else
					{
						System.out.print(ch+" ");
						ch++;
					}
					
				}
					
				}
			System.out.println();
			
			}
			
		}
		
	}

