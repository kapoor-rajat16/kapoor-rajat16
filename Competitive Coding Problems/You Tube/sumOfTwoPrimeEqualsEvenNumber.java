import java.util.ArrayList;
import java.util.Arrays;

// All even natural numbers are sum of 2 prime numbers 

public class sumOfTwoPrimeEqualsEvenNumber {
    public static void main(String[] args) {
        int A = 10;
        ArrayList<Integer> al = new ArrayList<>();
        boolean arr[] = new boolean[A + 1];
        Arrays.fill(arr, true);
        arr[0] = arr[1] = false;
      
        for (int i = 2; i * i <= A; i++) {
            if (arr[i] == false)
                continue;
            for (int j = 2*i; j <= A; j+=i) {             //IMP

                if (j % i == 0)
                    arr[j] = false;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }
        int t = 0;
        int m = 0;
        for (int i = 2; i < A; i++) {
            if (arr[i] == true) {
                for (int j = A - 1; j >= i; j--) {
                    if (arr[j] == true) {
                        if (j + i == A) {
                            t = 1;
                            m = j;
                            break;
                        } else
                            continue;
                    }
                }
            }
            if (t == 1) {
                al.add(i);
                al.add(m);
                break;
            }
        }
        System.out.println(al);

    }
}
