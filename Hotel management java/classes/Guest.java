
package classes;
import java.lang.*;

public abstract class Guest
{
	public String Name;
	public double phnNumber;
	public Guest(String Name,double phnNumber)
	{
		this.Name =Name;
		this.phnNumber =phnNumber;
	}
	
	public void setName(String Name){this.Name = Name;}
	public void setPhnNumber(double phnNumber){this.phnNumber = phnNumber;}
	
	public String getName(){return Name;}
	public double getPhnNumber(){return phnNumber;}
	
	public void showDetails()
	{
		System.out.println("Guest Name: " + Name);
		System.out.println("Guest Phone Number: " + phnNumber);
		System.out.println();
	}
}