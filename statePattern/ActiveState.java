package statePattern;

public class ActiveState implements AccountState {
    @Override
    public void deposit(Double depositAmount, Account account) {
        System.out.println("Depositing " + depositAmount);
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println(account);
    }
    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        System.out.println("Withdrawing " + withdrawAmount);
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println(account);
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is suspended!");
        account.setAccountState(new SuspendedState());
    }

    @Override
    public void activate(Account account) {
        System.out.println("Account is already activated!");
    }
    @Override
    public void close(Account account) {
        System.out.println("Account is closed!");
        account.setAccountState(new ClosedState());
    }
}