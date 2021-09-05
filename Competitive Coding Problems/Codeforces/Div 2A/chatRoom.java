import java.util.*;

public class chatRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String h = "hello";
        int t = 1;
        for (int i = 0; i < h.length(); i++) {
            int c = s.indexOf(h.charAt(i));
            if (c==-1) {
                t = 0;
                break;
            }
            s = s.substring(c+1);
        }
        if (t==1) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
