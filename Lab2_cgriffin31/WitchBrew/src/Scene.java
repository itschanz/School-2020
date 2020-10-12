// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.SGround.SurfaceAppearance;
// </editor-fold>

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
// Programmer:  Chanz Griffin
// Date:        9/15/2020
// Description: Lab2
//              This program will have the witch move the cauldron
        
        double witchDepth = witch.getDepth();
        double cauldronDepth = cauldron.getDepth();
        double personalSpace = (witchDepth * 0.5) + (cauldronDepth * 0.5);
        
        witch.say("I need to check on my brew." , Say.duration(2.0));
        witch.turnToFace(cauldron);
        witch.moveToward(cauldron, witch.getDistanceTo(cauldron)-personalSpace);
        
        this.witch.turnToFace(this.camera);
        this.witch.say("Its ready", Say.duration(2.0));
        this.witch.say("Will you stay for dinner?", Say.duration(2.0));
        this.witch.say("Yes.  Be back soon.", Say.duration(2.0));
        this.witch.setOpacity(0.0, SetOpacity.duration(0.5));
        
    }
    
    /* End procedures and functions for this scene */

    // <editor-fold defaultstate="collapsed" desc="/* Scene fields  */">
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final Witch witch = new Witch();
    private final Cauldron cauldron = new Cauldron();
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
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.996053, 0.0887605, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(0.0414, 2.09, -8.75));
        this.witch.setPaint(Color.WHITE);
        this.witch.setOpacity(1.0);
        this.witch.setName("witch");
        this.witch.setVehicle(this);
        this.witch.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.witch.setPositionRelativeToVehicle(new Position(1.07, 0.0, -0.305));
        this.cauldron.setPaint(Color.WHITE);
        this.cauldron.setOpacity(1.0);
        this.cauldron.setName("cauldron");
        this.cauldron.setVehicle(this);
        this.cauldron.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.cauldron.setPositionRelativeToVehicle(new Position(-0.997, 0.0, -0.14));
        this.cauldron.setScale(new Scale(0.681, 0.681, 0.681));
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

    public Witch getWitch() {
        return this.witch;
    }

    public Cauldron getCauldron() {
        return this.cauldron;
    }
    // </editor-fold>
    }
