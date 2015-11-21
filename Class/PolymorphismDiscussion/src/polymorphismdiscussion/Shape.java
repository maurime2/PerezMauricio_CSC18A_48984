package polymorphismdiscussion;

// Define parent/base superclass Shape
abstract public class Shape {            //TO make abstract, add abstract before public class
   private String type;
   
   // Constructor
   public Shape (String type) {
      this.type = type;
   }
   
   @Override
   public String toString() {
      return "Shape";
   }
   
   // Since this is a parent/base superclass and we do not have any "real"
   // attributes for any particular shape, we throw an exception if someone
   // tries to use this class's getArea method directly.
   
   public  double getArea(){
       return 0;
   }
      //throw new UnsupportedOperationException("Cannot call getArea method from parent class!");
   
   
   public  double getPerimeter(){
       throw new UnsupportedOperationException("Cannot call getPerimiter");
   }
   
       //throw new UnsupportedOperationException("Cannot Call getPerimiter method from parent class!");
   
   
   
}