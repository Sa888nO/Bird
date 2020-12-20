import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame{

    private boolean save = true;
    private Flock f;
    static final int sz = 500;

    public Frame(Flock f1){
        JFrame frame = new JFrame("окно");
        this.f = f1;
        this.setSize(sz,sz);
        this.setVisible(true);
    }

    public void paint(Graphics g){
        if(save){
            save = false;
            f.draw(g);
            g.setColor(new Color(0,0,0));
            g.drawLine(sz/2,0,sz/2,sz);
            g.drawLine(0,sz/2,sz,sz/2);
        }
    }

}
