public class _8_remove_duplicates {
    public static void main(String[] args) {

        String str = "aaabbbbccccddddrrrr";
        String ans = duplicate(str);
        System.out.println(ans);
    }
    public static String duplicate(String str){

        StringBuilder sb = new StringBuilder(str);
        for(int i=1;i<sb.length();i++){
            char pre = sb.charAt(i-1);
            char curr = sb.charAt(i);

            if(pre == curr){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }

}

