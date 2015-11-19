package discussion_110515;

public class Employee {
    private String firstName;
    private String lastName;
    private Date hireDate;
    
    // Constructor
    public Employee(String firstName, String lastName, Date hireDate)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setHireDate(hireDate);
    }
    
    // set methods
    public void setFirstName(String firstName)
    {
        if ( firstName.length() > 0 )
        {
            this.firstName = firstName;
        }
        else
            throw new IllegalArgumentException("First name cannot be blank.");
    }
    
    public void setLastName(String lastName)
    {
        if ( lastName.length() > 0 )
        {
            this.lastName = lastName;
        }
        else
            throw new IllegalArgumentException("Last name cannot be blank.");
    }
    
    public void setHireDate(Date hireDate)
    {
        this.hireDate = hireDate;
    }
    
    // get methods
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public Date getHireDate()
    {
        return this.hireDate;
    }
    
    @Override
    public String toString()
    {
        return "First name: " + this.firstName + ", Last name: " + 
                this.lastName + ", hire date: " + this.hireDate.toString();
    }
}

