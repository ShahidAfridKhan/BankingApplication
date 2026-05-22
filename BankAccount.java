public void deposit(Customer customer, double amount)
        throws InvalidAmountException {

    if (amount <= 0) {
        throw new InvalidAmountException(
                "Amount should be greater than zero");
    }

    double updatedBalance =
            customer.getCurrentBalance() + amount;

    customer.setCurrentBalance(updatedBalance);

    System.out.println(amount + " deposited successfully");
}

public void withdraw(Customer customer, double amount)
        throws InvalidAmountException,
               InsufficientBalanceException {

    if (amount <= 0) {
        throw new InvalidAmountException(
                "Invalid withdrawal amount");
    }

    if (amount > customer.getCurrentBalance()) {

        throw new InsufficientBalanceException(
                "Not enough balance in account");
    }

    double remainingAmount =
            customer.getCurrentBalance() - amount;

    customer.setCurrentBalance(remainingAmount);

    System.out.println(amount + " withdrawn successfully");
}

public void checkBalance(Customer customer) {

    System.out.println("Available Balance : "
            + customer.getCurrentBalance());
}
