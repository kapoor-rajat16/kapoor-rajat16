import java.util.*;

public class ques2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {

            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (n == 1) {
                System.out.println(0);
               
            }
            else{

            
            int ans = 0;
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + arr[i];
            }
            if (sum % n != 0) {
                System.out.println(-1);
            } else {
                int each = sum / n;

                for (int i = 0; i < n; i++) {
                    if (arr[i] > each) {
                        ans++;
                    }
                }
                System.out.println(ans);
            }
        }           
        }
    }
}
