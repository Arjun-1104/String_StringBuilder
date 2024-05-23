public class longest_word {
    public static void main(String[] args) {
        String str = "Javaaaaaaaaaaaaaaaa is a programming ";
        //int ans = methodone(str);
        int ans = methodtwo(str);
        System.out.println(ans);
    }
 /* 
    // method one
    public static int methodone(String str) {
        String[] arr = str.split(" ");
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];

            if (max < temp.length()) {
                max = temp.length();
            }
        }
        return max;
    }

}
*/ 
    // method two
public static int methodtwo(String str){
    int max =0;
    int count = 0;
    for(int i=0;i<str.length();i++){
        
        
        if(str.charAt(i) != ' '){
            count++;
        }

        else if(max<count){
                max = count;
            }

        if(str.charAt(i) == ' '){
            count=0;
        }    
    } 

    return max;
}
}

