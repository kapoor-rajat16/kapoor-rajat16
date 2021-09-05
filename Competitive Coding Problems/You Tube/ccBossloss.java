import java.util.*;


public class ccBossloss
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T > 0){
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    int l = 1;
		    int r = n;
		    int mid;
		    int ans = -1;
		    int v;
		    int t = 0;
		    while(l<=r){
		        mid = l+(r-l)/2;
		        v = mid*(mid+1)/2;
		        if(v == m){
		            System.out.println(mid);
		            t =1;
		            break;
		        }
		        else if(m > v){
		            l = mid +1;
		        }
		        else{
		            ans = mid;
		            r = mid-1;
		        }
		        
		    }
		    if(t==0)
		    System.out.println(ans);
		    T--;
		}
	}
}
