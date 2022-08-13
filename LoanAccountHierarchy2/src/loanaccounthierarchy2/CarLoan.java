package loanaccounthierarchy2;

public class CarLoan extends LoanAccount{
    private final String vehicleVIN;
    
    public CarLoan(double annualInterestRate, double principle, int months, String vehicleVIN){
        super(annualInterestRate, principle, months);
        this.vehicleVIN = vehicleVIN;
    }
    
    @Override
    public String toString(){
      return "\nCar Loan with: " + super.toString() + "\nVehicle VIN: " + vehicleVIN ;
    }
}
