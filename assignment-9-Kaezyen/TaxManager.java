
/*
 * Jacob Knott H00851354 CSC 213 W01 I certify that this is my own work and where appropriate an
 * extension of the starter code provided for this assignment.
 */

import java.text.DecimalFormat;

public class TaxManager {

  TaxManager () {}

  /*
   * Computes how much an employee pays for Federal, State and Fica Tax. Takes in the employees
   * gross pay and tax rates. Returns nothing and prints out the employees gross Federal, State, and
   * Fica tax paid.
   */
  public void ComputeTaxPayment(double grossPay, TaxPayment taxRates) {
    // Makes all output show 2 decimal places even if there are trailing 0s
    DecimalFormat df = new DecimalFormat("#.##");
    df.setMinimumFractionDigits(2);

    // Sets the gross tax paid by taking gross pay and getting the tax rate from
    // taxRates
    taxRates.setEmployeeGrossFederalTax(grossPay * taxRates.getFederalTax());
    taxRates.setEmployeeGrossStateTax(grossPay * taxRates.getStateTax());
    taxRates.setEmployeeGrossFicaTax(grossPay * taxRates.getFicaTax());
    taxRates.setGrossPayrollFederal(taxRates.getEmployeeGrossFederalTax());
    taxRates.setGrossPayrollState(taxRates.getEmployeeGrossStateTax());
    taxRates.setGrossPayrollFica(taxRates.getEmployeeGrossFicaTax());

    // Prints out the employees gross taxes.
    System.out.println("Taxes: ");
    System.out.println("Federal Tax: $" + df.format(taxRates.getEmployeeGrossFederalTax()));
    System.out.println("State Tax: $" + df.format(taxRates.getEmployeeGrossStateTax()));
    System.out.println("Fica Tax: $" + df.format(taxRates.getEmployeeGrossFicaTax()));

    // Sets gross tax paid to be able to calculate net paycheck
    taxRates.setEmployeeGrossTaxPaid(taxRates.getEmployeeGrossFederalTax()
        + taxRates.getEmployeeGrossStateTax() + taxRates.getEmployeeGrossFicaTax());

    System.out.println("-------------------------");
  }

}
