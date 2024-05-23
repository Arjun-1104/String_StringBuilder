public class palingdrom {
    public static void main(String[] args) {

        String str = "namun";
        boolean flag = true;
        int s = 0;
        int e = str.length()-1;

        while(s<e){
            
            if(str.charAt(s) != str.charAt(e)){
                flag = false;
                break;
            }
            s++;
            e--;
        }
        System.out.println(flag);
    }
}
/* 
class Solution{
    int isPalingdrom(string S){

int start = 0;
int end = S.length()-1;
while(start<end){
    char st = S.charAt(start);
    char e = S.charAt(end);

    if(st!=e){
        return 0;

    }
    start++;
    end--;
}
retrun 1;
}
}
*/