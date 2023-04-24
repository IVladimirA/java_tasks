/**
Объект класса <code> Account </code> имитирует банковский счет 
*/
public class Account {
    private double balance = 0;
    private int customer;
    public String details;

    public Account(int owner, double money, String info) {
        customer = owner;
        balance = money;
        details = info;
    }

    public Account(int owner, double money) {
        customer = owner;
        balance = money;
        details = "";
    }

    /**
    Метод <em> getBalance <em> возвращает величину денег на счете
    @return double balance - количество денег
    */
    public double getBalance() {
        return balance;
    }

    /**
    Метод <em> deposit <em> обеспечивает добавление денег на счет
    @param amount величина добавления
    */
    public void deposit(double amount) {
        balance += amount;
    }
    
    /**
    Метод <em> withdraw <em> обеспечивает снятие денег со счета
    */
    public void withdraw(double amount) {
        balance -= amount;
    }

    public int getCustomer() {
        return customer;
    }

    public String getDetails() {
        return details;
    }
}
