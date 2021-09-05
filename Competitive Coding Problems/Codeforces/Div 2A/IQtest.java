import java.util.Arrays;
import java.util.Scanner;

public class IQtest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int countOdd = 0;
        int countEven = 0;
        int lastOdd = -1;
        int lastEven = -1;

        for (int i = 0; i < n; i++) {
           if ((arr[i]%2)==0) {
               countEven++;
               lastEven = i+1;
           }
           else{
               countOdd++;
               lastOdd = i+1;
           }
        }


        if (countOdd==1) System.out.println(lastOdd);
        else System.out.println(lastEven);
        
    }
}