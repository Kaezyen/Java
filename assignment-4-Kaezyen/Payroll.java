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

      //Collect Users first name.
      System.out.print("Enter Employee first name: ");
      newEmployee.setFirstName(userInput.next());

      //Collect users middle initial. Scans for the first character in the input and sets Middle initial to it.
      System.out.print("Enter Employee middle initial: ");
      newEmployee.setMiddleInital(userInput.next().charAt(0));
  
      //Collect users last name.
      System.out.print("Enter Employee last name: ");
      newEmployee.setLastName(userInput.next());

      //Collect users phone number.
      System.out.print("Enter Employee phone number: ");
      newEmployee.setPhone(userInput.next());
      
      //Collect users email address.
      System.out.print("Enter Employee email address: ");
      newEmployee.setEmail(userInput.next());
      userInput.nextLine();

      //Collect users address.
      System.out.print("Enter Employee address: ");
      newEmployee.setAddress(userInput.nextLine());
  
      //Collect users hours worked.
      System.out.print("Enter # of hours worked this week: ");
      newPayPeriod.setNumberOfHours(userInput.nextInt());
  
      //Collect users hourly rate of pay.
      System.out.print("Enter hourly rate of pay: ");
      newEmployee.setHourlyRate(userInput.nextDouble());
      System.out.println();

      newPayPeriod.setEmployeePayID(newEmployee.getEmployeeID());
      newPayrollManager.PrintPaystub(newEmployee, newPayPeriod);
  
   }
 }