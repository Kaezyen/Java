/* Jacob Knott
   H00851354
   CSC 213 W01

   I certify that this is my own work and where appropriate an extension
   of the starter code provided for this assignment.
 */

import java.util.Scanner;   

 public class Payroll{
   public static void main(String[]  args) {

      Scanner userInput = new Scanner( System.in );

      //Constructing Class Objects
      Employee newEmployee =  new Employee();
      PayPeriod newPayPeriod = new PayPeriod();
      PayrollManager newPayrollManager = new PayrollManager();
      TaxPayment newTaxRates = new TaxPayment(.15,.05,.03);

      //Collect Users first name.
      System.out.print("Enter Employee first name: ");
      newEmployee.setFirstName(userInput.next());
  
      //Collect users last name.
      System.out.print("Enter Employee last name: ");
      newEmployee.setLastName(userInput.next());
  
      //Collect users hours worked.
      System.out.print("Enter # of hours worked this week: ");
      newPayPeriod.setNumberOfHours(userInput.nextInt());
  
      //Collect users hourly rate of pay.
      System.out.print("Enter hourly rate of pay: ");
      newEmployee.setHourlyRate(userInput.nextDouble());
      System.out.println();


      //sets Employee pay ID to the Employees ID -- Needs Changed since Employee ID wont change
      newPayPeriod.setEmployeePayID(newEmployee.getEmployeeID());

      //Prints the employees paystub, takes a Object Employee, PayPeriod and TaxPayment
      newPayrollManager.PrintPaystub(newEmployee, newPayPeriod, newTaxRates);

  
   }
 }
