import java.util.ArrayList;

//All other nos occurs 2 times except these 2, find them

public class FindTwoNumbersInArray {

    public static void main(String args[]) {
        int nums[] = new int[6];
        nums[0] = 2;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 6;
        nums[4] = 5;
        nums[5] = 6;
        int a = 0;
        for (int i = 0; i < nums.length; i++) {
            a = a ^ nums[i];
        }
        a = a & (-a);
        int x = 0;
        int y = 0;
        for (int k = 0; k < nums.length; k++) {
            if ((nums[k]&a)>0) {    //imp
                x = x^nums[k];
            }
            else
            y = y ^ nums[k];
        }

        int arr[] = new int[2];
        arr[0] = x;
        arr[1] = y;

        System.out.println(arr[0] + " " + arr[1]);
    }
}
