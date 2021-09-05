public class MooreVotingAlgorithm {
    public static void main(String[] args) {
        int arr[] = {1,1,4,5,1,1,5};
        int a= arr[0];
        int f = 1;
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==a) {
                f++;
            }
            else f--;
            if (f==0) {
                a = arr[i];
                index = i;
                f = 1;
            }
        }
        
        f = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[index]) 
                f++;
        }
        if (f>(arr.length/2)) 
        System.out.println(a + " at index " + index);  
    }
}
