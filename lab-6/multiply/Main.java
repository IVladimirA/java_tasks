import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = 0;
        if (cin.hasNextInt()) {
            a = cin.nextInt();
        }
        System.out.println((a << 3) + (a << 1));
        cin.close();
    }
}
