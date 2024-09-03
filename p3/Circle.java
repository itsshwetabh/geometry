// p3/Circle.java
package p3;

import p2.TwoD;

public class Circle extends TwoD {
    double radius;

    public Circle(double r) {
        radius = r;
    }

    @Override
    public void getArea() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}
