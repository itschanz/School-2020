// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.prop.BoulderResource;
// </editor-fold>

class Boulder extends Prop {

    /* Construct new Boulder */
    public Boulder(BoulderResource resource) {
        super(resource);
    }

    public void setBoulderResource(BoulderResource boulderResource) {
        this.setJointedModelResource(boulderResource);
    }
}
