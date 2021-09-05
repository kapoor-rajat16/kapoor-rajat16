import java.util.*;

public class arrivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = 0;
        int minIndex = -1;
        int maxIndex = -1;
        int count = 0;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }

        for (int i = maxIndex; i > 0; i--) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
            count++;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        }
        for (int i = minIndex; i < n - 1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            count++;
        }
        System.out.println(count);
       
    }
}
