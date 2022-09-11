class A 
{ 
 public void msgA() 
 { 
   System.out.println("Method of class A"); 
 } 
} 
class B extends A 
{ 

 
} 
class C extends A 
{ 


 } 
class D extends A 
{ 
 

 } 
public class MyClass 
{ 
  public static void main(String[] args) 
  { 

    B obj1 = new B(); 
    C obj2 = new C(); 
    D obj3 = new D(); 


    obj1.msgA(); 
    obj2.msgA(); 
    obj3.msgA(); 
  } 
 }