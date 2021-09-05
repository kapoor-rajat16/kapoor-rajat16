import java.util.Scanner;

public class parkingLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] n = new int[t];
        int[] m = new int[t];
        for (int i = 0; i < t; i++) {
            n[i] = sc.nextInt();
            m[i] = sc.nextInt();
        }
        int i = 0;
        while (i < t) {

            if ((m[i] & 1) == 0) { // if m is even
                int ans = n[i] * (m[i] / 2);
                System.out.println(ans);
            } else {// if m is odd
                int ans = (int) (n[i] * ((m[i] - 1) / 2) + Math.ceil((double) n[i] / 2));
                System.out.println(ans);
            }
            i++;
        }
    }
}
