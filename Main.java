// Main.java
import p1.Shape;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String shapename;
        System.out.println("Enter the shape name (circle/sphere): ");
        shapename = in.next();
        double radius;
        System.out.println("Enter the radius of the shape: ");
        radius = in.nextDouble();

        Shape s1 = Shape.getShape(shapename, radius);
        s1.getArea();
        s1.getVolume();
        
        in.close();
    }
}
