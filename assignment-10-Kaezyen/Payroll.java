/*
 * Jacob Knott H00851354 CSC 213 W01
 *
 * I certify that this is my own work and where appropriate an extension of the starter code
 * provided for this assignment.
 */

import java.util.Scanner;

public class Payroll 
{
    
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		String programRepeat = "N";
		int programCounter = 0;

		PayrollManager newPayrollManager = new PayrollManager();
		TaxPayment newTaxRates = new TaxPayment(.15, .05, .03);
		TaxManager newTaxManager = new TaxManager();

		do
		{
			String repeatChoice;
			String firstName;
			String lastName;
			double hourlyRate;
			int hoursWorked;
			int employeeID;
			boolean valid;

			//Try Statement to make sure use inputs a Integer and Non-Repeating employee ID
			do
			{
				valid = true;
				System.out.print("Enter Employee ID: ");

				//Handles if user did not input a number
				if(!userInput.hasNextInt())
				{
					System.out.println("Error - Please Enter a Number");
					userInput.next();
					valid = false;
				}
				else
				{

					//Could not get this to work correctly -- Allows user to repeat program if same ID is used but user has to type in the new ID twice.. Cant figure out why.
					for(int i = 0; i < newPayrollManager.getEmployeeList().size(); i++)
					{
						if(newPayrollManager.getEmployeeList().get(i).getEmployeeID() == userInput.nextInt())
						{
							System.out.println("Error Invalid Employee ID: Employee ID Already Exists");
							valid = false;
							break;
						}
					}
				}	
			}while (!valid);

			employeeID = userInput.nextInt();
			userInput.nextLine();

			System.out.print("Enter Employee first name: ");
			firstName = userInput.next();

			System.out.print("Enter Employee last Name: ");
			lastName = userInput.next();

			System.out.print("Enter # of hours worked this week: ");
			hoursWorked = userInput.nextInt();
			userInput.nextLine();

			System.out.print("Enter hourly rate of pay: ");
			hourlyRate = userInput.nextDouble();
		

			//Creates a new Employee and Payperiod Object
			Employee newEmployee = new Employee(employeeID, firstName, lastName, hourlyRate, hoursWorked);
			PayPeriod newPayPeriod = new PayPeriod(1, employeeID, "09/24/2023", "09/28/23");
			newEmployee.addNewPayPeriod(newPayPeriod);
			newPayrollManager.addEmployeeToList(newEmployee);
			newPayrollManager.PrintPaystub(newEmployee, newPayrollManager, newTaxManager, newTaxRates);

			System.out.println("Would you like to enter another employee? (Y/N)");
			repeatChoice = userInput.next();
			programRepeat = repeatChoice.substring(0,1);

			programCounter++;

		}while(programRepeat.equalsIgnoreCase("Y"));

		System.out.println("Payroll Summary Report");
		System.out.println("-------------------------");
		newPayrollManager.PrintPayrollSummary(programCounter, newTaxRates, newPayrollManager);
	}
}
