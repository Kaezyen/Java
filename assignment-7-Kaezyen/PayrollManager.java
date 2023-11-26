/* Jacob Knott
   H00851354
   CSC 213 W01

   I certify that this is my own work and where appropriate an extension
   of the starter code provided for this assignment.
 */


//Instead of using printf I opted to use this Java class Decimal Format since it allows for more customization
import java.text.DecimalFormat;

public class PayrollManager {

  //Constructors for Payroll Manager
  public void PayRollManger()
  {
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

  //Prints everything out from above to display the employees paystub.
  void PrintPaystub(Employee newEmployee, PayPeriod newPayPeriod, TaxPayment newTaxRates)
  {
    TaxManager newTaxManager = new TaxManager();
    double grossPay = CalculateGrossPay(newEmployee, newPayPeriod);
    int overtimeHours = (newPayPeriod.getNumberOfHours() - 40);
    double netPay;

    //Creates a new Decimal Format objects and uses pattern: $#.## to set a $ sign in front of the decimal and
    //set the decimal to only two spaces
    DecimalFormat df = new DecimalFormat("$#.##"); 
    df.setMinimumFractionDigits(2);

    newPayPeriod.setStartDate("09/06/2023");
    
     //Determine if there were overtime hours worked to display the corresponding overtime output lines.
     if(newPayPeriod.getNumberOfHours() - 40 > 0)
     {
        System.out.println("-------------------------");

        newPayPeriod.setNumberOfHours(newPayPeriod.getNumberOfHours() - overtimeHours);
        System.out.println("Employee Id: " + newEmployee.getEmployeeID());
        System.out.println("Last Name: " + newEmployee.getLastName() + " First Name: " + newEmployee.getFirstName() 
                                                                     + " Middle Initial: " + newEmployee.getMiddleInitial());
        System.out.println("Address: " + newEmployee.getAddress() + ", " + newEmployee.getCity() + ", " 
                                       + newEmployee.getState() + " " + newEmployee.getZip());
        System.out.println("Phone: " + newEmployee.getPhone() + " Email: " + newEmployee.getEmail());
        System.out.println("Hours Worked: " + newPayPeriod.getNumberOfHours() + " Hourly Rate: " + df.format(newEmployee.getHourlyRate()));
        System.out.println("Gross Total: " + df.format(grossPay));

        System.out.println("-------------------------");

        newTaxManager.ComputeTaxPayment(grossPay, newTaxRates);
        netPay = grossPay - newTaxRates.getGrossTaxPaid();
        System.out.println("Net Paycheck: " + df.format(netPay));



     }else{
        System.out.println("-------------------------");

        System.out.println("Employee Id: " + newEmployee.getEmployeeID());
        System.out.println("Last Name: " + newEmployee.getLastName() + " First Name: " + newEmployee.getFirstName()
                                                                     + " Middle Initial: " + newEmployee.getMiddleInitial());
        System.out.println("Hours Worked: " + newPayPeriod.getNumberOfHours() + " Hourly Rate: " + df.format(newEmployee.getHourlyRate()));
        System.out.println("Gross Total: " + df.format(grossPay));

        System.out.println("-------------------------");

        newTaxManager.ComputeTaxPayment(grossPay, newTaxRates);
        netPay = grossPay - newTaxRates.getGrossTaxPaid();
        System.out.println("Net Pay: " + df.format(netPay));

     }
 }

}
