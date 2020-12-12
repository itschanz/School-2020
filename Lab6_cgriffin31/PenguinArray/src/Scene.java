// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.resources.flyer.PenguinResource;
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
// Chanz Griffin
// 10/28/2020
// This program will use an array of penguins to have each penguin jump into the hole.
        Penguin[] penguinArray = new Penguin[]{this.tux, this.waddles, this.icy};
        for (Penguin item : penguinArray) {
            item.moveTo(this.hole);
            item.getNeck().turn(TurnDirection.FORWARD, 0.125);
            item.move(MoveDirection.DOWN, 2.0);
        }
    }
    /* End procedures and functions for this scene */

    // <editor-fold defaultstate="collapsed" desc="/* Scene fields  */">
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final Penguin tux = new Penguin(PenguinResource.ADULT);
    private final Penguin waddles = new Penguin(PenguinResource.ADULT);
    private final Penguin icy = new Penguin(PenguinResource.ADULT);
    private final Disc hole = new Disc();
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Scene setup  */">
    private void performCustomSetup() {
// Make adjustments to the starting scene, in a way not available in the Scene editor
    }

    private void performGeneratedSetUp() {
// DO NOT EDIT
// This code is automatically generated.  Any work you perform in this method will be overwritten.
// DO NOT EDIT
        this.setAtmosphereColor(new Color(0.82, 0.941, 1.0));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(Color.WHITE);
        this.setFogDensity(0.22);
        this.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.SNOW);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.996833, 0.0795198, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(-0.019, 1.78, -8.2));
        this.tux.setPaint(Color.WHITE);
        this.tux.setOpacity(1.0);
        this.tux.setName("tux");
        this.tux.setVehicle(this);
        this.tux.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.tux.setPositionRelativeToVehicle(new Position(1.14, 0.0, 0.0246));
        this.waddles.setPaint(Color.WHITE);
        this.waddles.setOpacity(1.0);
        this.waddles.setName("waddles");
        this.waddles.setVehicle(this);
        this.waddles.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.waddles.setPositionRelativeToVehicle(new Position(-0.0611, 0.0, 0.113));
        this.icy.setPaint(Color.WHITE);
        this.icy.setOpacity(1.0);
        this.icy.setName("icy");
        this.icy.setVehicle(this);
        this.icy.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.icy.setPositionRelativeToVehicle(new Position(-1.23, 0.0, -0.0156));
        this.hole.setRadius(0.685);
        this.hole.setPaint(Color.BLACK);
        this.hole.setOpacity(1.0);
        this.hole.setName("hole");
        this.hole.setVehicle(this);
        this.hole.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.hole.setPositionRelativeToVehicle(new Position(-0.0272, 0.01, -1.93));
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

    public Penguin getTux() {
        return this.tux;
    }

    public Penguin getWaddles() {
        return this.waddles;
    }

    public Penguin getIcy() {
        return this.icy;
    }

    public Disc getHole() {
        return this.hole;
    }
    // </editor-fold>
}
