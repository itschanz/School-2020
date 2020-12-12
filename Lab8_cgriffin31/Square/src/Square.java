/*
Program:        Square
Programmer:     Chanz Griffin
Date:           11/20/2020
Description:    Area and Perimeter
*/
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Square 
{
    public static void main(String[] args) 
    {
       String prompt = "What is the length of one side of your square?";
       String response = JOptionPane.showInputDialog(null,prompt);
       double length = Double.parseDouble(response);
       
       double area = calcArea(length);
       double perimeter = calcPerimeter(length);
       
       DecimalFormat df = new DecimalFormat("###.00");
       
       String output = "When the square's length is " + df.format(length);
       output += "\n\nThe area is " + df.format(area);
       output += "\nThe perimeter is " + df.format(perimeter);
       
       JOptionPane.showMessageDialog((null), output);
    }
    
    public static double calcArea(double side) 
    {
        double area;
        
        area = side * side;
        
        return area;
    }
    
    public static double calcPerimeter(double s)
    {
        return s * 4;
    }        
}
