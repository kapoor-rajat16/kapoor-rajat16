import java.util.*;

public class pashmakAndGarden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        if (y1 == y2) {
            System.out.println(x2 + " " + Math.abs(y1-y2) + " " + x1 + " " + y2);

        } else if (x1 == x2) {
            System.out.println(x2 + " " +Math.abs(y1-y2)+ " " + x1 + " " + y2);

        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            System.out.println(x2 + " " + y1 + " " + x1 + " " + y2);
        } else
            System.out.println(-1);
    }
}
