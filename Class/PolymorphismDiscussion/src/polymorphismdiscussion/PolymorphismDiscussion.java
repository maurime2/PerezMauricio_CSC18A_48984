
package polymorphismdiscussion;

public class PolymorphismDiscussion {

    public static void main(String[] args) {
        Rectangle a_rectangle = new Rectangle(3, 5);
        Triangle a_triangle = new Triangle(10, 8);
        Circle a_circle = new Circle(5);
        
        //Only works when Shape class is not abstract
        //Shape a_shape = new Shape("Shape");
        //System.out.println(a_shape);
        //System.out.println( "a_shape has an area of " + a_shape.getArea() );
        
        System.out.println( a_rectangle );
        System.out.println( "a_rectangle has an area of " + a_rectangle.getArea() );
        System.out.println("a_rectangle has the perimeter of "+ a_rectangle.getPerimeter());
        System.out.println();
        
        System.out.println( a_triangle );
        System.out.println( "a_triangle has an area of " + a_triangle.getArea() );        
        //System.out.println( "a_triangle has a perimeter of " + a_triangle.getPerimeter() );        
        System.out.println();
        
        System.out.println( a_circle );
        System.out.println( "a_circle has an area of " + a_circle.getArea() );        
        System.out.println("a_circle has the perimeter (circumference) of "+ a_circle.getPerimeter());
        System.out.println();
        
        
    }    
}