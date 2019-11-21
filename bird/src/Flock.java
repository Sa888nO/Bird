import javax.crypto.Mac;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Flock extends Bird{
    protected static int xMin = Frame.sz, xMax = Frame.nsz, yMin = Frame.sz, yMax = Frame.nsz;//Macaw
    protected static int xMin1 = Frame.sz, xMax1 = Frame.nsz, yMin1 = Frame.sz, yMax1 = Frame.nsz;//Penguin
    protected static int xMin2 = Frame.sz, xMax2 = Frame.nsz, yMin2 = Frame.sz, yMax2 = Frame.nsz;//Sparrow
    ArrayList<Bird> f = new ArrayList<Bird>();
    public void floke(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 = добавить попугая , 2 = добавить пенгвина, 3 = добавить воробья, 0 = закончить ввод птиц");
        int num = sc.nextInt();
        int s[];
        s = new int[Frame.sz];
        int k = 0;
        while (num != 0) {
            k++;
            if (num == 1) {
                f.add(new Macaw());
                s[k] = 1;
            }
            if (num == 2) {
                f.add(new Penguin());
                s[k] = 2;
            }
            if (num == 3) {
                f.add(new Sparrow());
                s[k] = 3;
            }
            num = sc.nextInt();
        }
        System.out.println(f);
    }
    public void paint(Graphics graphics){
        int k = 0;
        for(int i = 0; i < f.size();i++) {
            f.get(i).draw(graphics);
        }
        color = Color.red;
        graphics.setColor(color);
        graphics.drawRect(xMin,yMin,yMax,xMax);
        color = Color.blue;
        graphics.setColor(color);
        graphics.drawRect(xMin1,yMin1,yMax1,xMax1);
        color = Color.gray;
        graphics.setColor(color);
        graphics.drawRect(xMin2,yMin2,yMax2,xMax2);
    }
}


