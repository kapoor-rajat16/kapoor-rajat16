import java.util.Arrays;
import java.util.Scanner;

public class puzzles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int l = 0;
        int h = n-1;
        int diff = Integer.MAX_VALUE;
        int ans = Integer.MAX_VALUE;
        for (int i = h; i < arr.length; i++) {
            if (arr[i]-arr[l]<diff) {
                diff = arr[i]-arr[l];
                ans = diff;
            }
            l++;
        }
        System.out.println(ans);
    }
}
