package Pattern;

public class HalfInvertedPyramid {

	public static void main(String x[])
	{
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				if(i<=5-j)
				{
					System.out.print("*");
				}
		
			}
			System.out.println();
		}
		
	}
}
