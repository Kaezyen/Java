/* Jacob Knott
   H00851354
   CSC 213 W01

   I certify that this is my own work and where appropriate an extension
   of the starter code provided for this assignment.
 */

import java.util.*;

public class Employee {
    

    //Creating Variables for Employees
    private int employeeID;
    private String firstName;
    private String lastName;
    private double hourlyRate;
    private ArrayList<PayPeriod> payPeriods =  new ArrayList<>(50);



    //Constructors to be able to create a new Employee
    public Employee()
    {
        employeeID = 0;
    }
    public Employee(String newFirst, String newLast, Double newHourlyRate, PayrollManager newPayrollManager, PayPeriod newPayPeriod)
    {
        employeeID = newPayrollManager.GenerateEmployeeID();
        firstName =  newFirst;
        lastName = newLast;
        hourlyRate = newHourlyRate;
        payPeriods.add(newPayPeriod);
    }
    //Mutator for the array list of payperiods
    public void changePayPeriodList(int index, PayPeriod newPayPeriod)
    {
        payPeriods.add(index, newPayPeriod);
    }
    public String toString()
    {
        return employeeID + " " + firstName + " " + lastName;
    }

    //Mutators to be able to change the values of different employee variables
    public void setEmployeeID(int newEmployeeID){

        employeeID = newEmployeeID;
    }
    //Sets employees first name
    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }
    //Sets employees last name
    public void setLastName(String newLastName){
        lastName =  newLastName;
    }
    //Sets employees hourly rate or wage
    public void setHourlyRate(double newHourlyRate){
        hourlyRate = newHourlyRate;
    }
    public void addPayPeriod(PayPeriod newPayPeriod){
        payPeriods.add(newPayPeriod);
    }

    //Accessors to be able to access the variables of employees

    //Returns employees ID
    public int getEmployeeID(){
        return employeeID;
    }
    //Returns employees first name
    public String getFirstName(){
        return firstName;
    }
    //Returns employees last name
    public String getLastName(){
        return lastName;
    }
    //Returns employees Hourly rate or Wage
    public double getHourlyRate(){
        return hourlyRate;
    }
    public ArrayList<PayPeriod> getPayPeriodList()
    {
        return payPeriods;
    }












}  