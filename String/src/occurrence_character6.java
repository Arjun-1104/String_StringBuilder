public class occurrence_character6 {
    public static void main(String[] args) {

        String str = "Java is a programming language";

        int fi = 0;
        int li = 0;
        char ch = 'a';
        boolean flag = true;

        for(int i=0;i<str.length();i++){

            if((str.charAt(i) == ch) && flag){
                fi = i;
                li = i;
                flag = false;
            }
            else if(str.charAt(i) == ch){
                li = i;
            }
        }  
        System.out.println(fi+" "+li);     
        System.out.println("String length:"+str.length());
    }
}
