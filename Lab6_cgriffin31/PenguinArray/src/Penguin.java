// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.flyer.PenguinResource;
// </editor-fold>

class Penguin extends Flyer {

    /* Construct new Penguin */
    public Penguin(PenguinResource resource) {
        super(resource);
    }

    public void setPenguinResource(PenguinResource penguinResource) {
        this.setJointedModelResource(penguinResource);
    }
}
