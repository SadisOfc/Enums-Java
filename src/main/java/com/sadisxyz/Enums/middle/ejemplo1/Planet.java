package main.java.com.sadisxyz.Enums.middle.ejemplo1;

public enum Planet{
    MERCURY(3.303e23,2439.7e3), MARS(6.4171e23,3389.5e3), VENUS(4.869e24,6051.8e3), EARTH(5.972e24,6378e3), NEPTUNE(1.0243e26,24622e3), URANUS(8.6832e25,25363e3), SATURN(5.6846e26,58232e3),  JUPITER(1.899e27,69911e3);
    private final double mass;
    private final double radius;
    private final double G = 6.67300E-11;
    Planet(double mass, double radius){
        this.mass = mass;
        this.radius = radius;
    }
    public double getMass(){
        return mass;
    }
    public double getRadius(){
        return radius;
    }
    public double surfaceGravity(){
        return G*mass/(radius*radius);
    }
    @Override
    public String toString(){
        return "Planeta: " + name() + " - Masa: " + mass + " - Radio: " + radius;
    }
}
