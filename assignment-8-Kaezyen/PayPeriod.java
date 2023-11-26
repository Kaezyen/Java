/* Jacob Knott

   H00851354
   CSC 213 W01

   I certify that this is my own work and where appropriate an extension
   of the starter code provided for this assignment.
 */

 public class PayPeriod {

    //Creating variables for PayPeriod

    private int payPeriodID;
    private int employeePayID;
    private String startDate;
    private String endDate;
    private int numberOfHours;

    //Constructors for creating a new Payroll Period
   

   public String toString()
   {
      return "Week of " + startDate;
   }
   public PayPeriod(int newNumberOfHours)
   {
      payPeriodID = 1;
      startDate = "09/17/2023";
      numberOfHours = newNumberOfHours;

   }
   public PayPeriod(int newPayPeriodID, String newStartDate, String newEndDate, int newNumberOfHours)
   {
      payPeriodID = newPayPeriodID;
      startDate = newStartDate;
      endDate =  newEndDate;
      numberOfHours = newNumberOfHours;
   }
    
    //Mutators to change payroll variables

    //Sets PayPeriodID
   public void setPayPeriodID(int newPayPeriodID)
   {
      payPeriodID = newPayPeriodID;
   }
   //Sets the Employees PayID
   public void setEmployeePayID(int newEmployeePayID)
   {
      employeePayID = newEmployeePayID;
   }
   //Sets the pay period start date
   public void setStartDate(String newStartDate)
   {
      startDate = newStartDate;
   }
   //Sets the pay period end date
   public void setEndDate(String newEndDate)
   {
      endDate = newEndDate;
   }
   //Sets how many hours an employee worked in a pay period
   
   public void setNumberOfHours(int newNumberOfHours)
   {
      numberOfHours = newNumberOfHours;
   }

   //Accessors for each variable in Payperiod
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
   public int getNumberOfHours()
   {
      return numberOfHours;
   }
    
}