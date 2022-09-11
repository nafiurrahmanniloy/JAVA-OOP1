package classes;

import java.lang.*;
import java.util.Scanner;
import interfaces.*;
import fileio.*;

public class StudentDatabase extends Student implements StudentManagement{

	int usr;

    Scanner s = new Scanner(System.in);
    int i = 0, c = 0, r = 0;

	StudentReadWrite srw = new StudentReadWrite();
	
    public StudentDatabase() {
        name = new String[10];
        sid = new int[10];
		sdepartment = new String[10];
    }

    public void add(int usr) {
        this.usr = usr;
        for (i = 0; i < usr; i++) {
			try{
            System.out.println("Enter Student Name : ");
            name[i] = s.next();
			System.out.println("Enter Student ID : ");
            sid[i] = s.nextInt();
			System.out.println("Enter Student Department : ");
			sdepartment[i] = s.next();
			}
			catch (Exception exp){
				System.out.println(exp);
			}
			srw.writeInFile("\n NAME : "+name[i]+ "\n STUDENT ID : "+sid[i]+"\n DEPARTMENT : "+sdepartment[i]);
        }
        showInfo();

    }

    public void search() {

        System.out.println("Enter Student ID : ");
        r = s.nextInt();
        for (i = 0; i < sid.length; i++) {
            if (sid[i] == r) {
                break;
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("---DETAILS OF THE SPECIFIED STUDENT IS---");
        System.out.println("NAME        STUDENT ID        DEPARTMENT");
        System.out.print(name[i]+"         ");
        System.out.print(sid[i]+"         ");
		System.out.print(sdepartment[i]);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");    
       

    }

    public void delete() {
        System.out.println("Enter Student ID : ");
        r = s.nextInt();

        for (i = 0; i < sid.length; i++) {
            if (sid[i] == r) {
                sid[i] = 0;
                name[i] = " ";
            }
        }
        showInfo();

    }

    public void update() {
        System.out.println("Enter the Student ID");
        r = s.nextInt();

        for (i = 0; i < sid.length; i++) {
            if (sid[i] == r) {
                System.out.println("Enter the new name and sid no");
                name[i] = s.next();
                sid[i] = s.nextInt();
            }
        }
        showInfo();
    }

    public void showInfo() {
        System.out.println("---UPDATED STUDENT DETAILS---");
        System.out.println("NAME        STUDENT ID        DEPARTMENT");
        for (i = 0; i < sid.length; i++) {
            if(sid[i]!=0)
            {              
            System.out.print(name[i]+"         ");
			System.out.print(sid[i]+"         ");
			System.out.print(sdepartment[i]);	
            System.out.println(" ");
            }
        }
    }
}