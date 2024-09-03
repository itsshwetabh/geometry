// p2/TwoD.java
package p2;

import p1.Shape;

public abstract class TwoD implements Shape {
    public abstract void getArea();  // Abstract method to be implemented by subclasses
    
    public void getVolume() {
        System.out.println("The volume can't be found for TwoD objects!!");
    }
}
