import java.util.HashSet;
import java.util.Scanner;

public class antonAndLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.length()==2) {
            System.out.println(0);
        }
        else{

            HashSet<Character> set = new HashSet<>();
            
            for (int i = 1; i < s.length(); i+=3) {
                set.add(s.charAt(i));
            }
            System.out.println(set.size());
        }
    
    }
}
