import java.lang.*;

public class Start
{
	public static void main(String args[])
	{
		Box boxes[] = new Box[10];
		
		Box b1 = new Box();
		b1.setLength(1.5);
		b1.setWidth(1.2);
		b1.setHeight(1.3);
		
		Box b2 = new Box();
		b2.setLength(2.5);
		b2.setWidth(2.1);
		b2.setHeight(2.7);
		
		boxes[0] = b1;
		boxes[2] = b2;
		
		for(int i=0; i<boxes.length; i++)
		{
			if(boxes[i] != null)
			{
				System.out.println("------------------");
				System.out.println("Boxes["+i+"] Length: "+boxes[i].getLength());
				System.out.println("Boxes["+i+"] Width: "+boxes[i].getWidth());
				System.out.println("Boxes["+i+"] Height: "+boxes[i].getHeight());
				System.out.println();
			}
			else
			{
				System.out.println("------------------");
				System.out.println("There is No Object in boxes["+i+"]");
			}
		}
	}
}




