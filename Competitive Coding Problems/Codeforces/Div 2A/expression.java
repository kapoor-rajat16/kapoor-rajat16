import java.util.Scanner;

public class expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a, b);
        max = Math.max(max, c);

        if (a == 1 && b == 1 && c == 1) {
            System.out.println(3);
        } else if (a != 1 && b != 1 && c != 1) {
            System.out.println(a * b * c);
        }

        else if (max == b) {

            if (a == 1 && c != 1) {
                System.out.println((a + b) * c);
            } else if (c == 1 && a != 1) {
                System.out.println(a*(b+c));
            } else {
                System.out.println(a + b + c);

            }
        }

        else if (a == max) {
            if (b == 1 && c == 1) {
                System.out.println(a * 2);
            } else if (b == 1 && c != 1) {
                System.out.println((a *(b+c)));
            } else if (b != 1 && c == 1) {
                System.out.println(a * (b + c));
            }
        }

        else if (c == max) {
            if (a == 1 && b == 1) {
                System.out.println(2 * c);
            } else if (a == 1 && b != 1) {
                System.out.println((a + b) * c);
            } else if (a != 1 && b == 1) {
                System.out.println((a +b) * c);
            }
        }

    }
}