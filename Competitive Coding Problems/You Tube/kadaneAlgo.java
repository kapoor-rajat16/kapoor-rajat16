// find max sum subarray
public class kadaneAlgo{
    public static void main(String[] args) {
        // int arr[] = {-5,4,6,-3,4,-1};
        int arr[] = {-5,-4,-6,-3,-4,-1};
        int maxsum = 0;
        int cursum = 0;
        for (int i = 0; i < arr.length; i++) {
            cursum = cursum + arr[i];
            if (cursum>maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        if (maxsum!=0) {
            System.out.println(maxsum);
        }
        else{
            maxsum = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i]>maxsum) {
                    maxsum = arr[i];
                }
            }
            System.out.println(maxsum);
        }
            
    }
}