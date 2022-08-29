package interfaces;
import java.lang.*;
import classes.Room;


public interface RoomInterface
{
	boolean addRoom(Room r);
	boolean removeRoom(Room r);
	Room searchRoom(String roomNumber);
	void showAllRooms();
}