package discussion_111215;

public class Person {
    private String firstName;
    private String lastName;
    private Date date_of_birth;
    
    public Person(String firstName, String lastName, Date dob)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setDateOfBirth(dob);
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
    
    // get methods
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public void setDateOfBirth(Date dob)
    {
        this.date_of_birth = dob;
    }
    
    public Date getDateOfBirth()
    {
        return this.date_of_birth;
    }
}
