/*
 * Program      : HappyFace
 * Programmer   : Chanz Griffin
 * Date         : 12/07/2020 
 * Description  : Displays a Happy Face
 */

import java.awt.*;
import javax.swing.*;

public class HappyFace extends JComponent
{
    JFrame frame = new JFrame("Happy Face");
    Container content = frame.getContentPane();
            
    public static void main(String[] args) 
    {
        HappyFace drawing = new HappyFace();
        drawing.setUp();
    }
    public void setUp()
    {
        content.setBackground(Color.YELLOW);
        content.add(this);
        
        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    @Override
    public void paintComponent(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.drawString("Happy Face", 20, 40);
        g.setColor(new Color(240, 213, 190)); //face color
        g.fillOval(50, 75, 100, 100); //face
        g.setColor(Color.BLACK); //nose color
        g.drawLine(100, 110, 100, 130); //nose
        g.setColor(Color.BLUE); //eye color
        g.drawOval(70, 100, 12, 5); //left eye
        g.drawOval(110, 100, 12, 5); //right eye
        g.setColor(Color.RED); //mouth color
        g.drawArc(70, 95, 60, 60, 225, 90); //smile
        
    }
    
}
