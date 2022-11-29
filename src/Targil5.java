import java.util.Scanner;

public class Targil5 {
    public static void main(String[] agrs) {
        System.out.println("Enter you num");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num<0){
            System.out.println("please enter postive number");
        }
        else {
            int a = 0 , b=1 , c =0;
            while (c<num){
                c=a+b;
                a=b;
                b=c;
            }

            if (c==num){
                System.out.println("YOUR num appears" );
            }
            else {
                System.out.println("your num is not appears");
            }
        }
    }
}
