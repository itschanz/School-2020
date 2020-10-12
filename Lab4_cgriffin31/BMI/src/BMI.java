
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/*
Program:        BMI
Programmer:     Chanz Griffin
Date:           10/08/2020
Description:    Conditionals
*/
public class BMI 
{

    public static void main(String[] args) 
    {
        // prompt for input using dialog
        String response;
        response = JOptionPane.showInputDialog(null,
                "Enter your height in inches:");
        double height = Double.parseDouble(response);
        response = JOptionPane.showInputDialog(null,
                "Enter your weight in pounds:");
        double weight = Double.parseDouble(response);
        // compute BMI
        double bmi = (weight * 703) / (height * height);
                
        // provide feedback
        String classification = "";
        if (bmi < 16)
        {
            classification = "Invalid";
        }
        else if (bmi >= 16 && bmi < 18.5)
            classification = "Underweight";
        else if (bmi >= 18.5 && bmi < 25)
            classification = "Healthy";
        else if (bmi >=25)
            classification = "Overweight";
        
        //create formatting object
        DecimalFormat df = new DecimalFormat ("###.00");
        
        // build output string
        String output = "Height: " + df.format(height)
                + "\nWeight: " + df.format(weight)
                + "\nBMI: " + df.format(bmi)
                + "\nClassification: " + classification;        
        
        // show output string in message dialog
        JOptionPane.showMessageDialog(null, output);
    } // end main
    
} // end class BMI
