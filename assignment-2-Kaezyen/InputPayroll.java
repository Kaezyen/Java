/* Jacob Knott
   H00851354
   CSC 213 W01

   I certify that this is my own work and where appropriate an extension
   of the starter code provided for this assignment.
 **/


import java.util.Scanner;

public class InputPayroll {
    public static void main(String[] args) {

        //Scanner used from the Java Utilities package to allow user input to be read.

        Scanner userInput = new Scanner( System.in );

        //Declaring variables for user to be able to input values into

        int employeeID;
        String firstName;
        String lastName;
        int hoursWorked;
        double wage;
        double grossPay;

        //Collecting the Users information

        System.out.print("Enter Employee Id: ");
        employeeID = userInput.nextInt();
        System.out.print("Enter Employee first name: ");
        firstName = userInput.next();
        System.out.print("Enter Employee last name: ");
        lastName = userInput.next();
        System.out.print("Enter # of hours worked this week: ");
        hoursWorked = userInput.nextInt();
        System.out.print("Enter hourly rate of pay: ");
        wage = userInput.nextDouble();

        //Calculating the Gross Total for the employee.

        grossPay = wage * hoursWorked;

        /*
        Print statements showing Employee ID, Last name and First name,
        hours worked and wage, as well as their gross pay.
        */
        System.out.println("Employee Id : " + employeeID);
        System.out.println("Last Name: " + lastName + " First Name: " + firstName);
        System.out.println("Hours Worked: " + hoursWorked + " Hourly Rate: $" + String.format("%.2f" ,wage ));
        System.out.println("Gross Total: $" + String.format("%.2f" ,grossPay));

    }
}
