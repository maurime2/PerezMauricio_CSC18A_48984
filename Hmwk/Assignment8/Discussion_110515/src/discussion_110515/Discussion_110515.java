//Libraries
package discussion_110515;

//Class Discussion
public class Discussion_110515 {

    //Main Class
    public static void main(String[] args) {
        
        //Date elements
        Date a = new Date();
        Date b = new Date(a);
        
        //Print out elements a, b
        System.out.println("Object a: "+a.toString());
        System.out.println("Object b: "+b.toString());
        
        
        //Set Year of element b
        b.setYear(2016);
        System.out.println("object b (Year should be 2016);"+b.toString());
        
        //Set element d to a date
        Date d = new Date(2,29,2001);
        
        //set and print employee 1
        Employee employee1 = new Employee("John","Jones",d);
        System.out.println(employee1.toString());
        
        //Set and Print Employe 2
        Employee employee2 = new Employee("Sam","Smith",new Date(12,29,2013));  //Anonymous object
        System.out.println(employee2.toString());
        
        
        //Class Tests
        employee2.getHireDate().setYear(2004);
        employee2.getHireDate().setMonth(2);
        employee2.getHireDate().setDay(29);
        System.out.println(employee2.toString());

        
        //Tests
                //NextYear Example
                employee2.getHireDate().nextYear();
                System.out.println(employee2.toString());

                //previousMonth Example
                employee2.getHireDate().previousMonth();
                System.out.println(employee2.toString());

                //previousYear Example
                employee2.getHireDate().previousYear();
                System.out.println(employee2.toString());

                //nextMonth Example
                employee2.getHireDate().nextMonth();
                System.out.println(employee2.toString());

                //previousDay Example
                employee2.getHireDate().previousDay();
                System.out.println(employee2.toString());

                //nextDay Example
                employee2.getHireDate().nextDay();
                System.out.println(employee2.toString());
    }//End Main
    
}//Class Discussion End
