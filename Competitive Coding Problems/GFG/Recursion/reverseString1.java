import java.util.Scanner;

public class reverseString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reverse = reverse(s);
        System.out.println(reverse);
    }
    static String reverse(String s){
        if (s.length()==0) {
            return "";
        }
        char c = s.charAt(0);
        String child = reverse(s.substring(1));
        return child + c;
    }
}
