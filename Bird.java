import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.color.ColorSpace;
import java.awt.font.GraphicAttribute;
import java.util.Random;

public abstract class Bird{
    protected int x;
    protected int y;
    protected int size;
    protected Color color1;
    protected Color color2;

    public void draw(Graphics g){
        int min = 50;
        int max = 350;
        int diff = max - min;
        Random random = new Random();
        x = random.nextInt(diff + 1);
        x = x + min;
        int min1 = 100;
        y = random.nextInt(diff + 1);
        y = y + min1;
        g.setColor(color1);
        g.fillOval(x,y,size,size);
        x = x + 20;
        y = y + 10;
        size = 15;
        g.setColor(color2);
        g.fillOval(x,y,size,size);
    };

    public void fly(){

    }

}
