//Libraries
package discussion_110515;

//Class Discussion
public class Discussion_110515 {

    //Main Class
    public static void main(String[] args) {
        Date a = new Date();
        Date b = new Date(a);
        
        System.out.println("Object a: "+a.toString());
        System.out.println("Object b: "+b.toString());
        
        b.setYear(2016);
        System.out.println("object b (Year should be 2016);"+b.toString());
        
        
        Date d = new Date(2,29,2001);
        
        Employee employee1 = new Employee("John","Jones",d);
        System.out.println(employee1.toString());
        
        Employee employee2 = new Employee("Sam","Smith",new Date(12,29,2013));  //Anonymous object
        System.out.println(employee2.toString());
        

        employee2.getHireDate().setYear(2000);
        employee2.getHireDate().setMonth(2);
        employee2.getHireDate().setDay(29);
        System.out.println(employee2.toString());
                
    }//End Main
    
}//Class Discussion End
