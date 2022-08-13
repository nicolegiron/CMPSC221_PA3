package loanaccounthierarchy2;

public class UnsecuredLoan extends LoanAccount{
    public UnsecuredLoan(double annualInterestRate, double principle, int months){
        super(annualInterestRate, principle, months);
    }
    
    @Override
    public String toString(){
        return "\n\nUnsecured Loan with: " + super.toString();
    }
}
