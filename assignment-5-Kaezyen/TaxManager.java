import java.text.DecimalFormat;

public class TaxManager {
    
    TaxManager()
    {
    }

    /*Computes how much an employee pays for Federal, State and Fica Tax.
      Takes in the employees gross pay and tax rates. Returns nothing and prints out
      the employees gross Federal, State, and Fica tax paid.
    */
    public void ComputeTaxPayment(double grossPay, TaxPayment taxRates)
    {
        //Makes all output show 2 decimal places even if there are trailing 0s
        DecimalFormat df = new DecimalFormat("#.##"); 
        df.setMinimumFractionDigits(2);

        //Sets the gross tax paid by taking gross pay and getting the tax rate from taxRates
        taxRates.setGrossFederalTax(grossPay * taxRates.getFederalTax());
        taxRates.setGrossStateTax(grossPay * taxRates.getStateTax());
        taxRates.setGrossFicaTax(grossPay * taxRates.getFicaTax());

        //Prints out the employees gross taxes.
        System.out.println("Taxes: ");
        System.out.println("Federal Tax: $" + df.format(taxRates.getGrossFederalTax()));
        System.out.println("State Tax: $" + df.format(taxRates.getGrossStateTax()));
        System.out.println("Fica Tax: $" + df.format(taxRates.getGrossFicaTax()));

        //Sets gross tax paid to be able to calculate net paycheck
        taxRates.setGrossTaxPaid(taxRates.getGrossFederalTax() + taxRates.getGrossStateTax() + taxRates.getGrossFicaTax());

        System.out.println("-------------------------");
    }

}