import java.awt.*;
import java.util.Random;

public class Parrot extends Bird {
    public Parrot(){
        size = 30;
        color1 = Color.red;
        color2 = Color.green;
        System.out.println("Я Попугай!");
    }

    public void fly(){
        System.out.println("Я умею летать");
    }
}
