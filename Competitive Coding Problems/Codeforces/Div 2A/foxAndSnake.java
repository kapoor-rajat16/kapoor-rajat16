import java.util.Scanner;

public class foxAndSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = 1;
        int a = 1;
        for (int i = 0; i < n; i++) {
            if (t==1) {   
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
                t = 0;
            }
            else{
                if (a==1) {
                    
                    for (int j = 0; j < m-1; j++) {
                        System.out.print(".");
                    }
                    System.out.print("#");
                    a = 0;
                }
                else{
                    System.out.print("#");
                    for (int j = 0; j < m-1; j++) {
                        System.out.print(".");
                    }
                    a = 1;
                }
                t = 1;
            }

            System.out.println();
        }
    }
}
