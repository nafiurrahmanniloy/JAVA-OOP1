import java.lang.*;

public class Customer
{
	int numberofaccount;
	Account accounts[] = new Account[numberofaccount];


	
	
	public Customer(){}
	
	public void addAccount(Account a)
	{
		int flag = 0;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				flag = 1;
				break;
			}
		}
		if(flag == 1){System.out.println("Account Inserted");}
		else {System.out.println("Account Can Not Insert");}
	}
	public void removeAccount(Account a)
	{
		int flag =0;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				flag = 1;
				break;
			}
		}
		if(flag==1){System.out.println("-----Account Succesfully Removed-----");}
		else{System.out.println("-----Accout CanNot be Removed-----");}
	}
	
	public void showAllAccounts()
	{
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				System.out.println("---------------------------------------------------");
				accounts[i].showDetails();
				
			}
		}
	}
}




