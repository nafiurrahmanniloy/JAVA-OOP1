public class StringInJava {
    public static void main(String[] args) {

//        char[] name = {'N', 'A', 'Y', 'E', 'M'};
//        String name3 = new String(name);
//        String name2 = name3;

        String str = "Java is Awesome";
        String str3 = "Java is Awesome";

        String str2 = new String("java is awesome");
        String str4 = new String("Java is Awesome");

        System.out.println(str2.equalsIgnoreCase(str));
    }
}
