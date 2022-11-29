import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double s1;
        double s2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a");
        a = scanner.nextInt();
        System.out.println("Enter b");
        b = scanner.nextInt();
        System.out.println("Enter c");
        c = scanner.nextInt();
        if ((b * b - 4 * a * c) < 0 || a == 0) {
            System.out.println("no answer");
        } else {
            s1 = (-1 * b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            s2 = (-1 * b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

            if (s1 == s2) {
                System.out.println("there is one resalt  s1=" + s1);
            } else {
                System.out.println("There is tow resalts  s1 =" + s1 + " s2=" + s2);

            }
        }
    }
}




