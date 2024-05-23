public class _2_palindrome {
    public static void main(String[] args) {

        String str = "abcba";
        boolean ans = palindrome(str);
        System.out.println(ans);
    }
    public static boolean palindrome(String str){

        StringBuilder sb = new StringBuilder(str);
        int s=0;
        int e=sb.length()-1;

        while(s<e) {
            if (sb.charAt(s) != sb.charAt(s)) {
                return false;
            }
            s++;
            e--;
        }

        return true;
    }
}
