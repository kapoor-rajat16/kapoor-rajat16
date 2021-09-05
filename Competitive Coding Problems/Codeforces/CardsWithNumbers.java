import java.util.*;

public class CardsWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[2*n];
        for (int i = 0; i < 2*n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = new int[2*n];
        int index = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for (int i = 0; i < 2*n; i++) {
            if (h.containsKey(arr[i])) {
                ans[index] = i+1;
                index = index+1;
                ans[index] = h.get(arr[i]);
                index++;
                h.remove(arr[i]);
            }
            else
            h.put(arr[i], i+1);
            
        }
        if (h.size()!=0) {
            System.out.println(-1);
        }
        else{
            for (int i = 0; i < ans.length;) {
                System.out.print(ans[i] + " ");
                i++;
                if ((i&1)==0 && i !=0) {
                    System.out.println();
                }
            }
        }
    }
}
