public class SuspendedState implements AccountState {

    @Override
    public void deposit(Account account, Double amount) {
        System.out.println("[ERROR] You cannot deposit on a suspended account!");
        System.out.println(account + "\n");
    }

    @Override
    public void withdraw(Account account, Double amount) {
        System.out.println("[ERROR] You cannot withdraw on a suspended account!");
        System.out.println(account + "\n");
    }

    @Override
    public void activate(Account account) {
        account.setState(new ActiveState());
        System.out.println("[STATE] Account is activated!\n");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("[INFO] Account is already suspended!\n");
    }

    @Override
    public void close(Account account) {
        account.setState(new ClosedState());
        System.out.println("[STATE] Account is closed!\n");
    }
}
 