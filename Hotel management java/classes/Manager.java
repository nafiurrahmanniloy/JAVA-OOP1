package classes;

import java.lang.*;
public class Manager extends Employee{

	private String EducationBG;
	private double salary;
	private String Nationality;
	private String HomeTown;

	public Manager(String EmpID,String Empname,String EducationBG,double salary,String Nationality,String HomeTown){
		super(EmpID,Empname);
		this.EducationBG=EducationBG;
		this.salary=salary;
		this.Nationality=Nationality;
		this.HomeTown=HomeTown;
	}

	public void setEduBG (String EducationBG){
	this.EducationBG=EducationBG;
	}

	public void setSalary (double salary){
	this.salary=salary;
	}

	public void setNationality (String Nationality){
	this.Nationality=Nationality;
	}

	public void setHomeTown (String HomeTown){
	this.HomeTown=HomeTown;
	}

	public String getEduBG(){return EducationBG;}

	public double getSalary (){return salary;}
	public String getNationality(){return Nationality;}
	public String getHomeTown(){return HomeTown;}
	
	public void showDetails(){
			System.out.println("Employee ID: " + EmpID);
			System.out.println("Employee Empname: " + Empname);
			System.out.println("Employee Education Background : " + EducationBG);
			System.out.println("Employee Salary: " + salary);
			System.out.println("Employee Nationality: " + Nationality);
			System.out.println("Employee HomeTown: " + HomeTown);
		}
}