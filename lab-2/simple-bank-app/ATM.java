public class ATM {
    public static void Out(Account account) {
        System.out.println("Customer id: " + Integer.toString(account.getCustomer()));
        System.out.println("Balance: " + Double.toString(account.getBalance()));
        System.out.println("Details: " + account.getDetails());
    }
}