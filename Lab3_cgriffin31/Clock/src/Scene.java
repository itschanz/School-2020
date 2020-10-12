// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.event.SceneActivationEvent;
import javax.swing.JOptionPane;
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
// Chanz Griffin
// 09/28/2020
// This program will prompt the user for a time and change the clock based on that time.
        String response = JOptionPane.showInputDialog(null,"Enter hours as an integer.") ;
        int time = Integer.parseInt(response) ;
        double hour =time/12.0;
        this.clock.getHour().roll(RollDirection.LEFT, hour) ;
        response = JOptionPane.showInputDialog(null,"Enter minutes as a integer.") ;
        time = Integer.parseInt(response);
        double min = time/60.0;
        this.clock.getMinute().roll(RollDirection.LEFT, min) ;
    }
    /* End procedures and functions for this scene */

    // <editor-fold defaultstate="collapsed" desc="/* Scene fields  */">
    private final SCamera camera = new SCamera();
    private final PocketWatch clock = new PocketWatch();
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
        this.camera.setName("camera");
        this.camera.setVehicle(this);
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.93741, 0.348227, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(-1.4, 29.2, -31.3));
        this.clock.setPaint(Color.WHITE);
        this.clock.setOpacity(1.0);
        this.clock.setName("clock");
        this.clock.setVehicle(this);
        this.clock.setOrientationRelativeToVehicle(new Orientation(0.182049, 0.0245794, -0.00455218, 0.982972));
        this.clock.setPositionRelativeToVehicle(new Position(-1.23, 0.0, -0.947));
        this.clock.setScale(new Scale(68.3, 68.3, 68.3));
        this.clock.getHour().setPositionRelativeToVehicle(new Position(0.0, 0.0, -1.95));
        this.clock.getMinute().setPositionRelativeToVehicle(new Position(0.0, 0.0, -1.95));
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

    public SCamera getCamera() {
        return this.camera;
    }

    public PocketWatch getClock() {
        return this.clock;
    }
    // </editor-fold>
}
