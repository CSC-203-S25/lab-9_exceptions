import java.util.Random;

public class Circle {
  public static final double PI = 3.14159;
  private double radius;

  public Circle() {
    Random rand = new Random();
    this.radius = rand.nextDouble() * 10;
  }

  public Circle(double radius) {
    this.radius = radius;
  }

  public double radius() {
    return this.radius;
  }

  public double diameter() {
    return this.radius * 2;
  }

  public double circumference() {
    return 2 * PI * this.radius;
  }

  public double area() {
    return PI * this.radius * this.radius;
  }

  public String toString() {
    return "Radius: " + this.radius;
  }
}
