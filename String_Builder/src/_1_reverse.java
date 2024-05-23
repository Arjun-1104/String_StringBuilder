public class _1_reverse {
    public static void main(String[] args) {

        String str = "Arjun rathore";
        String ans = reverse(str);
        System.out.println(ans);

    }

    public static String reverse(String str){

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb.toString();
    }
}
