package classes;
public class Traveler extends Guest{

	private double passportno;
	private String Nationality;
	public	Traveler(String Name,double phnNumber,double passportno,String Nationality)
	{
		super(Name,phnNumber);
		this. passportno=passportno ;
		this. Nationality=Nationality ;
	}

	public void setpassportno(){
		this.passportno = passportno;
	}
	public void setNationality(){
		this.Nationality=Nationality ;
	}

	public double getpassportno(){return passportno;}
	public String  getNationality(){return Nationality;}
	
	public void showDetails()
	{
		System.out.println("Guest Name: " + Name);
		System.out.println("Guest Phone Number: " + phnNumber);
		System.out.println("Guest Passport Number: " + passportno);
		System.out.println("Guest Nationality: " + Nationality);
		System.out.println();
	}

}