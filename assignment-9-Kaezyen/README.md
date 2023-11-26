[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/gghCZyO2)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=11956396&assignment_repo_type=AssignmentRepo)
## Assignment #9: Summary Report

In this assignment we will take the data stored in an array and at the end of the program, print a summary report which looks like:

-----------------------

Summary Report

-----------------------

Employees Entered: 4

Total Gross Pay: $1800.00

Highest Gross Pay: $200.00

Lowest Gross Pay: $300.00

Average Gross Pay: $350.00

Employee with Highest Number of Hours: Bob Smith

Employee with Lowest Number of Hours: Dave Jones

Total Hours: 200

Total Overtime hours: 50

Total Overtime paid: $200.00

Overtime % of total gross: 23.20 % (to 2 places)

Federal Tax Total: $1233.12

State Tax Total: $123.12

Fica Tax Total: $12.12

### Input Expected: Same as Assignment #6

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

Would you like to enter another employee? (Y/N)

After all employees are entered, display the following:

Payroll Summary Report

\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_\_

Total # of Employees : n (where n is the number of employees entered

Total Gross Salary : $XXXx.xx

Total Normal Time Gross: $xxx.xx

Total Overtime Gross: $xxx.xx

Total Federal Taxes: $xxxx.xx

Total State Taxes: $xxxx.xx

Total FICA: $xxxx.xx

## Hints:

1. Use printf
2. To print a percent sign, use %%

## Specification:

As before, read in the information as shown, and use the classes we built to print out the appropriate stubs.

Now, after that is complete, ask the user if they would like to enter another employee. If yes, repeat the experience, otherwise, say goodbye and exit the program.
