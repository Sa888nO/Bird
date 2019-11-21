import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class Macaw extends Bird{
    public Macaw(){
        size = 30;
        color = Color.red;
        System.out.println("Я попугай!");
    }
    public void draw(Graphics graphics) {
        int min = 50;
        int max = 350;
        int diff = max - min;
        Random random = new Random();
        x = random.nextInt(diff + 1);
        x = x + min;
        int min1 = 100;
        y = random.nextInt(diff + 1);
        y = y + min1;
        graphics.setColor(color);
        graphics.fillOval(x,y,size,size);
        if(x > Flock.xMax){
            Flock.xMax = x;
        }
        if(x < Flock.xMin){
            Flock.xMin = x;
        }
        if(y > Flock.yMax){
            Flock.yMax = y;
        }
        if(y < Flock.yMin){
            Flock.yMin = y;
        }
        x = x + 20;
        y = y + 10;
        color = Color.green;
        size = 15;
        graphics.setColor(color);
        graphics.fillOval(x,y,size,size);
        color = color.red;
        graphics.setColor(color);
    }
    public String name = "кузя";
    public Macaw(String name) {
        this.name = name;
        System.out.println("Меня зовут"+ name +"! ");
    }
    public void dialog(Macaw m){
      System.out.println("Привет " + m.name + ", моё имя " + name );
    }
    public void speak(){
        System.out.println("Меня зовут "+this.name);
    }
    public void dialog2(Penguin m){
        System.out.println("хаха , ты не умеешь летать! Я с тобой не дружу! ");
    }
}
