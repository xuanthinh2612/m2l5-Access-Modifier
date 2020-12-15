public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle() {

    }

    Circle(double radius) {
        this.radius = radius;
    }

     double getRadius() {
        return radius;
    }

     double getArea() {
        return 2 * Math.PI * radius * radius;
    }

}
