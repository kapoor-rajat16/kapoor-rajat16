import java.util.*;

public class beautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[5][5];
        int ans = 0;
        int m = 0,n= 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i][j]==1) {
                    m = i;
                    n = j;
                }
            }
        }

        ans = Math.abs(m-2) + Math.abs(n-2);
        System.out.println(ans);

    }
}
