[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/5PBSHaO7)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=11801197&assignment_repo_type=AssignmentRepo)
## Assignment #8: Use ArrayLists

In this assignment we will store all the data we've been entering in an array. Due to Java's inability to dynamically resize arrays, we will use arraylists. Note that for this to work correctly we will need TWO array lists.

1. An array list of employees
2. An array list of PayPeriods INSIDE each employee. Be SURE to "new" your inner array in your employee constructor and create appropriate getter and setter methods on the OUTER class

### Input Expected: Same as Assignment #6

### Sample Run:

**Inputs:**

Enter Employee Id: _123456_

Enter Employee first name: _Larry_

Enter Employee last name: _Schoeneman_

Enter # of hours worked this week: 5_0_

Enter hourly rate of pay: $10.00

Would you like to enter another employee? (Y/N)

**Output: (Complete list of employees)**

Employee Id : 123456

Last Name: Schoeneman First Name: Larry

Week of 6/11/2020 (use current date)

Hours Worked: 50 Hourly Rate: $10.00

Regular Pay: 40 hours at $10/hr: $400.00

Overtime Pay: 10 hours at $15/hr: 150

Gross Total: $650.00

After **all** employees are entered, display an employee list:

Employee List

Id Name

-----------------------------------

1 Larry Schoeneman

2 Bob Smith

Use tabs and printf to format your list nicely (\t). Use an advanced for loop to print it.

## Specification:

As before, read in the information as shown, and use the classes we built to print out the appropriate stubs.

Now, after that is complete, ask the user if they would like to enter another employee. If yes, repeat the experience, otherwise, say goodbye and exit the program. We must also now GENERATE unique employee ids. I would suggest creating a function to generate these ids in the Payroll Manager class. Similary, Use a static integer for the payperiod id.

I would also suggest that the Payroll manager would be a good place to store the employees themselves.

Add a method to payroll manager to print an employee list.

In this assignment we will properly format all our output.

So, wherever we output $0.0 or $0.000000001 it should now output dollar amounts as:

$xxxx.xx where the left side is as long as it needs to be, and the right side is always two digits.

$123.45, $1.24, $123456.78 are valid examples.

_Hint:_ _printf_
