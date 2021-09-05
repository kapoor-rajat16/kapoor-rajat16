import java.util.*;

public class dreamoonAndStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int t = 0;
        int minSteps = n/2 + n%2;
        if (minSteps%m == 0) {
            System.out.println(minSteps);
            t = 1;
        }
        else{
            for (int i = minSteps+1; i <= n; i++) {
                if (i%m==0) {
                    System.out.println(i);
                    t = 1;
                    break;
                }
            }
        }
        if (t==0) {
            System.out.println(-1);
        }
    }
}
