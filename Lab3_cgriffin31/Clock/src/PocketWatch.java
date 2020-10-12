// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.prop.PocketWatchResource;
// </editor-fold>

class PocketWatch extends Prop {

    /* Construct new PocketWatch */
    public PocketWatch() {
        super(PocketWatchResource.DEFAULT);
    }

    public SJoint getHour() {
        return this.getJoint(PocketWatchResource.HOUR);
    }

    public SJoint getMinute() {
        return this.getJoint(PocketWatchResource.MINUTE);
    }
}
