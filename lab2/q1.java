import java.util.Scanner;

class cost {
    void money(float a , float b , float c , float d){
        double cost_fuel = a*b;
        System.out.println("Total saving : " + (c -(cost_fuel + d)));
    }
}

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How much mile per day you drive : ");
        int mile_per_day = sc.nextInt();
        System.out.print("How much cost of fuel cost per litre : ");
        int fule_cost = sc.nextInt();
        System.out.print("Avarage fees per day : ");
        int fees = sc.nextInt();
        System.out.print("tolls per day you pay : ");
        int tolls = sc.nextInt();

        cost calc = new cost();
        calc.money(mile_per_day, fule_cost, fees, tolls);
        sc.close();
    }
}
