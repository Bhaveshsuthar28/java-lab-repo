import java.util.Scanner;

class invoice{
    String itemName , dispcriptions ;
    int quantity ;
    float price;
    invoice(String itemName , String Discription , int quantity , float price){
        this.itemName = itemName;
        this.dispcriptions = Discription;
        this.quantity = quantity;
        this.price = price;
    }

    void display(){
        System.out.println("Items Name : " + itemName);
        System.out.println("Discriptions of product : " + dispcriptions);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price per items : " + price);
        System.err.println("TOtal : " + (quantity * price));
    }
}

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Item name : ");
        String itemname = sc.nextLine();
        System.out.print("Discription : ");
        String dis = sc.nextLine();
        System.out.print("Quantity : ");
        int Quantity = sc.nextInt();
        System.out.print("price : ");
        float price = sc.nextFloat();
        System.out.println("\n\n");

        invoice in = new invoice(itemname, dis, Quantity, price);

        in.display();
        sc.close();
    }
}
