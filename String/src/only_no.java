public class only_no {
    public static void main(String[] args) {
        String str ="9584235040";
        boolean ans = check(str);
        System.out.println(ans);
    }

        public static boolean check(String str){
    

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch >='0' && ch<='9'){
            
            }
            else{
                return false;
            }
        }
        return true;
    }
}
