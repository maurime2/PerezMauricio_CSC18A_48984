package discussion_111215;

public class Employee extends Person {
    private static int count = 0;
    private float salary;
    private Date hireDate;
    
    // Constructor
    public Employee(String firstName, String lastName, Date hireDate)
    {        
        super(firstName,lastName,new Date(1,1,2000));
        count=count+1;
        setHireDate(hireDate);        
        salary=0;
    }
    
    public Employee(String firstName, String lastName, Date dob, Date hireDate, float salary)
    {
        super(firstName,lastName,new Date(1,1,2000));
        count=count+1;
        setHireDate(hireDate);        
        setSalary(salary);
    }
    
    public int getCount()
    {
        return this.count;
    }
    
    public void setSalary(float salary)
    {
        if ( salary >= 0 )
        {
            this.salary = salary;
        }
        else
            throw new IllegalArgumentException("Salary cannot be a negative value!");
    }
    
    public float getSalary()
    {
        return this.salary;
    }
    
    public void setHireDate(Date hireDate)
    {
        this.hireDate = hireDate;
    }
    
    public Date getHireDate()
    {
        return this.hireDate;
    }
    
    @Override
    public String toString()
    {
        return "First name: " + this.getFirstName() + ", Last name: " + 
                                this.getLastName() + ", date of birth: " + 
                                this.getDateOfBirth().toString() + ", hire date: " + 
                                this.getHireDate().toString() + ", salary: " +
                                this.salary;
    }
}
