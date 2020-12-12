/*
 * Program:      MathQ
 * Programmer:   Chanz Griffin
 * Date:         10/23/2020
 * Description:  Math questions with results
 */
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MathQ 
{
    public static void main(String[] args) 
    {
        int countEquationNumber = 0;
        int countEquationsCorrect = 0;
        
        String response = JOptionPane.showInputDialog(null,
                "How many equations would you like to solve?",
                " Math Quiz - Addition", JOptionPane.INFORMATION_MESSAGE) ;
        //int n = Integer.parseInt(response);
        double n = Double.parseDouble(response);
        
        DecimalFormat df = new DecimalFormat("##.##");
        
        for (int i = 0; i < n; i++)
        {
            int r1 = (int) (Math.random() * 10 +1);
            int r2 = (int) (Math.random() * 10 +1);
            
            response = JOptionPane.showInputDialog(null, 
                    r1 + " + " + r2 + " = ?", 
                    "Equation " + (countEquationNumber +1)
                    + " out of " + df.format(n), 
                    JOptionPane.INFORMATION_MESSAGE);
            countEquationNumber = countEquationNumber + 1;
            int answer = Integer.parseInt(response);
            
            if (answer == r1 + r2)
            {
                JOptionPane.showMessageDialog(null, "Correct!");
                countEquationsCorrect ++;
            }else
            {
                JOptionPane.showMessageDialog(null, "Incorrect!");
            }    
        } // end loop
        double percentage = 100 * (countEquationsCorrect / n);
        
        String message;
        if (percentage >= 90)
            message = "Great job!";
        else if (percentage >= 80)
            message = "Good job!";
        else if (percentage >= 70)
            message = "Pretty Good!";
        else if (percentage >= 60)
            message = "Keep Trying!";
        else
            message = "You need more practice.";
        
        String output = "You got " + countEquationsCorrect
                + " out of " + df.format(n) + " questions correct."
                + "\nThat equates to " + df.format(percentage) + "%. " + message;
        
        JOptionPane.showMessageDialog(null, output, "Math Quiz - Addition",
                JOptionPane.INFORMATION_MESSAGE);
        
    } // end main
    
} // end class MathQ
