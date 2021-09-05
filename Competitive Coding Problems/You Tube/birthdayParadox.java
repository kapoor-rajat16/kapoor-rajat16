import java.util.Scanner;

public class birthdayParadox{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p =sc.nextDouble();
        int n = 0;
        double z = -1.0;
        int m = 365;
        double k = 1;
        while (z<p) {
            k = k * m/365;
            z = 1 - k;
            m--;
            n++;
        }
        System.out.println(n);
    }
}