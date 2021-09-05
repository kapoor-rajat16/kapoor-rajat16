import java.util.*;

public class teamOlympiad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int maths[] = new int[n];
        int coding[] = new int[n];
        int pe[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = 0;
        int c = 0;
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                maths[m] = i + 1;
                m++;
            } else if (arr[i] == 2) {
                coding[c] = i + 1;
                c++;
            } else if (arr[i] == 3) {
                pe[p] = i + 1;
                p++;
            }
        }

        int count = 0;

        for (int i = 0; maths[i] > 0 && coding[i] > 0 && pe[i] > 0; i++) {
            count++;
        }
        if (count == 0) {
            System.out.println(0);
        } else {

            System.out.println(count);
            for (int i = 0; maths[i] > 0 && coding[i] > 0 && pe[i] > 0; i++) {
                System.out.println(maths[i] + " " + coding[i] + " " + pe[i]);
            }
        }
    }
}



