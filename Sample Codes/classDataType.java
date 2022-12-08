class classDataType{

    int valueOfClass; 
    String name; 
    
    public classDataType(int value)
    {
        //establish default values 
        valueOfClass = value; 
        name = "class data type"; 

    }

    public String toSting()
    {
        return ("Value: " + valueOfClass + ". Name: " + name); 
    } 


}