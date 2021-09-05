import java.util.Arrays;
import java.util.Scanner;

public class PRATA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int z = 0; z < t; z++) {

            int prata;
            int chef;
            prata = sc.nextInt();
            chef = sc.nextInt();
            int rank[] = new int[chef];
            for (int i = 0; i < chef; i++) {
                rank[i] = sc.nextInt();
            }
            Arrays.sort(rank);

            int l = 1;
            int h = 5;
            int mid;
            int ans = 0;
            while (l <= h) {
                mid = l + (h - l) / 2;

                int tim = 0;
                int p = 0;
                int total_prata = 0;

                for (int j = 0; j < chef; j++) {
                    tim = 0;
                    p = 0;
                    int m = 1;
                    while (tim <= mid) {
                        int s = rank[j];
                        s = s * m;
                        tim = tim + s;
                        if (tim > mid) {
                            break;
                        }
                        p++;
                        m++;
                    }
                    total_prata = total_prata + p;
                }

                if (total_prata >= prata) {
                    h = mid - 1;
                    ans = mid;
                } else {
                    l = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }
}
