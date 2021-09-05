import java.util.*;

public class presents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b[] = new int[n];
		for(int i=0;i<n;i++)
		{
			int no = arr[i];
			b[no-1] = i;
		}
		
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+1+" ");
    }
}
