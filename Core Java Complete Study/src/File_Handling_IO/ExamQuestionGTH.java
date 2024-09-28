package File_Handling_IO;

import java.io.*;

public class ExamQuestionGTH {
    public static void main(String[] args) {
        
       
        String filepath ;
        
       
        String wordsFile = "D:\\GIRI TECH HUB\\words.txt";
        String digitsFile = "D:\\GIRI TECH HUB\\digits.txt";
        String symbolsFile = "D:\\GIRI TECH HUB\\symbols.txt";
        
        try {
        	
            FileReader fr = new FileReader("D:\\GIRI TECH HUB\\Student.txt");
            BufferedReader reader = new BufferedReader(fr);
            
            BufferedWriter wordsWriter = new BufferedWriter(new FileWriter(wordsFile));
            BufferedWriter digitsWriter = new BufferedWriter(new FileWriter(digitsFile));
            BufferedWriter symbolsWriter = new BufferedWriter(new FileWriter(symbolsFile)); 
            
            String line;
            while ((line = reader.readLine()) != null) 
            {
                for (int i = 0; i < line.length(); i++) 
                {
                    char ch = line.charAt(i);

            
                    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) 
                    {
                        wordsWriter.write(ch);
                    }
                   
                    else if (ch >= '0' && ch <= '9') 
                    {
                        digitsWriter.write(ch);
                    }
                   
                    else if (ch != ' ' && ch != '\t' && ch != '\n') 
                    {
                        symbolsWriter.write(ch);
                    }
                }
                wordsWriter.newLine();
                digitsWriter.newLine();
                symbolsWriter.newLine();
            }
           
            wordsWriter.close();
            digitsWriter.close();
            symbolsWriter.close();
            
            System.out.println("File processed successfully.");
        } 
        catch (IOException e) 
        {
            System.out.println(e);
        }
    }
}
