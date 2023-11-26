/* Jacob Knott
   H00851354
   CSC 213 W01

   I certify that this is my own work and where appropriate an extension
   of the starter code provided for this assignment.
 */




public class StaticPayroll {
    public static void main(String[] args) {

        /*
        Declaring Variables grossPay, wage and hours. grossPay will multiply
        wage and hours together to get the grossPay.
        */

        double wage = 11.25;
        int hours = 15;
        double grossPay = hours * wage;

        //Prints out the gross pay for the wage and hours set.

        System.out.println("Bob Smith worked " + hours + " hours at $" + wage + " per hour for a gross of $" + grossPay);
    }
}
