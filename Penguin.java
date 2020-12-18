import java.awt.*;
import java.util.Random;

public class Penguin extends Bird {
    public Penguin(){
        size = 30;
        color1 = Color.black;
        color2 = Color.white;
        System.out.println("Я Пингвин!");
    }

    public void fly(){
        System.out.println("Я не умею летать");
    }
}
