/*
 * Jacob Knott H00851354 CSC 213 W01
 * 
 * I certify that this is my own work and where appropriate an extension of the starter code
 * provided for this assignment.
 */

import java.util.Scanner;

public class Payroll {
  public static void main(String[] args) {

    // Create a new scanner object for user input and a string to determine if the
    // program repeats or not
    Scanner userInput = new Scanner(System.in);
    String repeat = "N";
    int counter = 0;

    // create a new payroll manager, could hold more managers if we dealt with
    // different departments or such.
    PayrollManager newPayrollManager = new PayrollManager();
    TaxPayment newTaxRates = new TaxPayment(.15, .05, .03);
    TaxManager newTaxManager = new TaxManager();
    PayPeriod newPayPeriod = new PayPeriod(1, "9/22/2023", "9/29/2023", 0);

    // Start of the program loop to enter employees
    do {

      // Create new variables to store the user input and eventually use the
      // Employee() constructor to fill values
      // instead of using the mutators each time.
      String repeatChoice;
      String firstName;
      String lastName;
      double wage;
      int hoursWorked;

      // Collect Users first name.
      System.out.print("Enter Employee first name: ");
      firstName = userInput.next();

      // Collect users last name.
      System.out.print("Enter Employee last name: ");
      lastName = userInput.next();

      // Collect users hourly rate of pay.
      System.out.print("Enter hourly rate of pay: ");
      wage = userInput.nextDouble();

      // Collect users hours worked.
      System.out.print("Enter # of hours worked this week: ");
      hoursWorked = userInput.nextInt();
      userInput.nextLine();

      // Create a new PayPeriod object based on the hours worked in the payperiod
      newPayPeriod.setNumberOfHours(hoursWorked);
      // Create a new employee and put the user input as parameters
      Employee newEmployee = new Employee(firstName, lastName, wage, hoursWorked, newPayrollManager, newPayPeriod);

      // Add the employee to the array of employees
      newPayrollManager.AddEmployee(newEmployee);

      // sets Employee pay ID to the Employees ID -- Needs Changed since Employee ID
      // wont change per period
      newPayPeriod.setEmployeePayID(newEmployee.getEmployeeID());

      // Prints the paystub
      newPayrollManager.PrintPaystub(counter, newTaxRates, newTaxManager);
      counter++;

      System.out.println("Would you like to enter another employee? (Y/N)");
      // temp string for user Input to repeat the program
      repeatChoice = userInput.next();
      // Grabs the first character of the temp string
      repeat = repeatChoice.substring(0, 1);

      // User can type Y, Yes, y, or yes to continue. Otherwise exit.
    } while (repeat.equalsIgnoreCase("Y"));

    System.out.println("Payroll Summary Report");
    System.out.println("-------------------------");
    newPayrollManager.PrintGrossPayroll(counter, newTaxRates, newPayrollManager);

  }
}
