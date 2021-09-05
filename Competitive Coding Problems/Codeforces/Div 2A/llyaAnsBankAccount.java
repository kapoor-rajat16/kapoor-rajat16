import java.util.*;

public class llyaAnsBankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int x = a;
        if (a>=0) {
            System.out.println(a);
        }
        else{
            int one = a/10;
            int two = a/100;
            two = two*10 + (a%10);
            System.out.println(Math.max(one, two)); 
        }
    }
}
