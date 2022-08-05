import java.lang.*;

public class Account {

	public int AccountNo;
	public String name;
	public double balance;

	public Account() {}

	public Account(int AccountNo, String name, double balance) {
		this.AccountNo = AccountNo;
		this.name = name;
		this.balance = balance;
	}

	public void setacno(int AccountNo) {
		this.AccountNo = AccountNo	;
	}

	public int getacon() {
		return AccountNo;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void show(int no) {

	}

	public void addBalance(double amount) {
		this.balance += amount;
	}

	public void withdrawBalance(double amount) 
	{
							

		if(amount<balance)
		{
			this.balance-=amount;
		}
		else {
					System.out.println("insufficient balance");

		}
		
	}

	public void transferBalance(int accno,double amount) 
	{

		
	}

	public void showDetails()
	{
		System.out.println("Account Number: "+AccountNo);
		System.out.println("Account Holder Name: "+name);
		System.out.println("Balance: "+balance);
	}

}