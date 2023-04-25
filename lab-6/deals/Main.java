public class Main {
    public static void main(String[] args) {
        Human alice = new Human("Alice", "White", 1, 100.0);
        Human bob = new Human("Bob", "Black", 2, 120.0);
        Deal first = new Deal(1, 2);
        first.addItem("Magazine", 4.99, 3);
        alice.balance += first.total();
        bob.balance -= first.total();
        Deal second = new Deal(2, 1);
        second.addItem("Headphones", 14.99, 2);
        second.addItem("Cap", 9.99, 1);
        alice.balance -= second.total();
        bob.balance += second.total();
        System.out.println("Alice's balance after 2 deals: " + alice.balance);
        System.out.println("Bob's balance after 2 deals: " + bob.balance);
    }
}
