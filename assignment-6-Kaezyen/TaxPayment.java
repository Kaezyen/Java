public class TaxPayment {

    //Declares variables for the class
    //All tax variables
    private double federalTax;
    private double stateTax;
    private double ficaTax;

    //All gross paid variables
    private double grossFederalTax;
    private double grossStateTax;
    private double grossFicaTax;
    private double grossTaxPaid;
    
    //Empty contructor to make a new TaxPayment Class.
    TaxPayment(){}

    //Sets Federal, State, and Fica taxes to the parameter values.
    TaxPayment(double newFederalTax, double newStateTax, double newFicaTax){
        federalTax = newFederalTax;
        stateTax = newStateTax;
        ficaTax = newFicaTax;
    }

    //Setters for taxes
    public void setFederalTax(double newFederalTax){
        federalTax = newFederalTax;
    }
    public void setStateTax(double newStateTax){
        stateTax = newStateTax;
    }
    public void setFicaTax(double newFicaTax){
        ficaTax = newFicaTax;
    }
    public void setGrossFederalTax(double newGrossFederalTax){
        grossFederalTax = newGrossFederalTax;
    }
    public void setGrossStateTax(double newGrossStateTax){
        grossStateTax = newGrossStateTax;
    }
    public void setGrossFicaTax(double newGrossFicaTax){
        grossFicaTax = newGrossFicaTax;
    }
    public void setGrossTaxPaid(double newGrossTaxPaid){
        grossTaxPaid = newGrossTaxPaid;
    }

    //Getters for taxes
    public double getFederalTax(){
        return federalTax;
    }
    public double getGrossFederalTax(){
        return grossFederalTax;
    }
    public double getStateTax(){
        return stateTax;
    }
    public double getGrossStateTax(){
        return grossStateTax;
    }
    public double getGrossFicaTax(){
        return grossFicaTax;
    }
    public double getFicaTax(){
        return ficaTax;
    }
    public double getGrossTaxPaid(){
        return grossTaxPaid;
    }
}   