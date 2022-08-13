package loanaccounthierarchy2;

public class PrimaryMortgage extends LoanAccount{
    private final double PMIMonthlyAmount;
    private final Address Address;
    
    public PrimaryMortgage(double annualInterestRate, double principle, int months, double PMIMonthlyAmount, Address Address){
        super(annualInterestRate, principle, months);
        this.PMIMonthlyAmount = PMIMonthlyAmount;
        this.Address = Address;
    }
    
    @Override
    public String toString(){
        return "\n\nPrimary Mortgage Loan with: " + super.toString() + "\nPMI Monthly Amount: $" + PMIMonthlyAmount + "\nProperty Address: " + Address.toString();
    }
}
