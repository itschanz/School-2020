/*
 * Program:      MacDonald
 * Programmer:   Chanz Griffin
 * Date:         11/04/2020
 * Description:  Old macdonald had a farm song
 */
public class MacDonald 
{
    public static void main(String[] args)
    {
        animalVerse("pig", "oink");
        animalVerse("cow", "moo");
        animalVerse("sheep", "baa");
    }  
        public static void animalVerse(String animal, String sound)
        {
        System.out.println("Old MacDonald had a farm, EE-I-EE-I-O."
            + "\nAnd on this farm he had a " + animal + ", EE-I-EE-I-O,"
            + "\nWith a " + sound + " " + sound + " here and a "
            + sound + " " + sound + " there. "
            + "\nHere a " + sound + " there a " + sound
            + " everywwhere a " + sound + " " + sound
            + "\nOld MacDonald had a farm, EE-I-EE-I-O.\n");        
        } // end main
        
 } // end class MacDonald
    

