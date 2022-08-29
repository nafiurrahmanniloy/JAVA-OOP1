
package classes;
import interfaces.*;



public class Hotel implements RoomInterface, EmployeeInterface, GuestInterface
{
	private Room rooms[] = new Room [500];
	private Guest guests[] = new Guest [700];
	private Employee employees[] = new Employee [100];
	
	public Hotel(){
		
	}
	
	
	public boolean addRoom(Room R)
	{
		for(int i=0; i<rooms.length; i++)
		{
			if(rooms[i] == null)
			{
				rooms[i] =R ;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeRoom(Room r)
	{
		for(int i=0; i<rooms.length; i++)
		{
			if(rooms[i] == r)
			{
				rooms[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Room searchRoom(String roomNumber)
	{
		Room a = null;
		for(int i=0; i<rooms.length; i++)
		{
			if(rooms[i] != null)
			{
				if(rooms[i].getRoomNumber().equals(roomNumber))
				{
					return rooms[i];
				}
			}
		}
		return a;
	
	}
	
	public void showAllRooms()
	{
		for(int i=0; i<rooms.length; i++)
		{
			if(rooms[i] != null)
			{
				System.out.println("---------------------------------------------------");
				rooms[i].showDetails();
				
			}
		}
	}
	
	
	public boolean insertGuest(Guest g)
	{
		for(int i=0; i<guests.length; i++)
		{
			if(guests[i] == null)
			{
				guests[i] = g;
				return true;
			}
		}
		return false;
	}
	
	public boolean removeGuest(Guest g)
	{
		for(int i=0; i<guests.length; i++)
		{
			if(guests[i] == g)
			{
				guests[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public Guest searchGuest(double phnNum)
	{
		Guest a = null;
		for(int i=0; i<guests.length; i++)
		{
			if(guests[i] != null)
			{
				if(guests[i].getPhnNumber() == phnNum)
				{
					return guests[i];
				}
			}
		}
		return a;

	
	}
	
	public void showAllGuests()
	{
		for(int i=0; i<guests.length; i++)
		{
			if(guests[i] != null)
			{
				System.out.println("---------------------------------------------------");
				guests[i].showDetails();
				
			}
		}
	}
	
	public boolean insertEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				return true;
			}
		}
		return false;}
	
	public boolean removeEmployee(Employee e)
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				return true;
			}
		}
		return false;}
	
	public Employee searchEmployee(String empId)
	{
		Employee a = null;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEmpID().equals(empId))
				{
					return employees[i];
				}
			}
		}
		return a;
		
	}
	
	public void showAllEmployees()
	{
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				System.out.println("---------------------------------------------------");
				employees[i].showDetails();
				
			}
		}
	}
	
	public void showDetails()
	{
		System.out.println("-------------------------------------------------");
		this.showAllRooms();
		System.out.println("-------------------------------------------------");
		System.out.println();
		this.showAllEmployees();
		System.out.println("-------------------------------------------------");
		
	}	
}