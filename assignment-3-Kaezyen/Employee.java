/* Jacob Knott
   H00851354
   CSC 213 W01

   I certify that this is my own work and where appropriate an extension
   of the starter code provided for this assignment.
 */

public class Employee
{

    /**
     Creating Employee Variables to store values in as a user inputs employee data.
     There are some useless variables in here that I left for future use and improvements.
     **/
    private String firstName;
    private String lastName;
    private int employeeID;
    private double wage;
    private double grossPay;
    private int overtimeHours;
    private int normalHours;
    private double grossOvertimePay;

    //Constructors for making a new Employee, can either make an Employee with an ID of 0 or set the Employee ID
    public Employee()
    {
        employeeID = 0;
    }
    //Creates an Employee and takes a double and sets it to the employees wage.
    public Employee(double employeeWage){
        wage = employeeWage;
    }
    //End of Constructors

    //Methods for calculating Normal Pay and Overtime pay.
    public void calculateNormalPay()
    {
        grossPay = wage * normalHours;
    }

    public void calculateOvertimePay()
    {
        grossOvertimePay = ( wage * 1.5 ) * overtimeHours;
    }

    //Method for displaying gross pay accounting for overtime being worked or not,

    public void displayGrossPay()
    {
        //Determine if there were overtime hours worked to display the corresponding overtime output lines.
        if(overtimeHours > 0)
        {
            System.out.println("Employee Id: " + employeeID);
            System.out.println("Last Name: " + lastName + " First Name: " + firstName);
            System.out.println("Hours Worked: " + normalHours + " Hourly Rate: $" + wage);
            System.out.println("Regular Pay: " + normalHours + " hours at $" + wage + "/hr: $" + grossPay);
            System.out.println("Overtime Pay: " + overtimeHours + " hours at $" + (wage * 1.5) + " /hr: $" + grossOvertimePay);
            System.out.println("Gross Total: $" + (grossPay + grossOvertimePay));
        }else{
            System.out.println("Employee Id: " + employeeID);
            System.out.println("Last Name: " + lastName + " First Name: " + firstName);
            System.out.println("Hours Worked: " + normalHours + " Hourly Rate: $" + wage);
            System.out.println("Regular Pay: $" + normalHours + " hours at $" + wage + "/hr: $" + grossPay);
            System.out.println("Gross Total: $" + grossPay);
        }
    }

    //End of Methods

    //Mutators to be able to change employees.

    //Sets the Employees wage
    public void setWage(double newWage) {
        wage = newWage;
    }

    //Sets the Employees last name.
    public void setLastName(String newLast) {
        lastName = newLast;
    }

    //Sets the Employees first name.
    public void setFirstName(String newFirst) {
        firstName = newFirst;
    }

    //Sets the Employees ID
    public void setEmployeeID(int newID) {
        employeeID = newID;
    }

    //Sets the employees hours worked, and if detected -  overtime hours worked as well.
    public void setHoursWorked(int newHoursWorked) {

        int tempHours = newHoursWorked - 40;

        if (tempHours > 0) {
            overtimeHours = tempHours;
            normalHours = (newHoursWorked - overtimeHours);
        }
        else{
            normalHours = newHoursWorked;
        }
    }

    //End of Mutators

    //Creating accessors to be able to access the variables within the program.

    //Access the Employees hours worked without overtime.
    public int getNormalHours(){
        return normalHours;
    }

    //Access the employees hours worked with overtime.
    public int getOvertimeHours(){
        return overtimeHours;
    }

}


