import java.util.*;

public class cheapTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        if ((b / m) >= a) {
            ans = n * a;
        } else {
            int costspecial = (n / m) * b;
            int left = n % m;
            ans = costspecial + Math.min(left * a, b);
        }
        System.out.println(ans);
    }
}