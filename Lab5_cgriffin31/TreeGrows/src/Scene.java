// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.SGround.SurfaceAppearance;
// </editor-fold>

class Scene extends SScene {

    /* Construct new Scene */
    public Scene() {
        super();
    }

    /* Event listeners */
    private void initializeEventListeners() {
        this.addSceneActivationListener((SceneActivationEvent event) -> {
            this.myFirstMethod();
        });
    }

    /* Procedures and functions for this scene */
    public void myFirstMethod() {
        while (this.wateringHole.getWidth() > 0.1) {
            this.wateringHole.setWidth(this.wateringHole.getWidth() - 0.1);
            this.baobabTree.setHeight(this.baobabTree.getHeight() + 0.1);
        }
    }
    /* End procedures and functions for this scene */

    // <editor-fold defaultstate="collapsed" desc="/* Scene fields  */">
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final BaobabTree baobabTree = new BaobabTree();
    private final WateringHole wateringHole = new WateringHole();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Scene setup  */">
    private void performCustomSetup() {
// Make adjustments to the starting scene, in a way not available in the Scene editor
    }

    private void performGeneratedSetUp() {
// DO NOT EDIT
// This code is automatically generated.  Any work you perform in this method will be overwritten.
// DO NOT EDIT
        this.setAtmosphereColor(new Color(0.588, 0.886, 0.988));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(Color.BLACK);
        this.setFogDensity(0.0);
        this.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.GRASS);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.990331, 0.138723, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(9.61E-16, 3.07, -10.3));
        this.baobabTree.setPaint(Color.WHITE);
        this.baobabTree.setOpacity(1.0);
        this.baobabTree.setName("baobabTree");
        this.baobabTree.setVehicle(this);
        this.baobabTree.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.baobabTree.setPositionRelativeToVehicle(new Position(0.0, 0.0, 0.0));
        this.baobabTree.setScale(new Scale(0.24, 0.24, 0.24));
        this.wateringHole.setPaint(Color.WHITE);
        this.wateringHole.setOpacity(1.0);
        this.wateringHole.setName("wateringHole");
        this.wateringHole.setVehicle(this);
        this.wateringHole.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.wateringHole.setPositionRelativeToVehicle(new Position(0.0432, 0.0, -0.0402));
        this.wateringHole.setScale(new Scale(0.46, 0.46, 0.46));
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Procedures and functions to handle multiple scenes */">
    @Override
    protected void handleActiveChanged(Boolean isActive, Integer activationCount) {
        if (isActive) {
            if (activationCount == 1) {
                this.performGeneratedSetUp();
                this.performCustomSetup();
                this.initializeEventListeners();
            } else {
                this.restoreStateAndEventListeners();
            }
        } else {
            this.preserveStateAndEventListeners();
        }
    }

    public SGround getGround() {
        return this.ground;
    }

    public SCamera getCamera() {
        return this.camera;
    }

    public BaobabTree getBaobabTree() {
        return this.baobabTree;
    }

    public WateringHole getWateringHole() {
        return this.wateringHole;
    }
    // </editor-fold>
}
