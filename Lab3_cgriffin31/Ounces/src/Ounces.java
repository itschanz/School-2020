/*
Program:        Ounces
Programmer:     Chanz Griffin
Date:           10/01/2020
Description:    Example of using Scanner class
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ounces 
{
    public static void main(String[] args) 
    {
        // create scanner object
        Scanner input = new Scanner(System.in);
        
        // recieve input and convert to num
        System.out.print("How many ounces do you wish to convert? ");
        double oz = input.nextDouble();
        
        // perform conversions
        double cup = oz/8;
        double pint = oz/16;
        double qt = oz/32;
        double gal = oz/128;
        
        // create the decimal formatter object
        DecimalFormat df = new DecimalFormat ("###,###.##");
        
        // build output string
        String output = "\nOunces: " + df.format(oz)
                + "\nCups: " + df.format(cup)
                + "\nPints: " + df.format(pint)
                + "\nQuarts: " + df.format(qt)
                + "\nGallons: " + df.format(gal);
                
        // show output string
        System.out.println(output);
    
    } // end main method
    
} // end class Ounces
