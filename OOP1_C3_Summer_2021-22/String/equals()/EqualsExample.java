public class EqualsExample{  
public static void main(String args[]){  
String s1="java";  
String s2="java";  
String s3="JAVA";  
String s4="python";  
System.out.println(s1.equals(s2));//true because content and case is same  
System.out.println(s1.equals(s3));//false because case is not same  
System.out.println(s1.equals(s4));//false because content is not same  
}} 