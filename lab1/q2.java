import java.util.Scanner;
import calc.package2;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        float a = sc.nextFloat();
        System.err.println("Enter a number : ");
        float b = sc.nextFloat();

        package2 findmaxminequal = new package2();

        findmaxminequal.checkNumber(a, b);
        sc.close();
    }
}
