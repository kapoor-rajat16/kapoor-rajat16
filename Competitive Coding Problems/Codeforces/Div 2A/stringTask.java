import java.util.Scanner;

public class stringTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='y'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='Y') {
                continue;
            }
            else{
                ans = ans+ "."+s.charAt(i);
            }
        }
        System.out.println(ans.toLowerCase());
    }
}
