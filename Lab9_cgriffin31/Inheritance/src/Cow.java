// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.quadruped.CowResource;
// </editor-fold>

class Cow extends Quadruped 
{

    /* Construct new Cow */
    public Cow() 
    {
        super(CowResource.DEFAULT);
    }
    
        public void speak() 
    {
        this.say("MoooOOOO");
    }
        
    @Override
    public void sleep(){
        this.say("ZZZZzzzzZZZZ");
    }
}
