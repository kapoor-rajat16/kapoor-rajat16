import java.util.*;

public class ques3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int n=sc.nextInt(), l=sc.nextInt(), r=sc.nextInt();
        Integer[] ar=new Integer[n];
        for(int i=0;i<n;i++) ar[i] = sc.nextInt();
            Arrays.sort(ar);
            long ans = 0;
            int st = 0; int en = 0;
            for(int i=n-1;i>=0;i--){
                while (st < n && ar[st] + ar[i]<l) st++;
                while (en < n && ar[en] + ar[i]<=r) en++;
                if(i>=st && i<en) ans--;
                ans+= (en-st);
            }
            System.out.println(ans/2);
        }
    }
}