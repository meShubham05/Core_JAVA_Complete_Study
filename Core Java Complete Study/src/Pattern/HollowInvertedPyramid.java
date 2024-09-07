package Pattern;

public class HollowInvertedPyramid {

	public static void main(String[] args) {

		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(i==0|| j==0)
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
