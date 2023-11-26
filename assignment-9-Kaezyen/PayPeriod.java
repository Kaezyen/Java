/*
 * Jacob Knott H00851354 CSC 213 W01
 *
 * I certify that this is my own work and where appropriate an extension of the starter code
 * provided for this assignment.
 */

//Payperiod class to store employee PayPeriods
public class PayPeriod extends Employee{

	private int payPeriodID;
	private int employeePayID;
	private String startDate;
	private String endDate;

	//------------------------Begin Constructors------------------------

	public PayPeriod()
	{
		payPeriodID = 1;
		employeePayID = 1;
		startDate = "09/26/2023";
		endDate = "09/30/2023";
	}
	public PayPeriod(int newPayPeriodID, int newEmployeePayID, String newStartDate, String newEndDate)
	{
		payPeriodID = newPayPeriodID;
		employeePayID = newEmployeePayID;
		startDate = newStartDate;
		endDate = newEndDate;
	}

	//------------------------Begin Mutators------------------------
	
	public void setPayPeriodID(int newPayPeriodID)
	{
		payPeriodID = newPayPeriodID;
	}

	public void setEmployeePayID(int newEmployeePayID)
	{
		employeePayID = newEmployeePayID;
	}
	
	public void setStartDate(String newStartDate)
	{
		startDate = newStartDate;
	}

	public void setEndDate(String newEndDate)
	{
		endDate = newEndDate;
	}

	//------------------------Begin Accessors------------------------

	public int getPayPeriodID()
	{
		return payPeriodID;
	}

	public int getEmployeePayID()
	{
		return employeePayID;
	}
	
	public String getStartDate()
	{
		return startDate;
	}

	public String getEndDate()
	{
		return endDate;
	}
}