/*
 * Program     : StudentClient
 * Programmer  : Chanz Griffin
 * Date        : 12/03/2020
 * Description : Displays students name, age and student type
 */

public class StudentClient 
{
    public static void main(String[] args) 
    {
        Student student1 = new Student("Bob", 15);
        Student student2 = new Student("Jan", 13);
        
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Type of student: " 
                + student1.determineTypeOfStudent());
        
        System.out.println(student2.fullString());
        System.out.println("Type of student: " 
                + student2.determineTypeOfStudent());
        
        student1.setName("Ted");
        student1.setAge(35);
        
        System.out.println(student1.fullString());
        System.out.println("Type of student: " 
                + student1.determineTypeOfStudent());
        
        
        
        
    }
    
}
