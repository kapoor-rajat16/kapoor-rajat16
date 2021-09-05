import java.util.*;

public class ques1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int ans = 0;
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int minIndex = 0;
            int maxIndex = 0;
            int min = arr[0];
            int max = arr[0];
            for (int j = 1; j < n; j++) {
                if (arr[j] > max) {
                    maxIndex = j;
                    max = arr[j];
                }
                if (arr[j] < min) {
                    minIndex = j;
                    min = arr[j];
                }
            }

            int p = n / 2;
            if (maxIndex >= p && minIndex >= p) {
                ans = n - Math.min(minIndex, maxIndex);
            } else if (maxIndex <= p && minIndex <= p) {
                ans = Math.max(minIndex, maxIndex) + 1;
            } else {
                if (maxIndex > minIndex) {
                   int ans1 = minIndex + 1 + n - maxIndex;
                   int ans2 = maxIndex+1;
                   int ans3 = n-minIndex;
                   int ansm= Math.min(ans1, ans2);
                   ans = Math.min(ansm, ans3); 

                } else {
                    int ans1 = maxIndex + 1 + n - minIndex;
                    int ans2 = minIndex+1;
                    int ans3 = n-maxIndex;
                    int ansm= Math.min(ans1, ans2);
                    ans = Math.min(ansm, ans3); 
                    
                }
            }
            System.out.println(ans);
        }

    }
}