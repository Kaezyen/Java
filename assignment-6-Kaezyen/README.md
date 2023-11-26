[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/JXt9PTjz)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-718a45dd9cf7e7f842a935f5ebbe5719a5e09af4491e668f4dbf3b35d5cca122.svg)](https://classroom.github.com/online_ide?assignment_repo_id=11756539&assignment_repo_type=AssignmentRepo)
## Assignment #6: Enter Multiple Employees

In this assignment we will take the classes we build in assignment 4 and 5, and use them to allow entry and printing of multiple employees

Important:

If you do a scanner.readInt, it DOES NOT consume the return.

The following sequence:

System._out_.print("Enter hourly rate of pay:");
double hourlyRate = scanner.nextDouble();

System._out_.print("Enter some other string:");
String otherString= scanner.nextLine();

Will NOT work like you expect. If you enter "10" for rate of pay and hit return, it will use the return as input to "otherString" and won't ask for it. What you need to do is get rid of the return as follows:

System._out_.print("Enter hourly rate of pay:");
double hourlyRate = scanner.nextDouble();

System._out_.print("Enter some other string:");

Scanner.nextLine(); // Get rid of the extra return
String otherString= scanner.nextLine();

### Input Expected: Same as Assignment #5

### Sample Run:

**Inputs:**

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

**Output:**

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

Would you like to enter another employee? (Y/N)

##

## Specification:

As before, read in the information as shown, and use the classes we built to print out the appropriate stubs.

Now, after that is complete, ask the user if they would like to enter another employee. If yes, repeat the experience, otherwise end the program
