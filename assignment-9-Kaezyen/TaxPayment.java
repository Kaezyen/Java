/*
 * Jacob Knott H00851354 CSC 213 W01 I certify that this is my own work and where appropriate an
 * extension of the starter code provided for this assignment.
 */

import java.util.ArrayList;

public class TaxPayment {

    // Declares variables for the class
    // All tax variables
    private double federalTax;
    private double stateTax;
    private double ficaTax;

    // All gross paid variables
    private double grossEmployeeFederalTax;
    private double grossEmployeeStateTax;
    private double grossEmployeeFicaTax;
    private double grossEmployeeTaxPaid;

    private ArrayList<Double> grossPayrollFederal = new ArrayList<>(50);
    private ArrayList<Double> grossPayrollState = new ArrayList<>(50);
    private ArrayList<Double> grossPayrollFica = new ArrayList<>(50);

    // Empty contructor to make a new TaxPayment Class.
    TaxPayment() {}

    // Sets Federal, State, and Fica taxes to the parameter values.
    TaxPayment(double newFederalTax, double newStateTax, double newFicaTax) {
        federalTax = newFederalTax;
        stateTax = newStateTax;
        ficaTax = newFicaTax;
    }

    // Mutators for tax rates.
    public void setFederalTax(double newFederalTax) {
        federalTax = newFederalTax;
    }

    public void setStateTax(double newStateTax) {
        stateTax = newStateTax;
    }

    public void setFicaTax(double newFicaTax) {
        ficaTax = newFicaTax;
    }

    // Mutators for EACH Employees taxes paid
    public void setEmployeeGrossFederalTax(double newGrossFederalTax) {
        grossEmployeeFederalTax = newGrossFederalTax;
    }

    public void setEmployeeGrossStateTax(double newGrossStateTax) {
        grossEmployeeStateTax = newGrossStateTax;
    }

    public void setEmployeeGrossFicaTax(double newGrossFicaTax) {
        grossEmployeeFicaTax = newGrossFicaTax;
    }

    public void setEmployeeGrossTaxPaid(double newGrossTaxPaid) {
        grossEmployeeTaxPaid = newGrossTaxPaid;
    }

    // Mutators for GROSS payroll taxes
    public void setGrossPayrollFederal(double tempGrossFederal) {
        grossPayrollFederal.add(tempGrossFederal);
    }

    public void setGrossPayrollState(double tempGrossState) {
        grossPayrollState.add(tempGrossState);
    }

    public void setGrossPayrollFica(double tempGrossFica) {
        grossPayrollFica.add(tempGrossFica);
    }

    // Accessors for tax rates
    public double getFederalTax() {
        return federalTax;
    }

    public double getStateTax() {
        return stateTax;
    }

    public double getFicaTax() {
        return ficaTax;
    }

    // Accessors for taxes for EACH emploee.
    public double getEmployeeGrossFederalTax() {
        return grossEmployeeFederalTax;
    }

    public double getEmployeeGrossStateTax() {
        return grossEmployeeStateTax;
    }

    public double getEmployeeGrossFicaTax() {
        return grossEmployeeFicaTax;
    }

    public double getEmployeeGrossTaxPaid() {
        return grossEmployeeTaxPaid;
    }

    // Accessors for Gross Payroll taxes
    public double getGrossPayrollFederal() 
    {
        double grossFederal = 0;
        for(int i = 0; i < grossPayrollFederal.size(); i++)
        {
            grossFederal += grossPayrollFederal.get(i);
        }
        return grossFederal;
    }

    public double getGrossPayrollState()    
    {
        double grossState = 0;
        for(int i = 0; i < grossPayrollState.size(); i++)
        {
            grossState += grossPayrollState.get(i);
        }
        return grossState;
    }

    public double getGrossPayrollFica()
    {
        double grossFica = 0;
        for(int i = 0; i < grossPayrollFica.size(); i++)
        {
            grossFica += grossPayrollFica.get(i);
        }
        return grossFica;
    }

}
