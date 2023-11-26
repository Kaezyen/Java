[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/zUhfZ_ay)
## Assignment #3: Calculate Overtime

In this assignment, we are going to add some basic calculation logic to the previous assignment to properly calculate overtime pay.

### Sample Run:

**Inputs:**

Enter Employee Id: _123456_

Enter Employee first name: _Larry_

Enter Employee last name: _Schoeneman_

Enter # of hours worked this week: 5_0_


Enter hourly rate of pay: 10.00


**Output:**

Employee Id : 123456

Last Name: Schoeneman First Name: Larry

Hours Worked: 50 Hourly Rate: $10.00

Regular Pay: 40 hours at $10/hr: $400.00

Overtime Pay: 10 hours at $15/hr: 150

Gross Total: $550.00


Specification:

When an employee works more than 40 hours in a week, they need to be paid overtime of 1.5 times their base pay.

Your code must accommodate the following situations:

1. When a user enters hours \<= 40, the output should simply be # of hours worked \* hourly rate, formatted as shown above, **without the overtime pay line**
2. When a user enters hours \> 40, then calculate overtime pay of 1.5\*hourly rate ONLY for hours greater than 40. Add them up and display the output.

### Notes and specifications:

All input must be preceded by a prompt on the same line, as shown above.

Output must be formatted as shown.

### Expectations:

- You must use variables
- You should comment your code intelligently
- You should separate your code logically into chunks (inputs, computation, printing, etc)
- You are expected to use if statements and class methods
