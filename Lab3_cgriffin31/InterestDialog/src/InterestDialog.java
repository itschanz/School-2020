/*
Program:        InterestDialog
Programmer:     Chanz Griffin
Date:           10/01/2020  
Description:    Example of GUI app using dialogs

*/
import javax.swing.JOptionPane;
import java.text.NumberFormat;
public class InterestDialog 
{
    public static void main(String[] args) 
    {
        // prompt for loan amount, interest rate, years of loan
        String response;
        response = JOptionPane.showInputDialog(null,
                "How many dollars do you wish to borrow?");
        double amount = Double.parseDouble(response) ;
        
        response = JOptionPane.showInputDialog(null,
                "What is the interest rate?");
        double rate = Double.parseDouble(response) ;
        
        response = JOptionPane.showInputDialog(null,
                "How many years will you take the loan for? (whole number)");
        int years = Integer.parseInt(response) ;
        
        
        // calc total interest
        double totalInterest  = amount * (rate/100) * years;
        
        // create formatter object
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        
        // build output
        String output = "If you borrow " + cf.format(amount)
                + " at an interest rate of " + rate + "%"
                + "\nfor " + years 
                + " years, you will pay " + cf.format(totalInterest) 
                + " in interest.";
        
        // show output
        JOptionPane.showMessageDialog(null, output);
        
    } // end main
    
} // end class InterestDialog