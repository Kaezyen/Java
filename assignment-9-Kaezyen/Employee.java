/*
 * Jacob Knott H00851354 CSC 213 W01
 *
 * I certify that this is my own work and where appropriate an extension of the starter code
 * provided for this assignment.
 */

import java.util.*;

public class Employee {
	
	//Employee Variables
	private int employeeID = 0;
	private String firstName;
	private String lastName;
	private double hourlyRate;

	//Variable to store Normal and Overtime hours worked.
	private int totalEmpHoursWorked;

	//Variable to store Normal Hours worked.
	private int empNormalHours;

	//Variable to store Overtime Hours worked.
	private int empOvertimeHours;

	//Array list to store PayPeriods for EACH employee.
	private ArrayList<PayPeriod> empPayPeriodList = new ArrayList<PayPeriod>();

	//------------------------Begin Constructors------------------------
	
	public Employee()
	{
		employeeID++;
	}

	public Employee(int newEmployeeID, String newFirst, String newLast, Double newHourlyRate, int newHoursWorked)
	{
		employeeID = newEmployeeID;
		firstName = newFirst;
		lastName = newLast;
		hourlyRate = newHourlyRate;
		totalEmpHoursWorked = newHoursWorked;

		if(newHoursWorked - 40 > 0)
		{
			empOvertimeHours = newHoursWorked - 40;
			empNormalHours = newHoursWorked - empOvertimeHours;
		}
		else
		{
			empOvertimeHours = 0;
			empNormalHours = newHoursWorked;
		}
	}	

	//------------------------Begin Mutators------------------------

	public void setEmployeeID(int newEmployeeID)
	{
		employeeID = newEmployeeID;
	}

	public void setFirstName(String newFirstName)
	{
		firstName = newFirstName;
	}

	public void setLastName(String newLastName)
	{
		lastName = newLastName;
	}

	public void setHourlyRate(double newHourlyRate)
	{
		hourlyRate = newHourlyRate;
	}
	public void addNewPayPeriod(PayPeriod newPayPeriod)
	{
		empPayPeriodList.add(newPayPeriod);
	}	

	public void setHoursWorked(int newHoursWorked)
	{
		//Sets the Total Employees Hours Worked to the parameter Value
		totalEmpHoursWorked = newHoursWorked;

		/*Check weather the employee worked more than 40 hours: If so overtime hours is
		 *Equal to the hours worked - 40, To get Normal Hours we will subtract overtime hours
		  from our hours worked.
		 */
		if(totalEmpHoursWorked - 40 > 0)
		{
			empOvertimeHours = totalEmpHoursWorked - 40;
			empNormalHours = totalEmpHoursWorked - empOvertimeHours;
		}
		else
		{
			empOvertimeHours = 0;
			empNormalHours = newHoursWorked;
		}
	}
	
	//------------------------Begin Accessors------------------------

	public int getEmployeeID()
	{
		return employeeID;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public double getHourlyRate()
	{
		return hourlyRate;
	}

	public double getOvertimeRate()
	{
		return (hourlyRate * 1.5);
	}

	public int getTotalEmpHoursWorked()
	{
		return totalEmpHoursWorked;
	}

	public int getEmpNormalHours()
	{
		return empNormalHours;
	}

	public int getEmpOvertimeHours()
	{
		return empOvertimeHours;
	}
	public ArrayList<PayPeriod> getPayPeriods()
	{
		return empPayPeriodList;
	}

}