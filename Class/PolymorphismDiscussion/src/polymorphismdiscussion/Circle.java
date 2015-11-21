package polymorphismdiscussion;

public class Circle extends Shape {
    // Private member variable for the Circle class
      private float radius;
   
   // Constructor
   public Circle(float radius) {
      super("Circle");                  // Parent of the Class
      this.radius = radius;
   }
   
   @Override
   public String toString() {
      return "Circle: radius=" + this.radius + ", is a subclass of " + super.toString();
   }
   
   @Override
   public double getArea() {
      return this.radius * this.radius * Math.PI;
   }
   
   @Override
   public double getPerimeter() {
      return 2 * Math.PI * this.radius;
   }
}
