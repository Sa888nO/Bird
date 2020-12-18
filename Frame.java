import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame{

    private boolean save = true;
    private Flock f;
    static final int sz = 400, nsz = 50, sz1 = 500;

    public Frame(Flock f1){
        JFrame frame = new JFrame("окно");
        this.f = f1;
        this.setSize(sz1,sz1);
        this.setVisible(true);
    }
    public void paint(Graphics g){
        if(save){
            save = false;
            System.out.println("2");
            f.draw(g);
            g.setColor(new Color(0,0,0));
            g.drawLine(250,0,250,500);
            g.drawLine(0,250,500,250);
        }
    }

}
