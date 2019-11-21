import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Penguin extends Bird{
    public Penguin(){
        color = Color.blue;
        size = 15;
        System.out.println("Я пингвин!");
    }
    public void fly(){
        System.out.println("Я не умею летать(!!!");
    }
    public void draw(Graphics graphics){
        int min = z;
        int max = m;
        int diff = max - min;
        Random random = new Random();
        x = random.nextInt(diff + 1);
        x = x + min;
        int min1 = z;
        y = random.nextInt(diff + 1);
        y = y + min1;
        graphics.setColor(color);
        graphics.fillOval(x,y,size,size);
        if(x > Flock.xMax1){
            Flock.xMax1 = x;
        }
        if(x < Flock.xMin1){
            Flock.xMin1 = x;
        }
        if(y > Flock.yMax1){
            Flock.yMax1 = y;
        }
        if(y < Flock.yMin1){
            Flock.yMin1 = y;
        }
    }
}
