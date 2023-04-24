public class GuessingGame {
    public static void main(String[] args) {
        if (args.length == 0 || args[0] == "help") {
            System.out.println("Exactly one argument required: integer from 1 to 5.");
            return;
        }
        int randomNum = (int)(Math.random() * 5 + 1);
        int guess = Integer.parseInt(args[0]);
        if (guess < 1 || guess > 5) {
            System.out.println("Integer argument must be from 1 to 5.");
            return;
        }
        if (guess == randomNum) {
            System.out.println("Congradulations! You guessed it right!");
            return;
        }
        System.out.println("Sorry; try again");
    }
}
