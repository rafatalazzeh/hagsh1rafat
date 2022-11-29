import java.util.Scanner;

public class Targil6 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
       int a = scanner.nextInt();
       int sum = 0;
        while (a>0){
          int   b = a%10;
            sum = sum + b;
             int c = a/10;
            a=c;

        }
        System.out.println("The sum is"+sum);
    }
}
