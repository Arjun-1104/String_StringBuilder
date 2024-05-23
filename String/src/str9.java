
import java.util.Arrays;

public class str9 {
    public static void main(String[] args) {
        String str = "Hello world programming ddggngjffdgd";

        int[] arr = new int[26];

        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            
            if(ch>='a' && ch<='z'){
                int idx = (int) (ch-'a');
                arr[idx] = arr[idx] +1;
            }
            else if(ch>='A' && ch<='Z'){
                int idx = (int) (ch-'A');
                arr[idx] = arr[idx] + 1;
            }
            
        }

        System.out.println(Arrays.toString(arr));

        int max = 0;
        int smax =0;

        for(int i=0;i<arr.length;i++){
            if(arr[max]<arr[i]){
                smax = max;
                max = i;
            }
            else if(arr[smax]<arr[i]){
                smax = i;

            }
        }
        
        char c = (char)('a' + smax);

        System.out.println(c);

    }
}
