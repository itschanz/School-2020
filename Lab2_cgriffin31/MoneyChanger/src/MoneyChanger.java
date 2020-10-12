/*
 * Program:      Money Changer
 * Programmer:   Chanz Griffin
 * Date:         09/16/2020
 * Description:  This program will break change into correct coins. 
 */

public class MoneyChanger 
{
    
  public static void main(String[] args) 
  {
    //declaring variables
    int cents = 549;
    int centsLeft; //temporary variable for storing remaining cents
    int dollars;
    int quarters;
    int dimes;
    int nickels;
    int pennies;
    
    //begin calculations
    dollars = cents / 100;
    centsLeft = cents % 100;
    quarters = centsLeft / 25;
    centsLeft = centsLeft % 25;
    dimes = centsLeft / 10;
    centsLeft = centsLeft % 10;
    nickels = centsLeft / 5;
    centsLeft = centsLeft % 5;
    pennies = centsLeft;
    
    //output to console
    System.out.println("If you have " + cents + " cents. That will equal:"
    + "\n\nDollars: " + dollars
    + "\nQuarters: " + quarters
    + "\nDimes: " + dimes
    + "\nNickels: " + nickels
    + "\nPennies: " + pennies) ;
    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        
  }  //end main method 
    
}    //end class MoneyChanger
