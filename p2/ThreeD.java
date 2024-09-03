// p2/ThreeD.java
package p2;

import p1.Shape;

public abstract class ThreeD implements Shape {
    public void getArea() {
        System.out.println("Sorry, The area cannot be computed for 3D objects");
    }
    public abstract void getVolume();  // Abstract method to be implemented by subclasses
}
