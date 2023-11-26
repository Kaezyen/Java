/*
 * Jacob Knott H00851354 CSC 213 W01
 *
 * I certify that this is my own work and where appropriate an extension of the starter code
 * provided for this assignment.
 */

import java.text.DecimalFormat;
import java.util.*;

public class PayrollManager {

	//------------------------Begin Variable Declaration------------------------

	private ArrayList<Double> empSalaryList = new ArrayList<Double>();

	private ArrayList<Double> empOvertimeSalaryList = new ArrayList<Double>();

	private ArrayList<Integer> empHoursWorkedList =  new ArrayList<Integer>();

	private ArrayList<Integer> empOvertimeWorkedList = new ArrayList<Integer>();

	private ArrayList<Employee> employeeList = new ArrayList<Employee>();

	private double highestPaidSalary;
	private double lowestPaidSalary;

	private String highestPaidEmployee;
	private String lowestPaidEmployee;

    DecimalFormat df = new DecimalFormat("$#.##");

	DecimalFormat pf = new DecimalFormat("#.##%");

	//------------------------Begin Constructors------------------------

	public PayrollManager()
	{

	}

	//------------------------Begin Mutators------------------------

	public void addEmpSalary(double empSalary)
	{
		empSalaryList.add(empSalary);
	}

	public void addEmpOvertime(double empOvertime)
	{
		empOvertimeSalaryList.add(empOvertime);
	}

	public void addEmpHoursWorked(int empHours)
	{
		empHoursWorkedList.add(empHours);
	}

	public void addEmpOvertimeWorked(int empOvertimeHours)
	{
		empOvertimeWorkedList.add(empOvertimeHours);
	}

	public void addHighestPaidSalary(double newHighestPaidSalary)
	{
		highestPaidSalary = newHighestPaidSalary;
	}

	public void addLowestPaidSalary(double newLowestPaidSalary)
	{
		lowestPaidSalary = newLowestPaidSalary;
	}

	public void addHighestPaidEmployee(String newHighestPaidEmployee)
	{
		highestPaidEmployee = newHighestPaidEmployee; 
	}

	public void addLowestPaidEmployee(String newLowestPaidEmployee)
	{
		lowestPaidEmployee = newLowestPaidEmployee;
	}

	public void addEmployeeToList(Employee newEmployee)
	{
		employeeList.add(newEmployee);
	}


	//------------------------Begin Accessors------------------------

	public ArrayList<Double> getGrossEmpSalaryList()
	{
		return empSalaryList;
	}

	public ArrayList<Double> getGrossEmpOvertimeList()
	{
		return empOvertimeSalaryList;
	}
	
	public ArrayList<Integer> getEmpHoursList()
	{
		return empHoursWorkedList;
	}

	public ArrayList<Integer> getEmpOvertimeList()
	{
		return empOvertimeWorkedList;
	}

	public double getHighestPaidSalary()
	{
		return highestPaidSalary;
	}

	public double getLowestPaidSalary()
	{
		return lowestPaidSalary;
	}

	public String getHighestPaidEmployee()
	{
		return highestPaidEmployee;
	}

	public String getLowestPaidEmployee()
	{
		return lowestPaidEmployee;
	}

	public ArrayList<Employee> getEmployeeList()
	{
		return employeeList;
	}
	

	//------------------------Begin Methods------------------------
	//Thgese methods are for calulating regular pay, overtime pay and gross pay for employees and payrolls
	//None of these have print statements and are only used for calculations for printing later on.


	//Calculates Employees Regular Pay
	public double CalculateEmployeeRegularPay(Employee newEmployee)
	{
		double employeeRegularPay = newEmployee.getHourlyRate() * newEmployee.getEmpNormalHours();
		return employeeRegularPay;
	}


	//Calculates Employee Overtime Pay
	public double CalculateEmployeeOvertimePay(Employee newEmployee)
	{
		double employeeOvertimePay = newEmployee.getEmpOvertimeHours() * newEmployee.getOvertimeRate();
		empOvertimeSalaryList.add(employeeOvertimePay);
		return employeeOvertimePay;

	}

	//Calculates Employee Gross Pay
	public double CalculateEmployeeGrossPay(Employee newEmployee)
	{
		double employeeRegularPay = newEmployee.getHourlyRate() * newEmployee.getEmpNormalHours();
		double employeeOvertimePay = newEmployee.getEmpOvertimeHours() * newEmployee.getOvertimeRate();
		double grossEmployeePay = employeeRegularPay + employeeOvertimePay;
		empSalaryList.add(grossEmployeePay);

		return grossEmployeePay;


	}

