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
        char life = '\u751F';
        System.out.println("Life is " + life);
        System.out.printf("The square of triangle with sides %.2f %.2f %.2f is %.3f\n", a, b, c, Math.sqrt(p * (p - a) * (p - b) * (p - c)));
    }
}
