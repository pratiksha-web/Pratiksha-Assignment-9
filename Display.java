import java.util.Scanner;
import java.io.*;

public class Display
{
    public static void main(String[] input)
    {
        String fname;
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter File Name to Open with extension: ");
        fname = sc.nextLine();
    
        String line = null;
        sc.close();
        try
        {
            FileReader fileReader = new FileReader(fname);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
           
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + fname + "'");
        }
    }
}
