public class Circle {
    private double pi;
    private double radius;

    public Circle(double pi, double radius) {
        this.pi = pi;
        this.radius = radius;
    }

    public static void area(Circle circle) {
        double a =  circle.pi * (circle.radius * circle.radius);
        System.out.println("Аянты: " + a);
    }
    public static void circumference(Circle circle){
        double b = circle.pi * circle.radius;
        System.out.println("Тегереги: " + b);
    }
}
