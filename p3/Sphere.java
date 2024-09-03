// p3/Sphere.java
package p3;

import p2.ThreeD;

public class Sphere extends ThreeD {
    double radius;

    public Sphere(double r) {
        radius = r;
    }

    @Override
    public void getVolume() {
        System.out.println("Volume of Sphere: " + ((4 / 3.0) * 3.14 * (radius * radius * radius)));
    }
}
