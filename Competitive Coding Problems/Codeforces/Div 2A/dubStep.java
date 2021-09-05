import java.util.Scanner;

public class dubStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";

        String arr[] = s.split("WUB");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != " ")
                ans = ans + arr[i] + " ";
        }
        System.out.println(ans.trim());
    }
}