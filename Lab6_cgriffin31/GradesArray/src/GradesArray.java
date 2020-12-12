/*
 * Program:      GradesArray
 * Programmer:   Chanz Griffin
 * Date:         10/28/2020
 * Description:  Determing grades
 */
import javax.swing.JOptionPane;

public class GradesArray 
{
    public static void main(String[] args) 
    {
        String response = JOptionPane.showInputDialog(null, 
                "Number of Scores: ");
        int number = Integer.parseInt(response);
        
        int scores[] = new int[number];
        
        for (int i = 0; i < number; i++)
        {
            response = JOptionPane.showInputDialog(null, 
                    "Enter score " + (i+1));
            scores[i] = Integer.parseInt(response);
            
        } 
        
        int sum = 0;
        int largest = scores[0];
        int smallest = scores[0];
        int average = 0;
        
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;
        
        for (int i = 0; i < scores.length; i++)
        {
            sum = sum + scores[i];
            if (scores[i] > largest)
               largest = scores[i];
            if (scores[i] < smallest)
                smallest = scores[i];
            
            if (scores[i] >= 90 && scores[i] <= 100)
                gradeA = gradeA +1;
            else if (scores[i] >= 80 && scores[i] <= 89)
                gradeB++;
            else if (scores[i] >= 70 && scores[i] <= 79)
                gradeC++;
            else if (scores[i] >= 60 && scores[i] <= 69)
                gradeD++;
            else if (scores[i] >= 0 && scores[i] <= 59)
                gradeF++;            
        }
        
        average = sum / scores.length;
        
        String output = "The sum is " + sum;
        output += "\nThe average is " + average;
        output += "\nThe largest score is " + largest;
        output += "\nThe smallest score is " + smallest;
        output += "\nNumber of A's: " + gradeA;
        output += "\nNumber of B's: " + gradeB;
        output += "\nNumber of C's: " + gradeC;
        output += "\nNumber of D's: " + gradeD;
        output += "\nNumber of F's: " + gradeF;
        
        JOptionPane.showMessageDialog(null, output);
        
    } // end main
    
} // end class GradesArray
