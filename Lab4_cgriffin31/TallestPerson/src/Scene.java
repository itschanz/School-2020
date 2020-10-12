// <editor-fold defaultstate="collapsed" desc="imports">

import org.lgna.story.*;
import org.lgna.story.resources.sims2.FemaleChildHairBarrette;
import org.lgna.story.resources.sims2.ChildFullBodyOutfitPirate;
import org.lgna.story.resources.sims2.BaseFace;
import org.lgna.story.resources.sims2.ChildHairDreadlockShort;
import org.lgna.story.SGround.SurfaceAppearance;
import org.lgna.story.event.SceneActivationEvent;
import org.lgna.story.resources.sims2.ChildFullBodyOutfitPuffyPJ;
import org.lgna.story.resources.sims2.ChildPersonResource;
import org.lgna.story.resources.sims2.FemaleChildHairFormal;
import org.lgna.story.resources.sims2.Gender;
import org.lgna.story.resources.sims2.BaseEyeColor;
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
        jessica.setHeight (1.8);
        allison.setHeight (1.1);
        obi.setHeight (0.5);
        double jessicaHeight = jessica.getHeight();
        double allisonHeight = allison.getHeight();
        double obiHeight = obi.getHeight();
        if(allisonHeight>jessicaHeight && allisonHeight>obiHeight)
            {
            allison.say ("I am the tallest.");
            }
        
        else if (jessicaHeight>obiHeight)
            {
            jessica.say ("I am the tallest.") ;
            }
        
        else
            {
            obi.say ("I am the tallest.") ; 
            }
           
        
       
        
    }
    /* End procedures and functions for this scene */

    // <editor-fold defaultstate="collapsed" desc="/* Scene fields  */">
    private final SGround ground = new SGround();
    private final SCamera camera = new SCamera();
    private final ChildPerson allison = new ChildPerson(new ChildPersonResource(Gender.FEMALE, new Color(0.4, 0.212, 0.051), BaseEyeColor.LIGHT_BLUE, ChildHairDreadlockShort.RED, 0.813504, ChildFullBodyOutfitPuffyPJ.DUCKIE, BaseFace.HUMAN_08));
    private final ChildPerson jessica = new ChildPerson(new ChildPersonResource(Gender.FEMALE, new Color(0.741, 0.506, 0.353), BaseEyeColor.LIGHT_BLUE, FemaleChildHairBarrette.RED, 0.725939, ChildFullBodyOutfitPirate.BLUE_STRIPE, BaseFace.HUMAN_13));
    private final ChildPerson obi = new ChildPerson(new ChildPersonResource(Gender.FEMALE, new Color(0.62, 0.4, 0.227), BaseEyeColor.DARK_BROWN, FemaleChildHairFormal.BLACK, 0.204242, ChildFullBodyOutfitPirate.BLUE_STRIPE, BaseFace.ALIEN));
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
        this.camera.setOrientationRelativeToVehicle(new Orientation(0.0, 0.995185, 0.0980169, 6.12323E-17));
        this.camera.setPositionRelativeToVehicle(new Position(9.44E-16, 1.56, -7.85));
        this.allison.setPaint(Color.WHITE);
        this.allison.setOpacity(1.0);
        this.allison.setName("allison");
        this.allison.setVehicle(this);
        this.allison.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.allison.setPositionRelativeToVehicle(new Position(0.671, 0.0, -2.4));
        this.allison.setScale(new Scale(1.24, 1.24, 1.24));
        this.allison.getPelvis().setPositionRelativeToVehicle(new Position(0.0, -9.39E-8, -0.0459));
        this.allison.getSpineBase().setPositionRelativeToVehicle(new Position(-1.2E-7, 0.028, -0.0828));
        this.allison.getSpineMiddle().setPositionRelativeToVehicle(new Position(-5.35E-14, -8.89E-8, -0.112));
        this.allison.getSpineUpper().setPositionRelativeToVehicle(new Position(6.25E-8, 0.0, -0.119));
        this.allison.getNeck().setPositionRelativeToVehicle(new Position(-6.25E-8, 0.0, -0.14));
        this.allison.getHead().setPositionRelativeToVehicle(new Position(3.0E-13, 0.0, -0.0784));
        this.allison.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.0313, -0.103));
        this.allison.getRightEye().setPositionRelativeToVehicle(new Position(0.0325, 0.094, -0.0828));
        this.allison.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0325, 0.094, -0.0828));
        this.allison.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0325, 0.094, -0.0828));
        this.allison.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0325, 0.094, -0.0828));
        this.allison.getRightHip().setPositionRelativeToVehicle(new Position(0.0627, 3.74E-8, -0.047));
        this.allison.getRightKnee().setPositionRelativeToVehicle(new Position(-1.11E-12, 7.23E-17, -0.327));
        this.allison.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, -2.36E-10, -0.347));
        this.allison.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 3.98E-17, -0.126));
        this.allison.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0627, -1.55E-7, -0.047));
        this.allison.getLeftKnee().setPositionRelativeToVehicle(new Position(-2.61E-13, -1.73E-7, -0.327));
        this.allison.getLeftAnkle().setPositionRelativeToVehicle(new Position(4.63E-13, -3.41E-7, -0.347));
        this.allison.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 3.98E-17, -0.126));
        this.allison.getRightClavicle().setPositionRelativeToVehicle(new Position(0.0336, -0.0386, -0.107));
        this.allison.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 1.24E-7, -0.0884));
        this.allison.getRightElbow().setPositionRelativeToVehicle(new Position(5.01E-7, -1.63E-7, -0.226));
        this.allison.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, -3.24E-13, -0.0996));
        this.allison.getRightHand().setPositionRelativeToVehicle(new Position(5.58E-17, -2.87E-13, -0.0884));
        this.allison.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0364, -0.00784, -0.0353));
        this.allison.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(1.55E-16, -8.29E-14, -0.0269));
        this.allison.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.028, -2.6E-13, -0.0705));
        this.allison.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(5.58E-17, -8.36E-14, -0.0257));
        this.allison.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00672, -2.4E-13, -0.0716));
        this.allison.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(-3.89E-18, -9.09E-14, -0.028));
        this.allison.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0291, -2.02E-13, -0.0672));
        this.allison.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(-1.03E-16, -9.09E-14, -0.0257));
        this.allison.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.0336, -0.0386, -0.107));
        this.allison.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0884));
        this.allison.getLeftElbow().setPositionRelativeToVehicle(new Position(7.97E-7, 7.34E-13, -0.226));
        this.allison.getLeftWrist().setPositionRelativeToVehicle(new Position(3.43E-7, 3.25E-13, -0.0996));
        this.allison.getLeftHand().setPositionRelativeToVehicle(new Position(3.49E-7, 2.89E-13, -0.0884));
        this.allison.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0364, -0.00784, -0.0353));
        this.allison.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(3.25E-9, 8.25E-14, -0.0269));
        this.allison.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.028, -1.59E-16, -0.0705));
        this.allison.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0257));
        this.allison.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00672, -3.18E-16, -0.0716));
        this.allison.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.028));
        this.allison.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0291, 0.0, -0.0672));
        this.allison.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(3.34E-9, 0.0, -0.0257));
        this.jessica.setPaint(Color.WHITE);
        this.jessica.setOpacity(1.0);
        this.jessica.setName("jessica");
        this.jessica.setVehicle(this);
        this.jessica.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.jessica.setPositionRelativeToVehicle(new Position(-0.167, 0.0, -2.4));
        this.jessica.setScale(new Scale(1.12, 1.12, 1.12));
        this.jessica.getPelvis().setPositionRelativeToVehicle(new Position(0.0, -8.46E-8, -0.0414));
        this.jessica.getSpineBase().setPositionRelativeToVehicle(new Position(-1.08E-7, 0.0252, -0.0746));
        this.jessica.getSpineMiddle().setPositionRelativeToVehicle(new Position(-4.82E-14, -8.01E-8, -0.101));
        this.jessica.getSpineUpper().setPositionRelativeToVehicle(new Position(5.63E-8, 0.0, -0.107));
        this.jessica.getNeck().setPositionRelativeToVehicle(new Position(-5.63E-8, 0.0, -0.126));
        this.jessica.getHead().setPositionRelativeToVehicle(new Position(2.7E-13, 0.0, -0.0706));
        this.jessica.getMouth().setPositionRelativeToVehicle(new Position(0.0, 0.0282, -0.0928));
        this.jessica.getRightEye().setPositionRelativeToVehicle(new Position(0.0292, 0.0847, -0.0746));
        this.jessica.getLeftEye().setPositionRelativeToVehicle(new Position(-0.0292, 0.0847, -0.0746));
        this.jessica.getLeftEyelid().setPositionRelativeToVehicle(new Position(-0.0292, 0.0847, -0.0746));
        this.jessica.getRightEyelid().setPositionRelativeToVehicle(new Position(0.0292, 0.0847, -0.0746));
        this.jessica.getRightHip().setPositionRelativeToVehicle(new Position(0.0565, 3.37E-8, -0.0424));
        this.jessica.getRightKnee().setPositionRelativeToVehicle(new Position(-9.98E-13, 6.51E-17, -0.295));
        this.jessica.getRightAnkle().setPositionRelativeToVehicle(new Position(0.0, -2.12E-10, -0.313));
        this.jessica.getRightFoot().setPositionRelativeToVehicle(new Position(0.0, 3.58E-17, -0.114));
        this.jessica.getLeftHip().setPositionRelativeToVehicle(new Position(-0.0565, -1.4E-7, -0.0424));
        this.jessica.getLeftKnee().setPositionRelativeToVehicle(new Position(-2.35E-13, -1.55E-7, -0.295));
        this.jessica.getLeftAnkle().setPositionRelativeToVehicle(new Position(4.17E-13, -3.08E-7, -0.313));
        this.jessica.getLeftFoot().setPositionRelativeToVehicle(new Position(0.0, 3.58E-17, -0.114));
        this.jessica.getRightClavicle().setPositionRelativeToVehicle(new Position(0.0303, -0.0348, -0.0966));
        this.jessica.getRightShoulder().setPositionRelativeToVehicle(new Position(0.0, 1.11E-7, -0.0797));
        this.jessica.getRightElbow().setPositionRelativeToVehicle(new Position(4.51E-7, -1.47E-7, -0.204));
        this.jessica.getRightWrist().setPositionRelativeToVehicle(new Position(0.0, -2.92E-13, -0.0898));
        this.jessica.getRightHand().setPositionRelativeToVehicle(new Position(5.02E-17, -2.58E-13, -0.0797));
        this.jessica.getRightThumb().setPositionRelativeToVehicle(new Position(-0.0328, -0.00706, -0.0318));
        this.jessica.getRightThumbKnuckle().setPositionRelativeToVehicle(new Position(1.39E-16, -7.47E-14, -0.0242));
        this.jessica.getRightIndexFinger().setPositionRelativeToVehicle(new Position(-0.0252, -2.35E-13, -0.0635));
        this.jessica.getRightIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(5.02E-17, -7.53E-14, -0.0232));
        this.jessica.getRightMiddleFinger().setPositionRelativeToVehicle(new Position(-0.00605, -2.16E-13, -0.0646));
        this.jessica.getRightMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(-3.5E-18, -8.19E-14, -0.0252));
        this.jessica.getRightPinkyFinger().setPositionRelativeToVehicle(new Position(0.0262, -1.82E-13, -0.0605));
        this.jessica.getRightPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(-9.31E-17, -8.19E-14, -0.0232));
        this.jessica.getLeftClavicle().setPositionRelativeToVehicle(new Position(-0.0303, -0.0348, -0.0966));
        this.jessica.getLeftShoulder().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0797));
        this.jessica.getLeftElbow().setPositionRelativeToVehicle(new Position(7.18E-7, 6.61E-13, -0.204));
        this.jessica.getLeftWrist().setPositionRelativeToVehicle(new Position(3.09E-7, 2.93E-13, -0.0898));
        this.jessica.getLeftHand().setPositionRelativeToVehicle(new Position(3.14E-7, 2.6E-13, -0.0797));
        this.jessica.getLeftThumb().setPositionRelativeToVehicle(new Position(0.0328, -0.00706, -0.0318));
        this.jessica.getLeftThumbKnuckle().setPositionRelativeToVehicle(new Position(2.93E-9, 7.44E-14, -0.0242));
        this.jessica.getLeftIndexFinger().setPositionRelativeToVehicle(new Position(0.0252, -1.43E-16, -0.0635));
        this.jessica.getLeftIndexFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0232));
        this.jessica.getLeftMiddleFinger().setPositionRelativeToVehicle(new Position(0.00605, -2.87E-16, -0.0646));
        this.jessica.getLeftMiddleFingerKnuckle().setPositionRelativeToVehicle(new Position(0.0, 0.0, -0.0252));
        this.jessica.getLeftPinkyFinger().setPositionRelativeToVehicle(new Position(-0.0262, 0.0, -0.0605));
        this.jessica.getLeftPinkyFingerKnuckle().setPositionRelativeToVehicle(new Position(3.01E-9, 0.0, -0.0232));
        this.obi.setPaint(Color.WHITE);
        this.obi.setOpacity(1.0);
        this.obi.setName("obi");
        this.obi.setVehicle(this);
        this.obi.setOrientationRelativeToVehicle(new Orientation(0.0, 0.0, 0.0, 1.0));
        this.obi.setPositionRelativeToVehicle(new Position(-0.957, 0.0, -2.4));
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

    public ChildPerson getAllison() {
        return this.allison;
    }

    public ChildPerson getJessica() {
        return this.jessica;
    }

    public ChildPerson getObi() {
        return this.obi;
    }
    // </editor-fold>
}
