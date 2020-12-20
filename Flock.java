import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Flock{

    ArrayList<Bird> f = new ArrayList<>();
    public Flock(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1 = добавить попугая , 2 = добавить пингвина, 0 = закончить ввод птиц и вывести их на экран");
        int num = sc.nextInt();
        while (num != 0) {
            if (num == 1) {
                f.add(new Parrot());
            }
            if (num == 2) {
                f.add(new Penguin());
            }
            num = sc.nextInt();
        }
    }

    public void draw (Graphics g) {
        for (Bird bird : f) {
            bird.draw(g);
        }
    }

}