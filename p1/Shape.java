// p1/Shape.java
package p1;

import p3.Circle;
import p3.Sphere;

public interface Shape {
    // Corrected static method to return an appropriate Shape object
    public static Shape getShape(String s, double r) {
        switch (s.toLowerCase()) {
            case "circle":
                return new Circle(r); // Returning a new Circle object
            case "sphere":
                return new Sphere(r); // Returning a new Sphere object
            default:
                throw new IllegalArgumentException("Invalid shape type: " + s);
        }
    }
    
    void getArea();  // Method to be implemented by TwoD shapes
    void getVolume();  // Method to be implemented by ThreeD shapes
}
