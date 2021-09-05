import java.util.Scanner;

public class gameWithSticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = 0;
        while (true) {
            n--;
            m--;
            if (n == 0)
                break;
            if (m == 0)
                break;
            c++;
        }
        if ((c & 1) == 0)
            System.out.println("Akshat");
        else
            System.out.println("Malvika");

    }
}
