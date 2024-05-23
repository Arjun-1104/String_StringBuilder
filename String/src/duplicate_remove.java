/*public class duplicate_remove {
    public static void main(String[] args) {
        
        String str = "Java is a programming language";

        String str2 = "";
        for(int i=0;i<str.length();i++){

            for(int j=0;j<=str2.length();j++){

                if(str.charAt(i) != str2.charAt(j)){

                str2 = str2 + str.charAt(i);

                }
            }
        }
        System.out.println(str2);
    }
}
*/

public class duplicate_remove {
    public static void main(String[] args) {
        String str = "hhheeeellllooo";
        String ans = remove(str);
        System.out.println(ans);
    }

    public static String remove(String str){
        String ans = "" + str.charAt(0);

        for(int i=1;i<str.length();i++){

            char pre = str.charAt(i-1);
            char curr = str.charAt(i);

            if(pre != curr){
                
            }
        }
        return ans;
    }
    
}

