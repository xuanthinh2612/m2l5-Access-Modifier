public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1's Radius is: "+circle1.getRadius()+"\nArea is: "+circle1.getArea());
        Circle circle2 = new Circle(10);
        System.out.println("Circle 2's Radius is: "+circle2.getRadius()+"\nArea is: "+circle2.getArea());

    }
}

