package loanaccounthierarchy2;

public class LoanAccount{
  private double annualInterestRate;
  private double principle;
  private int months;

  public LoanAccount(double principle, double annualInterestRate, int months){
    this.annualInterestRate = annualInterestRate;
    this.principle = principle;
    this.months = months;
  }
  public void setAnnualInterestRate(double annualInterestRate){
    this.annualInterestRate =  annualInterestRate;
    }

  public double getAnnualInterestRate(){
    return annualInterestRate;
  }

  public double getPrinciple(){
    return principle;
  }

  public int getMonths(){
    return months;
  }

  public double calculateMonthlyPayments(){
    double monthlyInterest = annualInterestRate/100/12;
    double monthlyPayment = principle * (monthlyInterest / (1 - Math.pow(1+monthlyInterest, -months)));
    return monthlyPayment;
  }
  
  public String toString(){
      return "\nPrincipal: $" + String.format("%.2f", principle) + "\nAnnual Interest Rate: " + String.format("%.2f", annualInterestRate) + "%\nTerm of Loan in Months: " + months + "\nMonthly Payment: $" + String.format("%.2f", this.calculateMonthlyPayments());
  }
  
}