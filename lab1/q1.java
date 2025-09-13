import java.util.Scanner;
import calc.package1;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        float a = sc.nextFloat();
        System.err.println("Enter a number : ");
        float b = sc.nextFloat();
        
        package1 calc = new package1();

        System.out.println("Sum = " + calc.sum(a, b));
        System.out.println("Diff = " + calc.diff(a, b));
        System.out.println("Diff = " + calc.multpy(a, b));
        System.out.println("Diff = " + calc.div(a, b));
        sc.close();
    }
}