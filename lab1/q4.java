import java.util.Scanner;
import calc.package4;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();

        package4 Area = new package4();

        Area.area(a);
        sc.close();
    }
}