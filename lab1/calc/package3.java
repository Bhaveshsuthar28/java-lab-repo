package calc;

public class package3 {
    public void sum(float a , float b , float c){
        float sum = a+b+c;
        System.out.println("Sum = " + sum);
    }
    public void avg(float a , float b , float c){
        float avg = (a+b+c)/3;
        System.out.println("avg = " + avg);
    }
    public void multpy(float a , float b , float c){
        float multpy = a*b*c;
        System.out.println("mult = " + multpy);
    }
    public void maximum(float a , float b , float c){
        if(a > b && a>c){
            System.out.println(a + " is larget");
        }
        else if(b > a && b > c){
            System.out.println(b + " is largets");
        }
        else{
            System.out.println(c + " is largets");
        }
    }

    public void minmum(float a , float b , float c){
        if(a < b && a < c){
            System.out.println(a + " is smallest");
        }
        else if(b < a && b < c){
            System.out.println(b + " is smallest");
        }
        else{
            System.out.println(c + " is smallest");
        }
    }
}
