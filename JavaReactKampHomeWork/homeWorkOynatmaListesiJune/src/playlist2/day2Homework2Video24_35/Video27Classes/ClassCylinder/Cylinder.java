package playlist2.day2Homework2Video24_35.Video27Classes.ClassCylinder;

public class Cylinder extends CircleForCylinder {
    // private instance variable
    private double height;

    // Constructors
    public Cylinder() {
        super();  // invoke superclass' constructor Circle()
        this.height = 1.0;
        System.out.println("Constructed a Cylinder with Cylinder()");  // for debugging
    }

    public Cylinder(double height) {
        super();  // invoke superclass' constructor Circle()
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height)");  // for debugging
    }

    public Cylinder(double height, double radius) {
        super(radius);  // invoke superclass' constructor Circle(radius)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius)");  // for debugging
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);  // invoke superclass' constructor Circle(radius, color)
        this.height = height;
        System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)");  // for debugging
    }

    // Getter and Setter
    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the volume of this Cylinder
     */
    public double getVolume() {
        return getArea() * height;   // Use Circle's getArea()
    }

    /**
     * Returns a self-descriptive String
     */
    public String toString() {
        return "This is a Cylinder";  // to be refined later
    }
}
