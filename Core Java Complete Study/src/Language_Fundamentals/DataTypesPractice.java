package Language_Fundamentals;

public class DataTypesPractice {

		// 1 byte = 8 bits ;
	public static void main(String x[])
	{
		 
			byte b = (byte)129;
			
			System.out.println(b++);
			
	
			
//			129 is represented as 0000 0000 1000 0001 in 16-bit binary.
//			When cast to byte, it becomes 1000 0001 (only the lower 8 bits are kept).
//			Invert all bits of 1000 0001 (which gives 0111 1110).
//			Add 1 to the result (0111 1110 + 1 = 0111 1111).
//			0111 1111 is 127 in binary, so the original 1000 0001 must be -127.
//			1000 0001 in an 8-bit signed binary (two's complement) represents -127.
//			So, when you cast 129 to a byte,
//			it becomes -127 due to the two's complement interpretation.
//			
			
 
			
	}
}
