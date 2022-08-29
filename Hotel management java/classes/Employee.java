package classes;
import java.lang.*;

	public abstract class Employee
	{
	public String EmpID;
	public String Empname;

	public Employee(String EmpID,String Empname){
		this.EmpID=EmpID;
		this.Empname=Empname;

	}

	public void setEmpID(String EmpID){
		this.EmpID = EmpID;
	}
	public void setEmpname(String Empname){
		this.Empname = Empname;
	}



	public String getEmpID(){return EmpID;}
	public String getEmpname(){return Empname;}





	public void showDetails(){
			System.out.println("Maid ID: " + EmpID);
			System.out.println("Maid Empname: " + Empname);

		}
}
