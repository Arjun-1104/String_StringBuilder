public class _16_toggle_cases {
    public static void main(String[] args) {

        String str = "afdkjdgdgjkgG";
        String ans = toogleCase(str);
        System.out.println(ans);

    }
    public static String toogleCase(String str){

        StringBuilder sb = new StringBuilder(str);

        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);

            if(ch>='a' && ch<='z'){
                ch = (char)(ch-'a'+'A');

            }
            else if(ch>='A' && ch<='Z'){
                ch = (char)(ch-'A'+'a');
            }
            sb.setCharAt(i,ch);
        }
        return sb.toString();
    }
}
