import java.util.Arrays;
import java.util.Scanner;

public class devuTheSingerAndChuruTheJoker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        int jokes = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i] + 10;
        }
        sum = sum-10;
        if (sum>d) {
            System.out.println(-1);
        }
        else{
            Arrays.sort(arr);
            jokes = (d-sum)/5;
            for (int i = d - sum; i <= d;) {
                 
            }
        }
    }
}
