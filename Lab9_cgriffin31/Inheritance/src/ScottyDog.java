// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.quadruped.ScottyDogResource;
// </editor-fold>

class ScottyDog extends Quadruped 
{
    
    String gender;

    /* Construct new ScottyDog */
    public ScottyDog() 
    {
        super(ScottyDogResource.DEFAULT);
        gender = "unknown";
    }
    
    public ScottyDog(String x) 
    {
        super(ScottyDogResource.DEFAULT);
        gender = x;
    }
    
    public void speak() {
        this.say("ARF! ARF! My sex is " + gender);
    }
}
