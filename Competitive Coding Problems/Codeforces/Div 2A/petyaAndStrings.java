import java.util.Scanner;

public class petyaAndStrings{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        a = a.toLowerCase();
        b = b.toLowerCase();
        int t = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)>b.charAt(i)) {
                t = 1;
                System.out.println(t);
                break;
            }
            else if(a.charAt(i)<b.charAt(i)){
                t = -1;
                System.out.println(t);
                break;
            }
        }
        if (t==0) {
            System.out.println(t);
        }
    }
}