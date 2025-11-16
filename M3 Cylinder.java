class Cylinder {
    private double radius;
    private double height;

    // Constructor
    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Setter for height
    public void setHeight(double height) {
        this.height = height;
    }

    // Method to calculate surface area
    public double getSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Method to calculate volume
    public double getVolume() {
        return Math.PI * radius * radius * height;
    }
}

public class CylinderConst {
    public static void main(String[] args) {

        // Creating object using constructor
        Cylinder c = new Cylinder(5, 10);

        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());

        System.out.println("Surface Area: " + c.getSurfaceArea());
        System.out.println("Volume: " + c.getVolume());
    }
}
