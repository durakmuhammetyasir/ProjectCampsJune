package playlist2.day2Homework2Video24_35.Video27Classes.ClassCircle;

import playlist2.day2Homework2Video24_35.Video27Classes.ClassPoint.Point;

public class TestCircle {
    public static void main(String[] args) {
        // Test Constructors and toString()
        Circle c1 = new Circle();
        System.out.println(c1);  // Circle's toString()
        Circle c2 = new Circle(1, 2, 3.3);
        System.out.println(c2);  // Circle's toString()
        Circle c3 = new Circle(new Point(4, 5), 6.6);   // an anonymous Point instance
        System.out.println(c3);  // Circle's toString()

        // Test Setters and Getters
        c1.setCenter(new Point(11, 12));
        c1.setRadius(13.3);
        System.out.println(c1);  // Circle's toString()
        System.out.println("center is: " + c1.getCenter());  // Point's toString()
        System.out.println("radius is: " + c1.getRadius());

        c1.setCenterX(21);
        c1.setCenterY(22);
        System.out.println(c1);  // Circle's toString()
        System.out.println("center's x is: " + c1.getCenterX());
        System.out.println("center's y is: " + c1.getCenterY());
        c1.setCenterXY(31, 32);
        System.out.println(c1);  // Circle's toString()
        System.out.println("center's x is: " + c1.getCenterXY()[0]);
        System.out.println("center's y is: " + c1.getCenterXY()[1]);

        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());

        // Test distance()
        System.out.printf("distance is: %.2f%n", c1.distance(c2));
        System.out.printf("distance is: %.2f%n", c2.distance(c1));
    }
}
