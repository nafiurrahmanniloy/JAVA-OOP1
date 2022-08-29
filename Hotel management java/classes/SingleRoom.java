package classes;
import java.lang.*;

public class SingleRoom extends Room
{
	 static  double singleRoomPrice=1500;
	
	public SingleRoom(){}
	public SingleRoom(String roomNumber)
	{
		super(roomNumber);

	}
	
	
	public void showDetails()
	{
		System.out.println("Room Number: " + this.getRoomNumber());
		System.out.println("Single Room Price: " + singleRoomPrice);
		System.out.println();
	}
}