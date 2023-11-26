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
        
        do
        {
            String temp;
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

            //Collect users middle initial.
            System.out.print("Enter middle initial: ");
            newEmployee.setMiddleInitial(userInput.next().charAt(0));
            userInput.nextLine();

            //Collect users address
            System.out.print("Enter address: ");
            newEmployee.setAddress(userInput.next());
            userInput.nextLine();

            //Collect users city.
            System.out.print("Enter city: ");
            newEmployee.setCity(userInput.next());

            //Collect users state.
            System.out.print("Enter state: ");
            newEmployee.setState(userInput.next());

            //Collect users Zip
            System.out.print("Enter zipzode: ");
            newEmployee.setZip(userInput.nextInt());

            //Collect users email address.
            System.out.print("Enter email address: ");
            newEmployee.setEmail(userInput.next());
            userInput.nextLine();

            //Collect users phone number.
            System.out.print("Enter phone number: ");
            newEmployee.setPhone(userInput.next());

            //Collect users hourly rate of pay.
            System.out.print("Enter hourly rate of pay: ");
            newEmployee.setHourlyRate(userInput.nextDouble());
  
            //Collect users hours worked.
            System.out.print("Enter # of hours worked this week: ");
            newPayPeriod.setNumberOfHours(userInput.nextInt());
            userInput.nextLine();

            //sets Employee pay ID to the Employees ID -- Needs Changed since Employee ID wont change per period
            newPayPeriod.setEmployeePayID(newEmployee.getEmployeeID());

            //Prints the employees paystub, takes a Object Employee, PayPeriod and TaxPayment
            newPayrollManager.PrintPaystub(newEmployee, newPayPeriod, newTaxRates);

            System.out.println("Would you like to enter another employee? (Y/N)");
            //temp string for user Input to repeat the program
            temp = userInput.next();
            //Grabs the first character of the temp string
            repeat = temp.substring(0, 1);

            //User can type Y, Yes, y, or yes to continue. Otherwise exit.
        }while(repeat.equalsIgnoreCase("Y"));
   }
 }