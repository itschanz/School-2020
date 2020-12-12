// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.resources.prop.PlateauResource;
// </editor-fold>

class Plateau extends Prop {

    /* Construct new Plateau */
    public Plateau(PlateauResource resource) {
        super(resource);
    }

    public void setPlateauResource(PlateauResource plateauResource) {
        this.setJointedModelResource(plateauResource);
    }
}
