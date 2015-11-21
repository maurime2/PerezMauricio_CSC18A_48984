package polymorphismdiscussion;

public class Triangle extends Shape {
   // Private member variables for the Triangle class
   private float base;
   private float height;
   
   // Constructor
   public Triangle(float base, float height) {
      super("Triangle");
      this.base = base;
      this.height = height;
   }
   
   @Override
   public String toString() {
      return "Triangle: base=" + this.base + " and height=" + this.height + ", is a subclass of " + super.toString();
   }
   
   @Override
   public double getArea() {
      return 0.5 * this.base * this.height;
   }
   
   @Override
   public double getPerimeter(){
       throw new UnsupportedOperationException("No implementation for finding perimeter of triangle!");
   }
   
}