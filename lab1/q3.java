import java.util.Scanner;

import calc.package3;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        float a = sc.nextFloat();
        System.out.println("Enter a number : ");
        float b = sc.nextFloat();
        System.out.println("Enter a number : ");
        float c = sc.nextFloat();

        package3 task = new package3();

        task.sum(a, b, c);
        task.avg(a, b, c);
        task.multpy(a, b, c);
        task.maximum(a, b, c);
        task.minmum(a, b, c);
        sc.close();
    }
}
