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
        String repeat = "N";

        PayrollManager newPayrollManager = new PayrollManager();
        
        do
        {
            String repeatChoice;
            String firstName;
            String lastName;
            double wage;
            int hoursWorked;


            //Collect Users first name.
            System.out.print("Enter Employee first name: ");
            firstName = userInput.next();
  
            //Collect users last name.
            System.out.print("Enter Employee last name: ");
            lastName = userInput.next();

            //Collect users hourly rate of pay.
            System.out.print("Enter hourly rate of pay: ");
            wage = userInput.nextDouble();
  
            //Collect users hours worked.
            System.out.print("Enter # of hours worked this week: ");
            hoursWorked = userInput.nextInt();
            userInput.nextLine();

            PayPeriod newPayPeriod = new PayPeriod(hoursWorked);
            Employee newEmployee = new Employee(firstName, lastName, wage, newPayrollManager, newPayPeriod);
            newPayrollManager.AddEmployee(newEmployee);
            newPayPeriod.setNumberOfHours(hoursWorked);

            //sets Employee pay ID to the Employees ID -- Needs Changed since Employee ID wont change per period
            newPayPeriod.setEmployeePayID(newEmployee.getEmployeeID());

            System.out.println("Would you like to enter another employee? (Y/N)");
            //temp string for user Input to repeat the program
            repeatChoice = userInput.next();
            //Grabs the first character of the temp string
            repeat = repeatChoice.substring(0, 1);

            //User can type Y, Yes, y, or yes to continue. Otherwise exit.
        }while(repeat.equalsIgnoreCase("Y"));
        
        newPayrollManager.PrintPaystub();
        
        System.out.println("-------------------------");

        System.out.println("Employee List");
        System.out.println("ID Name");
        newPayrollManager.PrintEmployees();
   }
 }