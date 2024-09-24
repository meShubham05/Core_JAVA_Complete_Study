package Pattern;

public class task {
	public static void main(String[] args) {
	int i,j;
    char ch='A';
    for(i=1; i<=5; i++)
    {
           for(j=1; j<=i; j++)
            System.out.printf("%c ",ch+j-1);
        for(j=i-1; j>=1; j--)
            System.out.printf("%c ",ch+j-1);
            
        System.out.printf("\n");
    }
	}
}
