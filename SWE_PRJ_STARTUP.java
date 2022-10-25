import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class STARTPROGRAM{

public static void printAttackerOptions()
{
    System.out.println("Here are the attackers options"); 

}


public static void main(String args[]) throws IOException
{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 

    System.out.println("Program is starting...");

    while (true)
    {
        System.out.print("\nAttacker: Select an option to continue: "); 
        int userOptionSelected = Integer.parseInt(in.readLine());  
        printAttackerOptions(); 


    }

    
}
} 