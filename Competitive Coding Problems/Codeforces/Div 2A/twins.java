import java.util.*;

public class twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        sum = sum>>1;
        int count = 0;
        int biggerSum = 0;
        for (int i = n-1; i >= 0; i--) {
            biggerSum += arr[i];
            count++;
            if (biggerSum>sum) {
                break;
            }
        }
        System.out.println(count);
    }
}
