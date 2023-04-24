import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter triangle sides (one on each line):");
        double a = 0;
        if (cin.hasNextDouble()) {
            a = cin.nextDouble();
        }
        double b = cin.nextDouble();
        double c = cin.nextDouble();
        cin.close();
        double p = (a + b + c) / 2;
        System.out.println("The square of triangle is " + Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}
