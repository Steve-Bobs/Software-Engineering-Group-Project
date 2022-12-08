package classes; 
import java.util.*;

///handles the options that attackers input and tracks points that the attackers have
public class attack{
    
    int point;
    int resources;
    ArrayList<String> atList = new ArrayList<String>();

    ///returns the finshed created list
    public ArrayList<String> actionsTaken(){ 
        return this.atList;
    }

    ///takes the inputted string and adds it to the actions taken list 
    public void addActionsTaken(String actionTaken){ 
        this.atList.add(actionTaken); 

    }

    ///keeps track of points 
    public void addPoints(int points)
    {
        this.point+=points; 
    }

    ///initializes the class
    public void attack()
    {
        point = 0;
        resources = 0; 
    }

}
