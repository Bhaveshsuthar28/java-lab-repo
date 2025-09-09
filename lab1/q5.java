import java.util.Scanner;

import calc.package5;

public class q5 {
    public static void main(String[] args) {
        System.out.println("enter a 5 digits number (compulsary) : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        package5 sep = new package5();

        sep.seprateNumber(a);
        sc.close();
    }
}
