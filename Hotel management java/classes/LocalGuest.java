package classes;
public class LocalGuest extends Guest{

	private double nid;
	private String Nationality;

	public LocalGuest(String Name,double phnNumber,double nid,String Nationality)
	{   
		super(Name,phnNumber);
		
		this. nid=nid;
		this. Nationality=Nationality;

	}

	public void setnidno(){
		this.nid = nid;
	}
	public void setNationality(){
		this.Nationality=Nationality ;
	}

	public double getpassportno(){return nid;}
	public String  getNationality(){return Nationality;}
	
	public void showDetails()
	{
		System.out.println("Guest Name: " + Name);
		System.out.println("Guest Phone Number: " + phnNumber);
		System.out.println("Guest Passport Number: " + nid);
		System.out.println("Guest Nationality: " + Nationality);
		System.out.println();
	}

}