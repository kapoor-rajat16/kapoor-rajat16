// find position of only set bit

// we can also use - log base2 (n) + 1
public class ques477 {
    public static void main(String[] args) {
        int a = 16;
        int i = 1;
        while (true) {
            if ((a & 1) ==1) {
                break;
            }
            a = a>>1;
            i++;
        }
        System.out.println(i);
    }
}
