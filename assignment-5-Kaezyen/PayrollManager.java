/* Jacob Knott
   H00851354
   CSC 213 W01

   I certify that this is my own work and where appropriate an extension
   of the starter code provided for this assignment.
 */

import java.text.DecimalFormat;

public class PayrollManager {
    
  //Creating variables for Payroll manager




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
    double grossPay;

    if(newPayPeriod.getNumberOfHours() > 40)
    {
      grossPay = newEmployee.getHourlyRate() * 40;
    }else{
      grossPay = newEmployee.getHourlyRate() * newPayPeriod.getNumberOfHours();
    }
    return grossPay;
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
    DecimalFormat df = new DecimalFormat("#.##"); 
    df.setMinimumFractionDigits(2);

    newPayPeriod.setStartDate("09/06/2023");
    
     //Determine if there were overtime hours worked to display the corresponding overtime output lines.
     if(newPayPeriod.getNumberOfHours() - 40 > 0)
     {
        System.out.println("-------------------------");

        newPayPeriod.setNumberOfHours(newPayPeriod.getNumberOfHours() - overtimeHours);
        System.out.println("Employee Id: " + newEmployee.getEmployeeID());
        System.out.println("Last Name: " + newEmployee.getLastName() + " First Name: " + newEmployee.getFirstName());
        System.out.println("Week of " + newPayPeriod.getStartDate());
        System.out.println("Hours Worked: " + newPayPeriod.getNumberOfHours() + " Hourly Rate: $" + df.format(newEmployee.getHourlyRate()));
        System.out.println("Regular Pay: " + newPayPeriod.getNumberOfHours() + " hours at $" + df.format(newEmployee.getHourlyRate()) 
                                           + "/hr: $" + df.format(CalculateRegularPay(newEmployee, newPayPeriod)));
        System.out.println("Overtime Pay: " + overtimeHours + " hours at $" + df.format((newEmployee.getHourlyRate() * 1.50)) 
                                            + " /hr: $" + df.format((grossPay - CalculateRegularPay(newEmployee, newPayPeriod))));
        System.out.println("Gross Total: $" + df.format(grossPay));

        System.out.println("-------------------------");

        newTaxManager.ComputeTaxPayment(grossPay, newTaxRates);

        netPay = grossPay - newTaxRates.getGrossTaxPaid();
        System.out.println("Net Pay: $" + netPay);



     }else{
        System.out.println("-------------------------");

        System.out.println("Employee Id: " + newEmployee.getEmployeeID());
        System.out.println("Last Name: " + newEmployee.getLastName() + " First Name: " + newEmployee.getFirstName());
        System.out.println("Week of " + newPayPeriod.getStartDate());
        System.out.println("Hours Worked: " + newPayPeriod.getNumberOfHours() + " Hourly Rate: $" + df.format(newEmployee.getHourlyRate()));
        System.out.println("Regular Pay: " + newPayPeriod.getNumberOfHours() + " hours at $" + df.format(newEmployee.getHourlyRate()) 
                                           + "/hr: $" + df.format(CalculateRegularPay(newEmployee, newPayPeriod)));
        System.out.println("Gross Total: $" + df.format(grossPay));

        System.out.println("-------------------------");

        newTaxManager.ComputeTaxPayment(grossPay, newTaxRates);

        netPay = grossPay - newTaxRates.getGrossTaxPaid();
        System.out.println("Net Pay: $" + df.format(netPay));
     }
 }

}