package discussion_111215;

public class Date {
    private int month;
    private int day;
    private int year;
    
    private static final int[] daysInMonth = 
            { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    
    // no argument constructor
    public Date()
    {
        this.month = 1;
        this.day = 1;
        this.year = 1801;
    }
    
    // constructor with parameters: month, day, year
    public Date(int month, int day, int year)
    {
        if ( setYear(year) == false )
        {
            throw new IllegalArgumentException("Invalid year: "+year);
        }
        if ( setMonth(month) == false )
        {
            throw new IllegalArgumentException("Invalid month: "+month);
        }
        if ( setDay(day) == false )
        {
            throw new IllegalArgumentException("Invalid day: "+day);
        }        
    }        
    
    // copy constructor
    public Date(Date original)
    {
        this.month = original.month;
        this.day = original.day;
        this.year = original.year;
    }
    
    // setMonth method
    public boolean setMonth(int month)
    {
        boolean result = false;
        if ( month >= 1 && month <= 12 ) 
        {
            this.month = month;
            result = true;
        }        
        return result;
    }
    
    // setDay method
    public boolean setDay(int day)
    {
        boolean result = false;
        boolean leapYear; // divisible by 4
        
        // borrowed from:
        // http://introcs.cs.princeton.edu/java/12types/LeapYear.java.html
        leapYear = (this.year % 4 == 0);

        // divisible by 4 and not 100
        leapYear = leapYear && (this.year % 100 != 0);

        // divisible by 4 and not 100 unless divisible by 400
        leapYear = leapYear || (this.year % 400 == 0);
        
        int daysInCurrentMonth = this.daysInMonth[this.month-1];
        if ( this.month == 2 && leapYear ) daysInCurrentMonth=29;
        
        if ( day >= 1 && day <= daysInCurrentMonth )
        {
            this.day = day;
            result = true;
        }
        return result;
    }
    
    // setYear method
    public boolean setYear(int year)
    {
        boolean result = false;
        
        if ( year >= 0 && year <= 9999 )
        {
            this.year = year;
            result = true;
        }
        return result;
    }
    
    // getMonth
    public int getMonth()
    {
        return this.month;
    }
    
    // getDay
    public int getDay()
    {
        return this.day;
    }
    
    // getYear
    public int getYear()
    {
        return this.year;
    }
    
    @Override
    public String toString()
    {
        return getMonth() + "/" + getDay() + "/" + getYear();
    }
}
