import java.util.*;

public class lunchBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[] = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum <= n) {
                    count++;
                } else
                    break;
            }
            System.out.println(count);
           
        }
    }

}