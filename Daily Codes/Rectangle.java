import java.util.*;
public class Rectangle{
 float length,width;
 private Rectangle( ){ }
 public Rectangle(float L, float W){
 length=L;
 width=W;
 }
 public static void main(String [ ]error){
 Rectangle r1 = new Rectangle( );
 Rectangle r2 = new Rectangle(1.0f,2.0f);
 System.out.println(r2.length+" "+r2.width);
 }
}
