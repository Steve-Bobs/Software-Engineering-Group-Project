import java.util.ArrayList;
import java.util.ArrayList; 
class dataTypesExample{

    public static void main(String args[])
    {
        int value = 7; 

        double decimcalNum = 7.0; 

        String name = "Alex"; 

        String [] names = {"Alex", "Artemii", "Henry", "Andrew", "Austin"}; //how to declare a static array. NOTE that the length is static
        System.out.println(names[0] + " is first in the list"); 
        
        int [] ages = {20, 20, 20, 21, 70}; 
        ages[1] = 21; 
        System.out.println(names[0] + " is age " + ages[1]); 

        System.out.print("The length of names + ages is: " + (names.length + ages.length) + "\n"); //the difference between print and println is that print doesn't go to the next line
            //the great thing about java is EVERYTHING when printlin is a string

        ArrayList <String> namesAgain = new ArrayList<String>(); //this is an arraylist. this is how you can do dyanmic allocation in java. MAKE SURE TO IMPORT
        namesAgain.add("Andrew"); 
        namesAgain.add("Alex"); 

        for (int i = 0; i < namesAgain.size(); i++)
        {
            System.out.println(namesAgain.get(i)); 
        }

        System.out.println("Main complete"); 
    }
}