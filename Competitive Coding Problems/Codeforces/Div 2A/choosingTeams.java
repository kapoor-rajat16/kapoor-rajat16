import java.util.*;

public class choosingTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i]>=k) {
                p++;
            }
        }
        if (p<3) {
            System.out.println(0);
        }
        else{
            System.out.println(p*(p-1)*(p-2));
        }
    }   
}
