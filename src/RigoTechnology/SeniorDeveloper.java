package RigoTechnology;

public class SeniorDeveloper extends Developer
{
    private double salary; //variable salary is declared as double
    private String joiningDate;//variable joiningDate declared as string
    private String staffRoomNumber;//variable staffRoomNumber declared as an string
    private int contractPeriod;//variable contractPeriod declared as integer
    private double advanceSalary;//variable advanceSalary declared as double
    private boolean appointed;//variable appointed declared as boolean value.
    private boolean terminated;//variable terminated declared boolean value.

    public SeniorDeveloper(String platform, String interviewerName, int workingHour, double salary, int contractPeriod )
    {
        super(platform,interviewerName,workingHour);
        this.salary=salary;
        this.contractPeriod=contractPeriod;
        joiningDate="";
        staffRoomNumber="";
        advanceSalary=0.0;
        appointed=false;
        terminated=false;
    }

    //methods for getting salary.
    public double getSalary()
    {
        return salary;
    }

    //methods for getting joining date.
    public String getJoiningDate()
    {
        return joiningDate;
    }

    //methods for getting staff room number.
    public String getStaffRoomNumber()
    {
        return staffRoomNumber;
    }

    //methods for getting contact period.
    public int getContractPeriod()
    {
        return contractPeriod;
    }

    //methods for getting advance salary.
    public double getAdvanceSalary()
    {
        return advanceSalary;
    }

    //methods for getting appointed.
    public boolean getAppointed()
    {
        return appointed;
    }

    //methods for getting terminated.
    public boolean getTerminated()
    {
        return terminated;
    }

    //method to set new salary
    public void newSalary(double newSalary)
    {
        salary=newSalary;
    }

    //method to set the contract period
    public void newContractPeriod(int newContractPeriod)
    {
        contractPeriod=newContractPeriod;
    }

    //method to hire developer for a particular platform
    public void hireDeveloper(String developerName, String joiningDate,double advanceSalary,String staffRoomNumber)
    {
        if (appointed==true)
        {
            System.out.println("The following developeris already appointed.");
            System.out.println("Developer Name              : "+getDeveloperName());
            System.out.println("Staff room number           : "+getStaffRoomNumber());
        }
        else
        {
            super.setDeveloperName(developerName);//calling method from super class and passing the parameter.
            this.joiningDate=joiningDate;
            this.staffRoomNumber=staffRoomNumber;
            this.advanceSalary=advanceSalary;
            appointed=true;
            terminated=false;
        }
    }

    //method to check contract termination
    public void contractTermination()
    {
        if (terminated=true)
        {
            System.out.println("You are terminated.");
        }
        else
        {
            super.setDeveloperName("");
            advanceSalary=0.0;
            appointed=false;
            terminated=true;
        }
    }

    //method to print platform, interviewer name and salary
    public void dispay()
    {
        System.out.println("Platform                    : "+ getPlatform());
        System.out.println("Interviewer name            : "+ getInterviewerName());
        System.out.println("Developer salary            : "+ getSalary());
    }

    //method to display details of the developer.
    public void displayDetails()
    {
        super.display();
        if (appointed==true)
        {
            System.out.println("Termination status          : "+ getTerminated());
            System.out.println("Joining date                : "+ getJoiningDate());
            System.out.println("Advance salary              : "+ getAdvanceSalary());
            System.out.println("Developer name              : "+ getDeveloperName());
        }
    }
}
