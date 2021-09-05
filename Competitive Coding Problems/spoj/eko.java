import java.util.*;

public class eko {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        int l = 0;
        int h = max;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            int x = 0;
            for (int i = 0; i < n; i++) {
                x = x + Math.max(0, (arr[i] - mid));
            }
            if (x == m) {
                ans = mid;
                break;
            } else if (x > m) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }

        }
        System.out.println(ans);
    }
}