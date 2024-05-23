public class remove_space {
    public static void main(String[] args) {
        String str = "I love java";
        String ans = remove_space(str);
        System.out.println(ans);;

    }
    static String remove_space(String str){
        String ans = "";
        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch != ' '){
                ans += ch;
            }
        }
        return ans;
    } 
}
