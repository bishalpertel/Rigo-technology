package RigoTechnology;

public class Developer
{
    private String platform; //variable platform declared as string
    private String interviewerName; //variable interviewerName declared aa String.
    private String developerName; //variable developerName declared String.
    private int workingHour; //variable workingHour declared integer.

    // costructor of class Developer having three parameters with their data types
    /*
     * in a method this.variable = variable
     * java identifies this.variable as instance variable of the class
     * variable at the right of equal to refers to the value passed by parameter
     */
    public Developer(String platform, String interviewerName, int workingHour)
    {
        this.platform=platform; //this.platform is varibale of Developer class and platform at the right is the value of the paramter passed.
        this.interviewerName=interviewerName; //same as above
        developerName=""; //developerName is initialized with double quotes.
        this.workingHour=workingHour; // same as above
    }


    //method to get platform.
    public String getPlatform()
    {
        return platform; // returns value  of platform wherever the method is called.
    }


    //method to get interviewer name.
    public String getInterviewerName()
    {
        return interviewerName;//returns value of interviewerName where the method is called.
    }


    //setting and getting developer name.
    public void setDeveloperName(String developerName)
    {
        this.developerName=developerName;// saving the instance value passed as parameter from developerName method

    }

    public String getDeveloperName()
    {
        return developerName;
    }


    //method to get working hour
    public int getWorkingHour()
    {
        return workingHour;
    }

    //method to display all the attributes of Developer class
    public void display()
    {
        System.out.println("Platform of the developer: "+ getPlatform());
        System.out.println("Interviewer Name  : "+ getInterviewerName());
        if(!developerName.equals(""))        {
            System.out.println("Name of the developer: "+ getDeveloperName());
        }
        System.out.println("Working Hours : "+getWorkingHour());
    }
}