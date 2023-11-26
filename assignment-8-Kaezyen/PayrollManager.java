/* Jacob Knott
   H00851354
   CSC 213 W01

   I certify that this is my own work and where appropriate an extension
   of the starter code provided for this assignment.
 */


//Instead of using printf I opted to use this Java class Decimal Format since it allows for more customization
import java.text.DecimalFormat;
import java.util.*;

public class PayrollManager {

  private int employeeID;

  private ArrayList<Employee> employees = new ArrayList<>(50);

  //Constructors for Payroll Manager
  public void PayRollManger()
  {

  }

  public int getEmployeesSize(){
      return employees.size();
  }

  public Employee getEmployee(int i){
     return employees.get(i);
  }

  /*Calcualtes regular pay for a Employee, if they work more than 40 hours we only multiply their hourly rate with
   40 and will calculate overtime with a different method. Otherwise it will just muliply the emmployees hours 
   worked with their wage.This returns a double for the employees gross pay
  */
  public double CalculateRegularPay(Employee newEmployee, PayPeriod newPayPeriod)
  {
    double grossRegularPay;

    if(newPayPeriod.getNumberOfHours() > 40)
    {
      grossRegularPay = newEmployee.getHourlyRate() * 40;
    }else{
      grossRegularPay = newEmployee.getHourlyRate() * newPayPeriod.getNumberOfHours();
    }
    return grossRegularPay;
  }

  /*Calculates overtime pay by taking the hours worked and subtracting 40 to only get the overtime hours worked.
    we then mulitply this by the hourlyrate stored within employee * 1.5 to return a double of
    the employees gross overtime pay
   */
  public double CalculateOvertimePay(Employee newEmployee, PayPeriod newPayPeriod)
  {
    double grossOvertimePay;
    double overtimeHoursWorked;

    overtimeHoursWorked = newPayPeriod.getNumberOfHours() - 40;

    grossOvertimePay = overtimeHoursWorked * (newEmployee.getHourlyRate() * 1.50);

    return grossOvertimePay;
  }


  //Uses both methods above to add them together to get the overall gross pay which includes both the employees
  //regular time pay and their overtime pay
  public double CalculateGrossPay(Employee newEmployee, PayPeriod newPayPeriod)
  {
    double regularPay = CalculateRegularPay(newEmployee, newPayPeriod);
    double overtimePay = CalculateOvertimePay(newEmployee, newPayPeriod);
    double grossPay;

    if(newPayPeriod.getNumberOfHours() > 40)
    {
      grossPay = regularPay + overtimePay;
    }else{
      grossPay = regularPay;
    }
    return grossPay;
  }

  //Generates Employee IDs +1 more than the ID in the previous run through.
  public int GenerateEmployeeID()
  {
    employeeID++;
    return employeeID;
  }

  //Adds a newEmployee object into the Employee List array
  public void AddEmployee(Employee newEmployee)
  {
    employees.add(newEmployee);
  }


  //Prints out a list of the employees ID, First name and last name.
  public void PrintEmployees()
  {
    //Loop to run through the entire employee list
    for (int i = 0; i < employees.size(); i++)
    {
      //Prints out the current index of the employee list Array
     System.out.println(employees.get(i));
    }
  }

  //Prints everything out from above to display the employees paystub.
  public void PrintPaystub()
  {

    //Creates a new Decimal Format objects and uses pattern: $#.## to set a $ sign in front of the decimal and
    //set the decimal to only two spaces
    DecimalFormat df = new DecimalFormat("$#.##"); 
    df.setMinimumFractionDigits(2);


    for(int i = 0; i < employees.size(); i++)
    {
      Employee newEmployee = employees.get(i);
      PayPeriod newPayPeriod = newEmployee.getPayPeriodList().get(0);


      Double grossPay = CalculateGrossPay(newEmployee, newPayPeriod);
      int overtimeHours = (newPayPeriod.getNumberOfHours() - 40);
      System.out.println("-------------------------");

      System.out.println("Employee Id: " + newEmployee.getEmployeeID());
      System.out.println("Last Name: " + newEmployee.getLastName() + " First Name: " + newEmployee.getFirstName());
      System.out.println("Week of: " + newPayPeriod.getStartDate());
      System.out.println("Hours Worked: " + newPayPeriod.getNumberOfHours() + " Hourly Rate: " + df.format(newEmployee.getHourlyRate()));


      if(newPayPeriod.getNumberOfHours() - 40 > 0)
      {
        newPayPeriod.setNumberOfHours(newPayPeriod.getNumberOfHours() - overtimeHours);
        System.out.println("Overtime Pay: " + overtimeHours + " hours at " + df.format((newEmployee.getHourlyRate() * 1.50)) 
                                            + " /hr: " + df.format((grossPay - CalculateRegularPay(newEmployee, newPayPeriod))));
        System.out.println("Gross Total: " + df.format(grossPay));
      }
      else
      {
        System.out.println("Gross Total: " + df.format(grossPay));
      }

      System.out.println("-------------------------");

     }

}
    }