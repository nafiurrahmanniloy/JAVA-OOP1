package classes;

import java.lang.*;
import java.util.Scanner;
import interfaces.*;
import fileio.*;

public class FacultyDatabase extends Faculty implements FacultyManagement{

	int usr;

    Scanner s = new Scanner(System.in);
    int i = 0, c = 0, r = 0;
	
	FacultyReadWrite frw = new FacultyReadWrite();

    public FacultyDatabase() {
        name = new String[10];
        fid = new int[10];
		fdepartment = new String[10];
    }

    public void add(int usr) {
        this.usr = usr;
        for (i = 0; i < usr; i++) {
			
			System.out.println("Enter Faculty Name : ");
            name[i] = s.next();
			System.out.println("Enter Faculty ID : ");
            fid[i] = s.nextInt();
			System.out.println("Enter Faculty Department : ");
			fdepartment[i] = s.next();
			
			frw.writeInFile("\n NAME : "+name[i]+ "\n STUDENT ID : "+fid[i]+"\n DEPARTMENT : "+fdepartment[i]);

        }
        showInfo();

    }

    public void search() {

        System.out.println("Enter Faculty ID");
        r = s.nextInt();
        for (i = 0; i < fid.length; i++) {
            if (fid[i] == r) {
                break;
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("---FACULTY DETAILS---");
        System.out.println("NAME        FACULTY ID        DEPARTMENT");
        System.out.print(name[i]+"         ");
        System.out.print(fid[i]+"         ");
		System.out.print(fdepartment[i]);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");    
       
    }

    public void delete() {
        System.out.println("Enter Faculty ID");
        r = s.nextInt();

        for (i = 0; i < fid.length; i++) {
            if (fid[i] == r) {
                fid[i] = 0;
                name[i] = " ";
            }
        }
        showInfo();

    }

    public void update() {
        System.out.println("Enter Faculty ID");
        r = s.nextInt();

        for (i = 0; i < fid.length; i++) {
            if (fid[i] == r) {
            System.out.println("Enter New Faculty Name : ");
            name[i] = s.next();
			System.out.println("Enter New Faculty ID : ");
            fid[i] = s.nextInt();
			System.out.println("Enter New Faculty Department : ");
			fdepartment[i] = s.next();
            }
        }
        showInfo();
    }

    public void showInfo() {
        System.out.println("---UPDATED FACULTY DETAILS---");
        System.out.println("NAME        FACULTY ID        DEPARTMENT");
        for (i = 0; i < fid.length; i++) {
            if(fid[i]!=0)
            {              
            System.out.print(name[i]+"         ");
            System.out.print(fid[i]+"         ");
			System.out.print(fdepartment[i]);
            System.out.println(" ");
            }
        }
    }
}