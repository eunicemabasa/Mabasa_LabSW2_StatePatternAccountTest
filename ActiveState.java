public class ActiveState implements AccountState {

    @Override
    public void deposit(Account account, Double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("[TRANSACTION] Deposit successful");
        System.out.println(account + "\n");
    }

    @Override
    public void withdraw(Account account, Double amount) {
        account.setBalance(account.getBalance() - amount);
        System.out.println("[TRANSACTION] Withdrawal successful");
        System.out.println(account + "\n");
    }

    @Override
    public void activate(Account account) {
        System.out.println("[INFO] Account is already activated!\n");
    }

    @Override
    public void suspend(Account account) {
        account.setState(new SuspendedState());
        System.out.println("[STATE] Account is suspended!\n");
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("[STATE] Account is closed!\n");
    }
}
