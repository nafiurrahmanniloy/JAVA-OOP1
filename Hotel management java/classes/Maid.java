package classes;
public class Maid extends Employee{

	private String EducationBG;
	private double salary;
	private String Nationality;
	private String HomeTown;


	public Maid(String EmpID,String Empname,String EducationBG,double salary,String Nationality,String HomeTown){
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
			System.out.println("Maid ID: " + EmpID);
			System.out.println("Maid Empname: " + Empname);
			System.out.println("Maid Education Background : " + EducationBG);
			System.out.println("Maid Salary: " + salary);
			System.out.println("Maid Nationality: " + Nationality);
			System.out.println("Maid HomeTown: " + HomeTown);
		}

}