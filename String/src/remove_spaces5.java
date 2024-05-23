import java.util.Arrays;

public class remove_spaces5 {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        char[] str2 = {};
        int itr = 0;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) != ' '){
                str2[itr] = str.charAt(i);
                itr++;
            }

        }
        System.out.println(Arrays.toString(str2));

        //String ans = remove_spaces5(str);
        //System.out.print(ans);
    }
}
/* 
    public static String remove_spaces5(String str){
        char[] str2 = {};
        int itr = 0;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i) == ' '){
                 str2[itr] = str.charAt(i);
                 itr++;
            }  
        }
        return str;
    }
}
*/