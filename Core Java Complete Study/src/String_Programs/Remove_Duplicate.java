package String_Programs;

import java.util.Scanner;

public class Remove_Duplicate {

    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String to remove the duplicate characters from the string:");

        String str = sc.nextLine();
      

        char ch[] = str.toCharArray(); 
        char result[] = new char[ch.length]; 
        int index = 0;

        for (int i = 0; i < ch.length; i++) {
            boolean isDuplicate = false;

           
            for (int j = 0; j < index; j++) {
                if (ch[i] == result[j]) {
                    isDuplicate = true;
                    break; 
                }
            }

            if (!isDuplicate) {
                result[index++] = ch[i];
              
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.print(result[i]);
        }
        
        sc.close();
    }
}
