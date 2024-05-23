/*public class _15_compresss_str {
    public static void main(String[] args) {

        String str = "aaaaaeeeeetttttooooouuuuu";
        String ans = compresss(str);
        System.out.println(ans);
    }
    public static String compresss(String str){

        StringBuilder sb = new StringBuilder(str);
        StringBuilder res = new StringBuilder();

        int count = 1;


        for(int i=1;i<sb.length();i++){
            char pre = str.charAt(i-1);
            char curr = sb.charAt(i);

            if(pre != curr) {
                if (count != 1) {
                    res = res + count;
                }
                res = res + curr;
                count = 1;
            }
            else{
                count++;
            }
        }
            if(count != 1){
                res = res + count;
            }

            return
    }
}
*/