import java.util.*;

public class ques101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("enter sorted array");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();

        }
        int a = sc.nextInt();
        func(a, arr);
    }

    static void func(int a, int arr[]) {
        int l = 0;
        int m;
        int r = arr.length - 1;
        int f = -1;
        int first = f;
        int last = f;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (arr[m] == a) {
                f = m;
                break;
            } else if (a > arr[m]) {
                l = m + 1;
            } else
                r = m - 1;
        }
        if (f==-1) {
            System.out.println("Element not found");
        }
        else{
            for (int i = f-1; i >= 0; i--) {
                if (arr[i] == a){
                    first = i;
                    continue;
                }
                break;
            }
            for (int i = f+1; i < arr.length; i++) {
                if (arr[i] == a) {
                    last = i;
                    continue;
                }
                break;
            }
        }
        System.out.println(first+" "+last);
    }
}