	//Calculates Payroll Overtime Pay
	public double CalculatePayrollOvertimePay()
	{
		double payrollOvertimeGrossPay = 0;

		if(empOvertimeSalaryList.size() == 0)
		{
			return payrollOvertimeGrossPay;
		}
		else if(empOvertimeSalaryList.size() == 1)
		{
			payrollOvertimeGrossPay = empOvertimeSalaryList.get(0);
			return payrollOvertimeGrossPay;
		}
		else
		{
			for(int i = 0; i < empOvertimeSalaryList.size(); i++)
			{
				payrollOvertimeGrossPay += empOvertimeSalaryList.get(i);
			}
			return payrollOvertimeGrossPay;
		}
	}

	//Calculates Payroll Gross Pay
	public double CalculatePayrollGrossPay()
	{
		double payrollGrossPay = 0;
		for(int i = 0; i < empSalaryList.size(); i++)
		{
			payrollGrossPay += empSalaryList.get(i);
		}
		return payrollGrossPay;
	}
	
	//Calculates Payroll Overtime Hours
	public int CalculatePayrollOvertimeHours()
	{
		int payrollOvertimeHours = 0;
		for(int i = 0; i < empOvertimeWorkedList.size(); i++)
		{
			payrollOvertimeHours += empOvertimeWorkedList.get(i);
		}
		return payrollOvertimeHours;

	}

	//Calculate Payroll Gross Hours
	public int CalculatePayrollGrossHours()
	{
		int payrollGrossHours = 0;
		for(int i = 0; i < empHoursWorkedList.size(); i++)
		{
			payrollGrossHours = empHoursWorkedList.get(i) + empOvertimeWorkedList.get(i);
		}
		return payrollGrossHours;
	}

	//Calculates Highest Paid Employee --Unused--
	public void CalculateHighestPaid()
	{
		for(int i = 0; i < empSalaryList.size(); i++)
		{
			if (empSalaryList.get(i) > highestPaidSalary)
			{
				highestPaidSalary = empSalaryList.get(i);
				try
				{
					highestPaidEmployee = employeeList.get(i).getFirstName() + " " + employeeList.get(i).getLastName();
				}catch(IndexOutOfBoundsException e)
				{
					highestPaidEmployee = employeeList.get(i-1).getFirstName() + " " + employeeList.get(i-1).getLastName();
				}
			}
		}

	}

	//Calculates Lowest Paid Employee --Unused--
	public void CaclulateLowestPaid()
	{
		for(int i = 0; i < empSalaryList.size(); i++)
		{
			if(empSalaryList.get(i) < lowestPaidSalary)
			{
				lowestPaidSalary = empSalaryList.get(i);
				lowestPaidEmployee = employeeList.get(i).getFirstName() + " " + employeeList.get(i).getLastName();
			}
		}

	}


	//Prints a Paystub for a individual Employee
	public void PrintPaystub(Employee Employee, PayrollManager newPayrollManager,TaxManager newTaxManager, TaxPayment taxRates)
	{
		System.out.println("-------------------------");
		System.out.println("Employee ID: " + Employee.getEmployeeID());
		System.out.println("Last Name: " + Employee.getLastName() + " First Name: " + Employee.getFirstName() );
		System.out.println("Week of: " + Employee.getPayPeriods().get(0).getStartDate());
		System.out.println("Regular Pay: " + Employee.getEmpNormalHours() + " hours at: " + df.format(Employee.getHourlyRate() ) + "/hr : " + df.format(newPayrollManager.CalculateEmployeeRegularPay(Employee) ) );

		if(Employee.getEmpOvertimeHours() > 0)
		{
			System.out.println("Overtime Pay: " + Employee.getEmpOvertimeHours() + " Hours at" + Employee.getOvertimeRate() + "/hr : " + df.format(newPayrollManager.CalculateEmployeeOvertimePay(Employee) ) );
		}

		System.out.println("Gross Total: " + df.format(newPayrollManager.CalculateEmployeeGrossPay(Employee) ) );
		System.out.println("-------------------------");
		newTaxManager.ComputeTaxPayment(newPayrollManager.CalculateEmployeeGrossPay(Employee), taxRates);
	}

	//Prints a summary of the payroll. Adding each employees pay and taxes paid.
	public void PrintPayrollSummary(int counter, TaxPayment taxRates, PayrollManager newPayrollManager)
	{
		
		System.out.println("Employees Entered: " + counter);
		System.out.println("Total Gross Pay: " + df.format(newPayrollManager.CalculatePayrollGrossPay() ) );
		System.out.println("Total Normal Time Gross: " + (newPayrollManager.CalculatePayrollGrossPay() - newPayrollManager.CalculatePayrollOvertimePay() ) );
		System.out.println("Total Overtime Gross: " + newPayrollManager.CalculatePayrollOvertimePay() );
		System.out.println("Total Federal Taxes:" + df.format(taxRates.getGrossPayrollFederal()));
		System.out.println("Total State Taxes: " + df.format(taxRates.getGrossPayrollState()));
		System.out.println("Total Fica Taxes: " + df.format(taxRates.getGrossPayrollFica()));

	}
}
