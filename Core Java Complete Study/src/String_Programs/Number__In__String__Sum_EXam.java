package String_Programs;

public class Number__In__String__Sum_EXam {

	public static void main(String[] args) {
		
		
		String str ="10 variable 53 keyword 123 literal 978 programs " ;


				char ch []= str.toCharArray();
				String num =" ";
				int sum =0,result =0,rev=0,rem=0;
				
				for(int j=0;j<ch.length;j++)
				{
					rev=0;
					
					while(ch[j]>='0' && ch[j]<='9')
					{
						
						rem=ch[j]-'0';;
						
						rev = rev *10 + rem;

						System.out.println("rev :"+rev);
						j++;
					}
					sum=rev+sum;
				}
				
				System.out.println("Result is :" +sum);
	}
}
