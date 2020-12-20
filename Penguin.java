import java.awt.*;

public class Penguin extends Bird {

    public Penguin(){
        super("пингвин");
        size = 30;
        color1 = Color.black;
        color2 = Color.white;
    }

    public void fly(){
        System.out.println("Я не умею летать");
    }
}
