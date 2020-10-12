/* 
 * Program :    Interest
 * Programmer:  Chanz Griffin
 * Date:        09/17/2020
 * Description: Interger Division
*/

public class Interest 
{
    public static void main(String[] args) 
    {
        //declare variables
        int rate;
        int years;
        double loan;
        double interest;
        
        //populate variables
        rate = 6;
        years = 15;
        loan = 5000;
        
        //perform calculations
        interest = loan * (rate/100.0) * years;
        
        
        //show output
        System.out.println("Principal amount of the loan: $" + loan);
        System.out.println("Interesst rate: " + rate + "%");
        System.out.println("Number of years: " + years);
        System.out.println("Total interest paid: $" + interest);
    } //end main 
    
} //end class
