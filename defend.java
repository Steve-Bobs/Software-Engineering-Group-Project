
import java.util.*;

///handles the options that defenders input and tracks points that the defenders have
class defend{
    
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
    public void defend()
    {
        point = 0;
        resources = 0; 
    }

}