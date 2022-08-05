import java.lang.*;


public class FixedAccount extends Account
{
	private int tenureYear;

		public FixedAccount(int AccountNo,String name,double balance,int tenureYear){
		super(AccountNo,name,balance);
		
		this.tenureYear=tenureYear;
	}

 
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear = tenureYear;
	}
	public int getTenureYear()
	{
		return tenureYear;
	}
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Tenure Year: "+tenureYear);
	}
}