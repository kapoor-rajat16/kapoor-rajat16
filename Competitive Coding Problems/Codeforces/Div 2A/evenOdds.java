import java.util.*;

public class evenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        if (k <= (n / 2) + 1 && (n & 1) == 1) {
            System.out.println(2 * k - 1);
        } else if (k > (n / 2) + 1 && (n & 1) == 1) {
            System.out.println((k - ((n / 2) + 1)) * 2);
        } else if (k <= (n / 2) && (n & 1) != 1) {
            System.out.println(2 * k - 1);
        } else if (k > (n / 2) && (n & 1) != 1) {
            System.out.println(((k - (n / 2)) * 2));
        }

    }
}
