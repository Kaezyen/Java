/* Jacob Knott
   H00851354
   CSC 213 W01

   I certify that this is my own work and where appropriate an extension
   of the starter code provided for this assignment.
 */


import java.util.Scanner;

public class OvertimeCalculation {
    public static void main(String[] args) {

        //Scanner used from the Java Utilities package to allow user input to be read.

        Scanner userInput = new Scanner( System.in );

        //Create a newEmployee object to insert data into.
        Employee newEmployee = new Employee();


        //Collect users EmployeeID
        System.out.print("Enter Employee Id: ");
        newEmployee.setEmployeeID(userInput.nextInt());

        //Collect Users first name.
        System.out.print("Enter Employee first name: ");
        newEmployee.setFirstName(userInput.next());

        //Collect users last name.
        System.out.print("Enter Employee last name: ");
        newEmployee.setLastName(userInput.next());

        //Collect users hours worked.
        System.out.print("Enter # of hours worked this week: ");
        newEmployee.setHoursWorked(userInput.nextInt());

        //Collect users hourly rate of pay.
        System.out.print("Enter hourly rate of pay: ");
        newEmployee.setWage(userInput.nextDouble());

        /*
          Calculating the Gross Total for the employee. If else statement determines if overtime hours
          were worked to determine output of the overtime lines.
        */

        if (newEmployee.getNormalHours() + newEmployee.getOvertimeHours() <= 40)
        {
            newEmployee.calculateNormalPay();
            newEmployee.displayGrossPay();
        }
        else {
            newEmployee.calculateNormalPay();
            newEmployee.calculateOvertimePay();
            newEmployee.displayGrossPay();
        }

        /*
        Print statements showing Employee ID, Last name and First name,
        hours worked and wage, as well as their gross pay.
        */

    }
}
