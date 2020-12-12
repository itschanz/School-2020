/*
 * Program      : TextAnimation
 * Programmer   : Chanz Griffin
 * Date         : 12/07/2020 
 * Description  : Displays a animated text "Java is fun!
 */

import java.awt.*;
import javax.swing.*;

public class TextAnimation extends JComponent 
{
    JFrame frame = new JFrame("Text Animation");
    Container content = frame.getContentPane();
    int x = 112;
    int y = 50;
    int red = 0;
    int green =255;
    int blue = 255;
    int size = 8;
    int index = 1;
    
    public static void main(String[] args)
    {
            TextAnimation drawing = new TextAnimation();
            drawing.setUp();
    }
    public void setUp()
    {
        content.setBackground(Color.WHITE);
        content.add(this);
        
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        animate();
    }
    public void animate()
    {
        for (index=1; index<=37; index++)
        {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            repaint ();
            x -=3;
            y += 2;
            red += 5;
            green -= 5;
            size += 2;
        }
    }
    @Override
    public void paintComponent(Graphics g)
    {
        g.setFont(new Font("TimesRoman", Font.BOLD, size));
        g.setColor(new Color(red, green,blue));
        g.drawString("Java is fun!", x, y);
    }
}
