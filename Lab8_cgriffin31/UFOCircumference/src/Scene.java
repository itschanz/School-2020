// <editor-fold defaultstate="collapsed" desc="imports">

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import org.lgna.story.*;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.prop.PlateauResource;
import org.lgna.story.resources.prop.BoulderResource;
import org.lgna.story.SGround.SurfaceAppearance;
// </editor-fold>
/*  
    Programmer:     Chanz Griffin
    JDK:            1.8.0_111
    Date:           11/19/2020
    Description:    This program will calculate the circumference of UFOs
                    using a functional method.
*/

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
        alien.say("I will need to clear space for the UFOs to land.");
        alien.say("determining circumference will help me to figure "
                + "out how much space to clear.");
        String input=JOptionPane.showInputDialog(null,"Enter a width for UFO 1");
        Double ufo1Width = Double.parseDouble(input);
        uFO1.setWidth(ufo1Width);
        alien.say("The circumference of the UFOs are as follows");
        DecimalFormat twoDecimals = new DecimalFormat("0.00");
        alien.say("UFO 1: " + twoDecimals.format(uFO1.calculateCircumference()));
        alien.say("UFO 2: " + twoDecimals.format(uFO2.calculateCircumference()));
        alien.say("UFO 3: " + twoDecimals.format(uFO3.calculateCircumference()));
        
    }
    /* End procedures and functions for this scene */

    // <editor-fold defaultstate="collapsed" desc="/* Scene fields  */">
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final Alien alien = new Alien();
    private final UFO uFO1 = new UFO();
    private final UFO uFO2 = new UFO();
    private final UFO uFO3 = new UFO();
    private final Boulder boulder = new Boulder(BoulderResource.BOULDER1_BROWN);
    private final Boulder boulder2 = new Boulder(BoulderResource.BOULDER2_BROWN);
    private final Plateau plateau = new Plateau(PlateauResource.SHORT_BROWN);
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="/* Scene setup  */">
    private void performCustomSetup() {
// Make adjustments to the starting scene, in a way not available in the Scene editor
    }

    private void performGeneratedSetUp() {
// DO NOT EDIT
// This code is automatically generated.  Any work you perform in this method will be overwritten.
// DO NOT EDIT
        this.setAtmosphereColor(new Color(0.886, 0.831, 0.51));
        this.setFromAboveLightColor(Color.WHITE);
        this.setFromBelowLightColor(new Color(0.322, 0.0745, 0.0));
        this.setFogDensity(0.2);
        this.setName("myScene");
        this.ground.setPaint(SurfaceAppearance.SANDY_DESERT);
        this.ground.setOpacity(1.0);
        this.ground.setName("ground");
        this.ground.setVehicle(this);
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.989336, 0.145655, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(1.12, 4.36, -16.5));
        this.alien.setPaint(Color.WHITE);
        this.alien.setOpacity(1.0);
        this.alien.setName("alien");
        this.alien.setVehicle(this);
        this.alien.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.alien.setPositionRelativeToVehicle(new Position(0.127, 0.0, -0.952));
        this.uFO1.setPaint(Color.WHITE);
        this.uFO1.setOpacity(1.0);
        this.uFO1.setName("uFO1");
        this.uFO1.setVehicle(this);
        this.uFO1.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.uFO1.setPositionRelativeToVehicle(new Position(-11.7, 0.0, 13.2));
        this.uFO2.setPaint(Color.WHITE);
        this.uFO2.setOpacity(1.0);
        this.uFO2.setName("uFO2");
        this.uFO2.setVehicle(this);
        this.uFO2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.uFO2.setPositionRelativeToVehicle(new Position(-1.22, 0.0, 10.7));
        this.uFO3.setPaint(Color.WHITE);
        this.uFO3.setOpacity(1.0);
        this.uFO3.setName("uFO3");
        this.uFO3.setVehicle(this);
        this.uFO3.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.uFO3.setPositionRelativeToVehicle(new Position(6.38, 0.0, 4.84));
        this.boulder.setPaint(Color.WHITE);
        this.boulder.setOpacity(1.0);
        this.boulder.setName("boulder");
        this.boulder.setVehicle(this);
        this.boulder.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boulder.setPositionRelativeToVehicle(new Position(-4.53, 0.0, -1.91));
        this.boulder.setScale(new Scale(2.62, 2.62, 2.62));
        this.boulder2.setPaint(Color.WHITE);
        this.boulder2.setOpacity(1.0);
        this.boulder2.setName("boulder2");
        this.boulder2.setVehicle(this);
        this.boulder2.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.boulder2.setPositionRelativeToVehicle(new Position(3.63, 0.0, -4.88));
        this.boulder2.setScale(new Scale(1.39, 1.39, 1.39));
        this.plateau.setPaint(Color.WHITE);
        this.plateau.setOpacity(1.0);
        this.plateau.setName("plateau");
        this.plateau.setVehicle(this);
        this.plateau.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.plateau.setPositionRelativeToVehicle(new Position(-4.07, 0.0, 2.76));
        this.plateau.setScale(new Scale(0.89, 0.89, 0.89));
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

    public Alien getAlien() {
        return this.alien;
    }

    public UFO getUFO1() {
        return this.uFO1;
    }

    public UFO getUFO2() {
        return this.uFO2;
    }

    public UFO getUFO3() {
        return this.uFO3;
    }

    public Boulder getBoulder() {
        return this.boulder;
    }

    public Boulder getBoulder2() {
        return this.boulder2;
    }

    public Plateau getPlateau() {
        return this.plateau;
    }
    // </editor-fold>
}
