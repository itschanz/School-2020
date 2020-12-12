// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.SGround.SurfaceAppearance;
// </editor-fold>
/*
 * Program     : Inheritance
 * Programmer  : Chanz Griffin
 * Date        : 12/03/2020
 * Description : Displays use of Quadruped as well as object specific actions
 */
class Scene extends SScene 
{

    /* Construct new Scene */
    public Scene() 
    {
        super();
    }

    /* Event listeners */
    private void initializeEventListeners() 
    {
        this.addSceneActivationListener((SceneActivationEvent event) -> 
        {
            this.myFirstMethod();
        });
    }

    /* Procedures and functions for this scene */
    public void myFirstMethod() 
    {
        cow.eat();
        cow.speak();
        cow.sleep();
        dog.eat();
        dog.speak();
        dog.sleep();
        cat.eat();
        cat.speak();
        cat.sleep();
        rover.speak();
        
    }
    /* End procedures and functions for this scene */

    // <editor-fold defaultstate="collapsed" desc="/* Scene fields  */">
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final Cow cow = new Cow();
    private final AbyssinianCat cat = new AbyssinianCat();
    private final ScottyDog dog = new ScottyDog();
    private final ScottyDog rover = new ScottyDog("female");

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Scene setup  */">
    private void performCustomSetup() 
    {
// Make adjustments to the starting scene, in a way not available in the Scene editor
    }

    private void performGeneratedSetUp() 
    {
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
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.997515, 0.0704531, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(-0.109, 1.88, -11.4));
        this.dog.setPaint(Color.WHITE);
        this.dog.setOpacity(1.0);
        this.dog.setName("dog");
        this.dog.setVehicle(this);
        this.dog.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.dog.setPositionRelativeToVehicle(new Position(-3.31, 0.0, -2.84));
        this.dog.setSize(new Size(0.32, 0.2616, 0.826));
        this.rover.setPaint(Color.WHITE);
        this.rover.setOpacity(1.0);
        this.rover.setName("rover");
        this.rover.setVehicle(this);
        this.rover.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.rover.setPositionRelativeToVehicle(new Position(0, 0, 0));
        this.rover.setSize(new Size(0.32, 0.2616, 0.826));
        this.cat.setPaint(Color.WHITE);
        this.cat.setOpacity(1.0);
        this.cat.setName("cat");
        this.cat.setVehicle(this);
        this.cat.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.cat.setPositionRelativeToVehicle(new Position(0.269, 0.0, -5.21));
        this.cow.setPaint(Color.WHITE);
        this.cow.setOpacity(1.0);
        this.cow.setName("cow");
        this.cow.setVehicle(this);
        this.cow.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.cow.setPositionRelativeToVehicle(new Position(1.5, 0.0, -3.72));
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

    public ScottyDog getDog() {
        return this.dog;
    }

    public AbyssinianCat getCat() {
        return this.cat;
    }

    public Cow getCow() {
        return this.cow;
    }
    // </editor-fold>
}
