private String id;
private String type;
private double amount;
private double interestRate;
private int years;

public Loan(String id, String type,
            double amount,
            double interestRate,
            int years) {

    this.id = id;
    this.type = type;
    this.amount = amount;
    this.interestRate = interestRate;
    this.years = years;
}

public double calculateSimpleInterest() {

    double si = (amount * interestRate * years) / 100;
    return si;
}

public double calculateCompoundInterest() {

    double totalAmount = amount *
            Math.pow((1 + interestRate / 100), years);

    double compoundInterest = totalAmount - amount;

    return compoundInterest;
}

public void showLoanDetails() {

    System.out.println("Loan ID : " + id);
    System.out.println("Loan Type : " + type);
    System.out.println("Principal Amount : " + amount);
    System.out.println("Interest Rate : " + interestRate);
    System.out.println("Years : " + years);
}
