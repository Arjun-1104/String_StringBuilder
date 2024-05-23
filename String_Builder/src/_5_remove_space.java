public class _5_remove_space {
    public static void main(String[] args) {

        String str = "Java is a programming language";
        String ans = removeSpace(str);
        System.out.println(ans);

    }
    public static String removeSpace(String str){
        StringBuilder sb = new StringBuilder(str);

        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);

            if(ch == ' '){
                sb.deleteCharAt(i);
            }
        }
        return sb.toString();
    }
}
