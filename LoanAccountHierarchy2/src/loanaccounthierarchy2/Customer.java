package loanaccounthierarchy2;
import java.util.*;

public class Customer {
    private String firstName;
    private String lastName;
    private String SSN;
    private ArrayList<LoanAccount> loanAccounts = new ArrayList<>();
    
    public Customer(String firstName, String lastName, String SSN){
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = SSN;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getSSN(){
        return SSN;
    }
    
    public void addLoanAccount(LoanAccount account) {
        loanAccounts.add(account);
    }
    
    public String printMonthlyReport(){
        System.out.println("Account report for Customer: " + firstName + " " + lastName + " with SSN " + SSN);
        for (int i = 0; i < loanAccounts.size(); i++){
            System.out.print(loanAccounts.get(i) + " ");
        }
        return "\n";
    } 
}
