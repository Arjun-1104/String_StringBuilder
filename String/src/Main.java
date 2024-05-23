public class Main {
    public static void main(String[] args) {
        
        //charector ko uppercase me convert karna
        char ch = 'a';
        System.out.println(Character.toUpperCase(ch));
        
        //string ko string me copy karna
        //method 1 (using + operator)

        String str = "Arjun ";
        String str2 = "Rathore ";
        String str3 = str + str2;

        System.out.println(str3);

        //method 2 (.concat() mathod)
        System.out.println(str.concat(str2));

        //method 3 (StringBuilder & StringBuffer method)
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" world");
        
        System.out.println(stringBuilder.toString());
    
    }
    
}