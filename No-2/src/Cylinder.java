public class Cylinder extends Shape {
    private double height, radius;

    public Cylinder( double radius, double height) {
        super("Cylinder");
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return super.toString() + " of height " + height + " and radius " + radius;
    }
}
