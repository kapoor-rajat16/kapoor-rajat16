public class operatorBit {
    public static void main(String[] args) {
        int n = 14;
        int ans = 0;
        while (n > 0) {
            if ((n & 1) == 0)
                n = n >> 1;
            else
                n--;
            ans++;
        }
        System.out.println(ans);
    }
}
