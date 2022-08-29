package interfaces;
import java.lang.*;
import classes.Guest;

public interface GuestInterface
{
	boolean insertGuest(Guest gst);
	boolean removeGuest(Guest gst);
	Guest searchGuest(double phnNum);
	void showAllGuests();

}