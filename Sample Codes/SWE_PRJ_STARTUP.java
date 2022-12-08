import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SWE_PRJ_STARTUP{

    public static void printAttackerOptions()
    {
        System.out.println("Here are the attackers options"); 
        //TODO Probably call a class here

    }

    public static void printDefenderOptions()
    {
        System.out.println("Here are the defender options"); 
        //TODO Prolly call a class here
    }

    /*
    * @return returns the int the user entered. error checks input
    */
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
                correctIntEntered = false; 
                System.out.print("\nInvalid integer entered: Try again "); 
            }
        }
        return valueEntered; 
    }

    public static String executeAttackerOptionSelected()
    {
        return("Executing attacker option selected"); 
    }

    public static String executeDefenderOptionSelected()
    {
        return("Executing defender option selected"); 
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
            System.out.print("\nAttacker: Select an option to continue ");
            int attackerValueEntered = checkValidIntegerEntry(in); 

            System.out.print("\nDefender: Select an option to continue "); 
            int defenderValueEntered = checkValidIntegerEntry(in);
            //printDefenderOptions();

            
            System.out.println(executeAttackerOptionSelected());

            System.out.println(executeDefenderOptionSelected()); 


        }

        
    }
} 