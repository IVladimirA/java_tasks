public class SimpleBankApp {
    public static void main(String[] args) {
        Account myAccount = new Account(1, 10.5, "My bank account");
        ATM.Out(myAccount);
    }
}
