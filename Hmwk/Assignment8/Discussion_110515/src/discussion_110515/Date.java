package discussion_110515;

//Class Date
public class Date {
    private int month;
    private int day;
    private int year;
                                            //Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
    private static final int[] daysInMonth = { 31 ,28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
    //no argument constructor
    public Date()
    {
        this.month=1;
        this.day=1;
        this.year=1801;
    }
    
    //Constructor with parameters: Month, Day, Year
    public Date(int month, int day, int year)
    {
     //Throw for Month
     if(setMonth(month)==false)
     {
        throw new IllegalArgumentException("Invalid Month: "+month);     
     }
        
    //Throw for Day    
    if (setDay(day)==false){
        throw new IllegalArgumentException("Invalid day: "+day);
    }

    //Throw for Year    
    if (setYear(year)==false){
        throw new IllegalArgumentException("Invalid year: "+year);
    }
        
        
    }
    
    //Copy Constructor
    public Date(Date original)
    {
        this.month  = original.month;
        this.day    = original.day;
        this.year   = original.year;
    }
    
    //setMonth Method
    public boolean setMonth(int month)
    {
        boolean result = false;
        if (month >= 1&& month <=12) 
        {
            this.month = month;
            result = true;
        }
    //Return Result
    return result;
    }
    
    //setDay Method
    public boolean setDay(int day)
    {
        boolean result = false;
        boolean leapYear;
        leapYear = (this.year % 4 ==0);
        // divisible by 4
        leapYear = (year % 4 == 0);

        // divisible by 4 and not 100
        leapYear = leapYear && (year % 100 != 0);

        // divisible by 4 and not 100 unless divisible by 400
        leapYear = leapYear || (year % 400 == 0);
        
        int daysInCurrentMonth = this.daysInMonth[this.month-1];
        if(this.month == 2 && leapYear) daysInCurrentMonth=29;
        
        if(day >= 1 && day <= daysInCurrentMonth){
        
            this.day = day;
            result = true;
        }
        return result;
    }
    
    //setYear Method
    public boolean setYear(int year)
    {
        boolean result = false;
        
        if(year >= 0 && year <= 9999)
        {
            this.year = year;
            result = true;
        }
        //Return Result
        return result;
    }
    
    //getMonth
    public int getMonth()
    {
        return this.month;
    }
    
    
    //getDay
    public int getDay()
    {
        return this.day;
    }
    
    //getYear
    public int getYear()
    {
        return this.year;
    }
    
    @Override
    public String toString()
    {
        return getMonth() + "/" + getDay() + "/" + getYear();
    }
    
////////////////////////////////////////////////////////////////////////////     
    //nextDay Method
    public boolean nextDay()
    {
        boolean result = false;
        
        //Dec to Jan
        if((day==31)&&(month==12)){       //Going from December 31 to Jan 1.
        this.year=year+1;                //Increment Year
        this.month=1;                   //Go to Jan in month
        this.day=1;
        }
        
       //Leap Year: Feb 29 to March 1st                 //Leap Year
        else if((year%4==0)&&((month==2)&&(day==29))){   //Go From March 1 to feb 28
           this.day=1;
           this.month=3;
       }

        //Non Leap Year: Feb 28 to March 1st             //Non Leap Year:
        else if((year%4!=0)&&((month==2)&&(day==28))){   //Go from March 1 to Feb 28
           this.day=1;
           this.month=3;
       }
        
        //Months of 31 days -> months           //going from xx/31 to xx+1/1
        else if(((month==1)||(month==3)||(month==5)||(month==6)||(month==8)||(month==10))&&(day==31)){
            this.month=month+1;  // 1       3       5   6       8       10     
            this.day=1;         // Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
        }                      //{ 31 ,28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31}; 

        //Months of 30 days -> months           //going from xx/1 to xx-1/30
        else if(((month==4)||(month==7)||(month==9)||(month==11))&&(day==30)){
            this.month=month+1;  //             4           7       9       11
            this.day=1;        // Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
        }                      //{ 31 ,28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
        
        //No Exceptions: Increment Day
        else{
        this.day=day+1; //Day Increment by 1
        }
        
        return result;
    }

    //previousDay Method
    public boolean previousDay()            //Completed
    {
        boolean result = false;
        
        //Jan to Dec
        if((day==1)&&(month==1)){         //Going from Jan 1 to December 31
        this.year=year-1;                //Decrement Year
        this.month=12;                  //Go to Dec in month
        this.day=31;
        }
        
       //Leap Year: March 1st to Feb 29                  //Leap Year
        else if((year%4==0)&&((month==3)&&(day==1))){   //Go From March 1 to feb 28
           this.day=29;
           this.month=2;
       }

        //Non Leap Year: March 1st to Feb 28             //Non Leap Year:
        else if((year%4!=0)&&((month==3)&&(day==1))){   //Go from March 1 to Feb 28
           this.day=28;
           this.month=2;
       }
        
        //Months -> months of 31 days           //going from xx/1 to xx-1/31
        else if(((month==2)||(month==4)||(month==6)||(month==7)||(month==9)||(month==11))&&(day==1)){
            this.month=month-1;  //    2        4       6   7       9      11
            this.day=31;        // Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
        }                      //{ 31 ,28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31}; 

        //Months -> months of 30 days           //going from xx/1 to xx-1/30
        else if(((month==5)||(month==8)||(month==10)||(month==12))&&(day==1)){
            this.month=month-1;  //                  5           8     10       12
            this.day=30;        // Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
        }                      //{ 31 ,28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
        
        //No Exceptions: Decrement Day
        else{
        this.day=day-1; //Day Decrement by 1
        }
        return result;
    }
    
    //nextMonth Method
    public boolean nextMonth()                                  //Completed
    {
        boolean result = false;
        
        //Non Leap Years, Jan(29-31) to Feb 28                  //For non Leap Years
        if(((month==1)&&((day>=29)||(day<=31)))&&(year%4!=0)){ //Max Feb Date is 28
            this.month = month+1;
            this.day = 28;
        }

        //Leap Years, Jan(30-31) to Feb 28
        else if(((month==1)&&((day>=30)||(day<=31)))&&(year%4==0)){
            this.month = month+1;               //For Leap Years
            this.day = 29;                     //Max Feb Date is 29
        }
        
        //December to Jan
        else if(month==12){    
            this.month = 1;         //When Dec -> Jan
            this.year = year+1;    //Add Year by 1
                                  //Month set to Jan
        }
        
        //Days in 31 to months w/ days of 30
        else if(((month==3)||(month==6)||(month==8)||(month==10))&&(day==31)){    
            this.month = month+1;  //When Month of 31 -> Month of 30
            this.day = 30;        //Set Date to 30
                                 //Month Decrimented by 1
        }                       //         3           6        8      10       
                               // Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
                              //{ 31 ,28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31}; 
        
        //Increment Month
        else 
        {                           //No Exceptions Found!!!
            this.month = month+1;  //Month Incremented by 1            
        }
        
        
        return result;
    }
    
    //previousMonth Method
    public boolean previousMonth()              //Completed
    {
        boolean result = false;
        
        //March to Febuary Leap Year Case - Mar(29-31) to  Feb 28.
        if((year%4 == 0)&&(month == 3)&&((day >= 29)||(day <= 31))){    
            this.month = month-1;        //When March -> Feb and Leap Year
            this.day = 29;              //and date falls between 29 - 31,
                                       //Date WIll be modified to 2/29/**** 
        }
        
        //March to Febuary non Leap Year Case - Mar(29-31) to  Feb 28.
        else if((year%4 != 0)&&(month==3)&&((day>=29)||(day<=31))){    
            this.month = month-1;        //When March -> Feb and Not Leap Year
            this.day = 28;              //and March date falls between 29 - 31,
                                       //Date WIll be modified to 2/28/**** 
        }
        
        //Jan to December
        else if(month==1){    
            this.month = 12;        //When Jan -> Dec
            this.year = year-1;    //Subtract Year by 1
                                  //Month set to Dec
        }
        
        //Days in 31 to months w/ days of 30
        else if(((month==5)||(month==8)||(month==10)||(month==12))&&(day==31)){    
            this.month = month-1;  //When Month of 31 -> Month of 30
            this.day = 30;        //Set Date to 30
                                 //Month Decrimented by 1
        }                       //                5            8      10       12
                               // Jan,Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
                              //{ 31 ,28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31}; 
        
        //Decrement Month
        else 
        {                           //No Exceptions Found!!!
            this.month = month-1;  //Month Decrimented by 1            
        }
        return result;
    }
    
    //nextYear Method                   //Completed
    public boolean nextYear()
    {
        boolean result = false;        //This Method will add a new year to the
                                      //Date. However, when the date is a leap
        if(month == 2 && day == 29)  //Year, it will set the next date to the
        {                           //next date of 3/1/****
            this.year = year+1;    //Else, it will simply increment the year.
            this.month = 3;
            this.day = 1;
            result = true;
        }
        else
        {
            this.year = year+1;
            result = true;
        }
        return result;
    }
    
    //previousYear Method               //Completed
    public boolean previousYear()
    {
        boolean result = false;
        
        //If leap year Feb 29 -> Previous Year, Set Day to Feb 28.
        if(month == 2 && day == 29)  //Year, it will set the next date to the
        {                           //next date of 3/1/****
            this.year = year-1;    //Else, it will simply increment the year.
            this.day = day-1;
            result = true;
        }
        
        //No Exceptions, Decrement Year
        else
        {
            this.year = year-1;
            result = true;
        }
        
        return result;
    }

}//Class Date End
