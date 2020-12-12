/*
 * Program     : StudentClient
 * Programmer  : Chanz Griffin
 * Date        : 12/03/2020
 * Description : Displays students name, age and student type
 */

public class Student 
{
    private String studentName;
    private int studentAge;
    
    public Student(String newName, int newAge)
    {
        setName(newName);
        setAge(newAge);
        
    } 
    
    public void setName(String newName)
    {
        studentName = newName;
    }
    public String getName()
    {
        return studentName;
    }  
    public void setAge(int newAge)
    {
        if (newAge > 0)
            studentAge = newAge;
        else
            System.out.println("Age can not be negative or zero.");
    }
    public int getAge()
    {
        return studentAge;
    }
    
    public String fullString()
    {
        return("\nName: " + studentName + " Age: " + studentAge);
    }
    
    public String determineTypeOfStudent()
    {
        String type = "";
        
        if (studentAge >= 0 && studentAge <=4)
                type = "Preschool";
        else if (studentAge == 5)
                type = "Kindergarden";
        else if (studentAge >= 6 && studentAge <= 10)
                type = "Elementary School";
        else if (studentAge >= 11 && studentAge <= 13)
                type = "Middle School";
        else if (studentAge >= 14 && studentAge <= 17)
                type = "High School";
        else if (studentAge >= 18)
            type = "College";
        else
            type = "Invalid";
          
        return type;
    }
    
            
}
