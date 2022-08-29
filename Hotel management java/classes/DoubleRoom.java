package classes;
import java.lang.*;

public class DoubleRoom extends Room
{
	 static double DoubleRoomPrice=2200;
	
	public DoubleRoom(){}
	public DoubleRoom(String roomNumber)
	{
		super(roomNumber);
		
	}
	


	public void showDetails()
	{
		System.out.println("Room Number: " + this.getRoomNumber());
		System.out.println("Double Room Price: " + DoubleRoomPrice);
		System.out.println();
	}
}