package playlist2.day2Homework2Video24_35.Video27Classes.ClassCircle;

import playlist2.day2Homework2Video24_35.Video27Classes.ClassPoint.Point;

public class Circle {
    // The private member variables
    private Point center;  // Declare an instance of the "Point" class
    private double radius;

    // Constructors
    /** Constructs a Circle instance with the default values */
    public Circle() {
        this.center = new Point(); // Construct a Point at (0,0)
        this.radius = 1.0;
    }
    /** Constructs a Circle instance with the center at (xCenter, yCenter) and radius */
    public Circle(int xCenter, int yCenter, double radius) {
        center = new Point(xCenter, yCenter); // Construct a Point at (xCenter,yCenter)
        this.radius = radius;
    }
    /** Constructs a Circle instance with the given Point instance as center and radius */
    public Circle(Point center, double radius) {
        this.center = center;  // The caller had constructed a Point instance
        this.radius = radius;
    }

    // Getters and Setters
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Point getCenter() {
        return this.center;  // return a Point instance
    }
    public void setCenter(Point center) {
        this.center = center;
    }

    public int getCenterX() {
        return center.getX();  // Point's getX()
    }
    public void setCenterX(int x) {
        center.setX(x);  // Point's setX()
    }
    public int getCenterY() {
        return center.getY();  // Point's getY()
    }
    public void setCenterY(int y) {
        center.setY(y);  // Point's setY()
    }
    public int[] getCenterXY() {
        return center.getXY();  // Point's getXY()
    }
    public void setCenterXY(int x, int y) {
        center.setXY(x, y);  // Point's setXY()
    }

    /** Returns a self-descriptive String */
    public String toString() {
        return "Circle[center=" + center + ",radius=" + radius + "]";  // invoke center.toString()
    }

    /** Returns the area of this circle */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /** Returns the circumference of this circle */
    public double getCircumference() {
        return 2.0 * Math.PI * radius;
    }

    /** Returns the distance from the center of this circle to the center of
     the given Circle instance called another */
    public double distance(Circle another) {
        return center.distance(another.center);  // Use distance() of the Point class
    }
}
