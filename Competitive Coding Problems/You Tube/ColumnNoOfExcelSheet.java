public class ColumnNoOfExcelSheet {
    public static void main(String[] args) {
        String A = "AAA";
        int ans = 0;
        int l = A.length();
        for(int i = 0;i < l;i++){
            ans = ans + (A.charAt(l-i-1)-64)*(int)(Math.pow(26,i)) ;
        }
        System.out.println(ans);
    }
}
