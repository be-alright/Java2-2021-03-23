package Box;

import java.util.Scanner;

public class Box2 {
    public static void main(String[] args) {
        Box2 box2 = new Box2();
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your box's length ");
        int length = Integer.parseInt(scan.next());
        System.out.println("Please enter your box's width ");
        int width = Integer.parseInt(scan.next());
        System.out.println("Please enter your box's height ");
        int height = Integer.parseInt(scan.next());
        System.out.println("Length:"+length+",Width:"+width+",Height:"+height);

    }
}
