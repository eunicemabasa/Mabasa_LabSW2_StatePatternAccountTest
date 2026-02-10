public class ClosedState implements AccountState {

    @Override
    public void deposit(Account account, Double amount) {
        System.out.println("[ERROR] You cannot deposit on closed account!");
        System.out.println(account + "\n");
    }

    @Override
    public void withdraw(Account account, Double amount) {
        System.out.println("[ERROR] You cannot withdraw on a closed account!");
        System.out.println(account + "\n");
    }

    @Override
    public void activate(Account account) {
        System.out.println("[ERROR] You cannot activate a closed account!\n");
    }

    @Override
    public void suspend(Account account) {
        System.out.println("[ERROR] You cannot suspend a closed account!\n");
    }

    @Override
    public void close(Account account) {
        System.out.println("[INFO] Account is already closed!\n");
    }
}
