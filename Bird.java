import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public abstract class Bird{
    protected int size;
    protected Color color1;
    protected Color color2;
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Bird(String whatBirds){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя птицы: ");
        String name = sc.nextLine();
        setName(name);
        System.out.print("Я " + whatBirds + ", меня зовут " + getName() + "! ");
        fly();
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
        x = x + 8;
        y = y + 7;
        size = 15;
        g.setColor(color2);
        g.fillOval(x,y,size,size);
    }

    public void fly(){

    }

}
