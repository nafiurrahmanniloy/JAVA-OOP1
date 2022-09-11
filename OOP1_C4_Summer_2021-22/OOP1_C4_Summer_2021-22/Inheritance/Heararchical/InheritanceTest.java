class ClassA 
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
class ClassB extends ClassA 
{
    public void dispB()
    {
        System.out.println("disp() method of ClassB");
    }
}
class ClassC extends ClassA
{
    public void dispC()
    {
        System.out.println("disp() method of ClassC");
    }
}
class ClassD extends ClassA
{
    public void dispD()
    {
        System.out.println("disp() method of ClassD");
    }
}
public class InheritanceTest 
{
    public static void main(String args[])
    {
        ClassB b = new ClassB();
        b.dispB();
        b.dispA();
        
        ClassC c = new ClassC();
        c.dispC();
        c.dispA();

        ClassD d = new ClassD();
        d.dispD();
        d.dispA();
    }
}