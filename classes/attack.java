package usersInfo; 
import java.util.*;

///handles the options that attackers input and tracks points that the attackers have
class attack{
    
    int point;
    int resources;
    ArrayList<String> atList = new ArrayList<String>();

    ///returns the finshed created list
    public String actionsTaken(){ 
        return this.atList;
    }

    ///takes the inputted string and adds it to the actions taken list 
    public addActionsTaken(String actionTaken){ 
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
