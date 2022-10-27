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

public static void printDefenderOptions()
{
    System.out.println("Here are the defender options"); 
}

public static int checkValidIntegerEntry(BufferedReader in) throws IOException
{
    boolean correctIntEntered = false; 
    int valueEntered = 0; 

    while (!correctIntEntered)
    {
        try {
            valueEntered = Integer.parseInt(in.readLine());
            correctIntEntered = true; 
        } catch (Exception e) {
            // TODO: handle exception
            correctIntEntered = false; 
        }
    }
    return valueEntered; 
}


public static void main(String args[]) throws IOException
{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 

    System.out.println("Program is starting...");

    while (true)
    {
        /*/
        System.out.print("\nAttacker: Select an option to continue: "); 
        int attackerOptionSelected = Integer.parseInt(in.readLine());  
        printAttackerOptions(); 
        */ 
        System.out.print("Enter a value: ");
        int valueEntered = checkValidIntegerEntry(in); 

        System.out.print("\nDefender: Slect an option to continue"); 
        int defenderOptionSelected = Integer.parseInt(in.readLine());
        printDefenderOptions();
        


    }

    
}
} 