import java.util.Scanner;

public class JosephusProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int ans = JP(n,k);
        System.out.println(ans);
    }
    static int JP(int n,int k){
        if (n==1)
        return 0; 
            
        return((JP(n-1, k)+k)%n);
    }
}
