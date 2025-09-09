package calc;

public class package5 {
    public void seprateNumber(int a){
        int i=0;
        int[] arr = new int[5];
        while(a > 0){
            int x = a%10;
            arr[i] = x;
            a /= 10;
            i++;
        }

        System.out.println("size of array = " + i);

        for(int j=4 ; j>=0 ; j--){
            System.out.print(arr[j] + " ");
        }
    }
}
