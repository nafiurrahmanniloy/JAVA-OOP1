class JavaExample{
   private static String str = "BeginnersBook";

   //Static class
   static class MyNestedClass{
	//non-static method
	public void disp() {

	   /* If you make the str variable of outer class
	    * non-static then you will get compilation error
	    * because: a nested static class cannot access non-
	    * static members of the outer class.
	    */
	   System.out.println(str); 
	}

   }
   public static void main(String args[])
   {

	JavaExample.MyNestedClass obj = new JavaExample.MyNestedClass();
	obj.disp();
   }
}