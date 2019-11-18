import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame{
    private Flock f;
    static final int sz = 400, nsz = 50, sz1 = 500;
    public Frame(Flock f1){
        this.f = f1;
        JFrame w = new JFrame("окошко");
        this.setSize(sz1,sz1);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Окошко");
        this.setLocation(0, 0);
        }
    public void paint(Graphics graphics){
        f.paint(graphics);
        graphics.setColor(new Color(0,0,0));
        graphics.drawLine(250,0,250,500);
        graphics.drawLine(0,250,500,250);
    }

}