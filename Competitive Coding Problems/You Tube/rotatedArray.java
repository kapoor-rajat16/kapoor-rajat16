public class rotatedArray {
    public static void main(String[] args) {
        int arr[] = { 120, 130, 45, 50, 90, 100 };
        int key = 90; // we have to find its index in arr
        int ans = bSearch(arr, key);
        System.out.println(ans);
    }

    static int bSearch(int arr[], int key) {
        int l = 0;
        int r = arr.length - 1;
        int m;
        while (l <= r) {

            m = l + (r - l) / 2;
            if (arr[m] == key) {
                return m;
            }
            if (arr[l] < arr[m]) {
                if (key >= arr[l] && key <= arr[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else {
                if (key > arr[m] && key < arr[r]) {
                    l = m - 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return -1;
    }
}
