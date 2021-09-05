public class noToExcelColumn {
    public static void main(String[] args) {
        int A = 943566;
        String s = "";
        int x;
        while (A>0) {
            char c = (char)((int)'A' + (A-1)%26);
            s =  c + s;
            A = (A-1) / 26;
        }
int h  = Integer.MAX_VALUE;
        System.out.println(s);
    }
}
