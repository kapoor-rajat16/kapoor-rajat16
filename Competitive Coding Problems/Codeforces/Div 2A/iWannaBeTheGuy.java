import java.util.*;

public class iWannaBeTheGuy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean[] flag = new boolean[n + 1];
        int p = in.nextInt();
        for (int i = 0; i < p; i++) {
            int temp = in.nextInt();
            flag[temp] = true;
        }
        p = in.nextInt();
        for (int i = 0; i < p; i++) {
            int temp = in.nextInt();
            flag[temp] = true;
        }
        for (int i = 1; i <= n; i++) {
            if (flag[i] == true)
                continue;
            else {
                System.out.println("Oh, my keyboard!");
                return;
            }
        }
        System.out.println("I become the guy.");
    }
}
