import java.util.*;

public class euclidAlgo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        GCD obj = new GCD();
        int ans = obj.gcd(a, b);
        System.out.println(ans);
    }
}

class GCD {
    int gcd(int a, int b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
