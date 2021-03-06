package edu.realemj.Exercises_12;

import edu.realemj.Exercises_10.*;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {        
        this.radius = radius;
    }

    public Circle(double radius, boolean filled, Point2D center) {
        super(filled, center);
        this.radius = radius;
        //setFilled(filled);
        //setCenter(center);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = Math.max(radius, 0);
    }    

    @Override
    public String toString() {
        String s = super.toString();
        s += " which is a circle with radius " + radius;
        return s;
    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Circle c) {
            final double ERROR = 1e-15;
            return (Math.abs(radius - c.radius) < ERROR &&
                    super.equals(other));
        }
        else { 
            return false;
        }
    }
}
