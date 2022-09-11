public class LengthExample2 {  
    public static void main(String[] args) {  
        String str = "JAVA";  
        if(str.length()>0) {  
            System.out.println("String is not empty and length is: "+str.length());  
        }  
        str = "";  
        if(str.length()==0) {  
            System.out.println("String is empty now: "+str.length());  
        }  
    }  
}  