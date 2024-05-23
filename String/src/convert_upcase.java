public class convert_upcase {
    public static void main(String[] args) {
        
        String str = "java is a programming language";

        String ans = method1(str);
      //  String ans2 = method2(str);
        System.out.println(ans);
      //  System.out.println(ans2);

    }

    public static String method1(String str){

        
            String ans = "";
            String[] arr = str.split(" ");

            for(int i=0;i<arr.length;i++){

                String s = arr[i];
                char fc = s.charAt(0);

                if(fc>='A' && fc<='Z'){
                    ans += s+ " ";

                }
                else{
                    fc = (char)(fc - 'a' + 'A');
                    
                    String rem = ""+fc;

                    for(int j=1;j<s.length();j++){
                        rem  = rem + s.charAt(j);
                    }

                    ans+= rem +" ";
            }  
            }

            return ans;
        }
    }
/* 
        public static String method2(String str){
            String ans2 = "";
            char fc = str.charAt(0);

            if(fc>='a' && fc<='z'){
                fc = (char) (fc-'a'+'A');
            }

            ans2 = ans2+fc;

            for(int i=1;i<str.length();i++){
                char pre = str.charAt(i-1);
                char curr = str.charAt(i);

                if(pre==' '&& curr>='a' && curr<='z'){
                    curr = (char) (curr-'a'+'A');
                }

                ans2+=curr;

            }
            return ans2;
        }
    } 
    
*/