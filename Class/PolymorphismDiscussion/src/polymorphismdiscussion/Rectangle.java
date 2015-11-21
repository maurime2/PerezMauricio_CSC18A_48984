package polymorphismdiscussion;

public class Rectangle extends Shape {
   // Private member variables for the Rectangle class
   private float length;
   private float width;
   
   // Constructor for rectangle
   public Rectangle(float length, float width) {
      super("Rectangle");
      this.length = length;
      this.width = width;
   }
   
   @Override
   public String toString() {
      return "Rectangle: length=" + this.length + " and width=" + this.width + ", is a subclass of " + super.toString();
   }
   
   @Override
   public double getArea() {
      return this.length * this.width;
   }
   
   @Override
   public double getPerimeter() {
      //return 2 * (this.length + this.width);
       
       return -1;
   }
}