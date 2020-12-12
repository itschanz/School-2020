// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.quadruped.AbyssinianCatResource;
// </editor-fold>

class AbyssinianCat extends Quadruped 
{

    /* Construct new AbyssinianCat */
    public AbyssinianCat() 
    {
        super(AbyssinianCatResource.DEFAULT);
    }
    
        public void speak() 
    {
        this.say("MEOW");
    }
}
