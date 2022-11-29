import java.util.Scanner;

public class Targil2
{public static void main(String[] args) {
int x;
int y;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the first member in the series");
    x=scanner.nextInt();
    System.out.println("Enter the  difference in the series");
    y=scanner.nextInt();
    System.out.println("Enter how many members in the series");
    int[] series = new int [scanner.nextInt()];
        for (int i = 0; i < series.length; i++){
            series[i] =x+y*i;
            System.out.println(series[i] );


    }


}
}
