/*
Pwrogram:       HappySong
Programmer:     Chanz Griffin
Date:           11/06/2020
Description:    Happy and you know it song
*/
public class HappySong 
{
    public static void main(String[] args) 
    {
        happyVerse("clap your hands ", "(clap clap)");
        happyVerse("stomp your feet ", "(stomp stomp)");
        happyVerse("shout \"Hooray\" ","(hoo-ray! hoo-ray!)");
    
    } // end main
    
    public static void happyVerse(String action, String sound)
    {
        System.out.println("If you're happy and you know it, " + action + sound);
        System.out.println("If you're happy and you know it, " + action + sound);
        System.out.println("If you're happy and you know it, "
                + "then your face will surely show it");
        System.out.println("If you're happy and you know it, " + action + sound);
        System.out.println("");
        
    } // end happyVerse method
    
} // end class HappySong
