package ENUM;

public class EnumDemo {

	public enum Day
	{
		Sunday("Weekend"),Monday("OfficeDay"),
		Tuesday("OfficeDay"),Wednesday("OfficeDay"),
		Thursday("OfficeDay"),Friday("OfficeDay"),
		Saturday("Weekend");
		
		private String data ;
	
		
		Day(String day)
		{
			data = day;
		}
		
		public String getTypeofDay() 
		{
			return data;
		}
				
	}
	
	public static void main(String x[])
	{
		System.out.println("Displaying all the days :");
		
		for(Day d :Day.values())
		{
			System.out.println("Day is : "+d + " and You have "+d.getTypeofDay());
		}
	}
}
