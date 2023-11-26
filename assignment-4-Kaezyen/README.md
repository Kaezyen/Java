[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/ip0InjVm)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=11664121&assignment_repo_type=AssignmentRepo)
## Assignment #4: Refactor to classes

In this assignment we are going to refine the code we wrote above to make use of classes. The inputs and outputs should be the same as Assignment #3 with the following changes:

1. Add middle initial, address, email and phone information to input
2. No longer grab employee id, we want it generated and displayed

## Specification:

In the prior assignment, you just wrote your code in a linear fashion to read from the keyboard, calculate it and output the results. We will now reorganize this into classes

We are going to implement the following classes:

1. Employee – This class represents an employee. It should have the following fields implemented as getters and setters:
  1. Employee ID (we will need to make this unique, for now, just hard code it to 1).
  2. First name, Last name, Middle initial
  3. Address, City, Zip
  4. Phone, Email
  5. Hourly Rate
2. PayPeriod – This class represents an employee's payment information. An employee will eventually have more than one pay period. It should contain the following fields (implemented as getters and setters):
  1. Pay period Id (hard code it for now)
  2. Employee Id (who is this for)
  3. Start Date, End Date
  4. Number of hours
3. PayrollManager – This class provides the functionality we need to compute and display our payroll. It should implement the following methods:
  1. double CalculateGrossPay (Employee, Payperiod) – This should return the total gross for the payperiod
  2. double CalculateRegularPay(Employee, Payperiod) – This should return the gross paid at the regular rate for the pay period
  3. double CalculateOvertimePay(Employee, Payperiod) – This should return ONLY the gross overtime for the pay period
  4. void PrintPaystub(Employee, Payperiod) – This should print out the paystub for the employee for the period. Note that here, we should use the other methods we defined above to implement this method.
4. Your main program will then do the following:
  1. Gather input and put in in an instance of Employee
  2. Gather payroll info and put it into an instance of Payperiod (default the dates for now)
  3. Call Print Paystub to display it.

### Expectations:

- You must create classes, with constructors, getters and setters as needed.
- You should comment your code intelligently
- You should separate your code logically into chunks (inputs, computation, printing, etc)
- You are expected to use if statements and class methods
