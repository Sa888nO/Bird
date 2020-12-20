import java.awt.*;
import java.util.Random;

public class Parrot extends Bird {

    public Parrot(){
        super("попугай");
        size = 30;
        color1 = Color.red;
        color2 = Color.green;
    }

    public void draw(Graphics g){
        int min = 50;
        int max = 350;
        int diff = max - min;
        Random random = new Random();
        int x = random.nextInt(diff);
        x = x + min;
        int min1 = 100;
        int y = random.nextInt(diff);
        y = y + min1;
        g.setColor(color1);
        g.fillOval(x,y,size,size);
        y = y - 10;
        size = 15;
        g.setColor(color2);
        g.fillOval(x,y,size+10,size);
    }

    public void fly(){
        System.out.println("Я умею летать");
    }
}
