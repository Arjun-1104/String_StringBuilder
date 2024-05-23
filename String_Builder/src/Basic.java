public class Basic {
    public static void main(String[] args) {

        //create
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);

        //append()
        //sb.append('c');
        //sb.append("d");
        sb.append(" java");
        System.out.println(sb);

        //insert()
        sb.insert(0,"Arjun ");
        System.out.println(sb);

        //delete
       // sb.delete();
        System.out.println(sb);

        //delete charAt();
      //  sb.deleteCharAt(8);
        System.out.println(sb);

        //replace()
        sb.replace(0,6,"qwert");
        System.out.println(sb);
    }
}
