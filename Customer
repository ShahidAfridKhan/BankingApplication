private int accNumber;
private double currentBalance;
private boolean hasLoan;
private double monthlySalary;

public Customer(int id, String fullName, String contactNo,
                int accNumber, double currentBalance,
                boolean hasLoan, double monthlySalary) {

    super(id, fullName, contactNo);

    this.accNumber = accNumber;
    this.currentBalance = currentBalance;
    this.hasLoan = hasLoan;
    this.monthlySalary = monthlySalary;
}

public int getAccNumber() {
    return accNumber;
}

public double getCurrentBalance() {
    return currentBalance;
}

public boolean hasLoan() {
    return hasLoan;
}

public double getMonthlySalary() {
    return monthlySalary;
}

public void setCurrentBalance(double currentBalance) {
    this.currentBalance = currentBalance;
}

public void setHasLoan(boolean hasLoan) {
    this.hasLoan = hasLoan;
}

@Override
public void displayDetails() {

    System.out.println("Customer ID : " + id);
    System.out.println("Name : " + fullName);
    System.out.println("Phone : " + contactNo);
    System.out.println("Account No : " + accNumber);
    System.out.println("Balance : " + currentBalance);
    System.out.println("Salary : " + monthlySalary);
    System.out.println("Loan Taken : " + hasLoan);
}
