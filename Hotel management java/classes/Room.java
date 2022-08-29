package classes;

import java.lang.*;

public abstract class Room 
{	
	private String roomNumber;
	
	public Room(){ }
	public Room(String roomNumber)
	{
		this.roomNumber = roomNumber;
	}

	
	public void setRoomNumber(String roomNumber){ this.roomNumber = roomNumber; }
	public String getRoomNumber(){	return roomNumber;}
	
	public abstract void showDetails();
	
	
	
}