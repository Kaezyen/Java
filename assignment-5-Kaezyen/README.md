[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/a6JUN1jk)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=11752844&assignment_repo_type=AssignmentRepo)
## Assignment #5: Calculate Taxes

In this assignment we are going to add logic to calculate taxes

### Input Expected: Same as Assignment #2

### Sample Run:

**Inputs:**

Enter Employee Id: _123456_

Enter Employee first name: _Larry_

Enter Employee last name: _Schoeneman_

Enter # of hours worked this week: 5_0_

Enter hourly rate of pay: $10.00

**Output:**

Employee Id : 123456

Last Name: Schoeneman First Name: Larry

Week of 6/11/2020 (use current date)

Hours Worked: 50 Hourly Rate: $10.00

Regular Pay: 40 hours at $10/hr: $400.00

Overtime Pay: 10 hours at $15/hr: 150

Gross Total: $650.00

Federal Tax: $65.00

State Tax: $35.00

FICA: $20.00

Net Pay: $530.00

##

## Specification:

We are going to add the following to our class set.

1. Create a new class called TaxPayment which has the following fields:
  1. FederalTax
  2. StateTax
  3. FicaTax
2. Add an instance of this class to the pay period class so we have a place to store it
3. Create a new class called TaxManager that has the following methods:
  1. TaxPayment ComputeTaxPayment(double grossPay, TaxRates taxRates) – This should return the taxes for this employee, which can then be stored in the payperiod class
  2. We are making TaxManager a separate class so eventually we have a place to put different tax rates
4. Use the following default rates for tax rates
  1. FederalRate – 15%
  2. StateRate – 5%
  3. FicaRate – 3%
5. You should use TaxManager in your printPaystub method to calculate and display the appropriate taxes.

**Example Input**

Enter Employee first name:Larry

Enter Employee last name:Schoeneman

Enter middle initial:X

Enter address:1219 Rose Court East

Enter city:Buffalo Grove

Enter state:IL

Enter zipcode:60089

Enter email:lschoeneman@harper.edu

Enter phone:121-124-1234

Enter hourly rate of pay:10

Enter hours worked:40

**Example Output**

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

Employee Id : 1

Last Name: Schoeneman First Name: Larry Middle Initial: X

Address: 1219 Rose Court East, Buffalo Grove, IL 60089

Phone: 121-124-1234 Email:lschoeneman@harper.edu

Hours Worked: 40.0 Hourly Rate: $10.0

Gross Total: $400.0

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

Taxes:

Federal Tax:$60.0

State Tax:$20.0

Fica Tax:$12.0

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

Net Paycheck: $308.0
