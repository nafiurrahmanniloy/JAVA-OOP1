// java program to demonstrate restriction on static methods
public class StaticMethodExample
{
// static variable
   static int j = 100;
 
// instance variable
   int n = 200;
 
// static method
   static void a()
   {
   int a = 200;
   System.out.println("Print from a");
 
// Cannot make a static reference to the non-static field b
   n = 100; // compilation error
 
// Cannot make a static reference to the
// non-static method a2() from the type Test
   a2(); // compilation error
 

   }
 
// instance method
   void a2()
   {
   System.out.println("Inside a2");
   }
 
public static void main(String[] args)
{
// main method
}
}