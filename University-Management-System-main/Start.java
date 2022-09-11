import java.lang.*;
import classes.*;
import java.util.*;
import java.util.Scanner;

public class Start {

    public static void main(String args[]) {
		
        int c, usr;
		final String uni = "AIUB";
        FacultyDatabase ob = new FacultyDatabase();
		StudentDatabase ob2 = new StudentDatabase();
		
		System.out.println("-----WELCOME TO "+uni+" MANAGEMENT SYSTEM-----");
		System.out.println("---MENU---");
        System.out.println("1/ FACULTY MANAGEMENT");
        System.out.println("2/ STUDENT MANAGEMENT");
		System.out.println("Select an Option");
		
		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		
		if(choice == 1)
		{
		try{
        do {
            System.out.println("---FACULTY MANAGEMENT---");
            System.out.println("1/ ADD FACULTY");
            System.out.println("2/ SEARCH FACULTY");
            System.out.println("3/ DELETE FACULTY");
            System.out.println("4/ UPDATE FACULTY");
            System.out.println("5/ EXIT");
			System.out.println("Select an Option");
            int ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Number of Faculties to Add");
                    usr = s.nextInt();
                    ob.add(usr);
                    break;
                case 2:
                    ob.search();
                    break;
                case 3:
                    ob.delete();
                    break;
                case 4:
                    ob.update();
                    break;
                case 5:
                    System.exit(0);
            }

            System.out.println("Enter 5 to Exit");
            c = s.nextInt();
        }while (c != 5);
		}
		catch(Exception exp){
			System.out.println(exp);
		}
		}
		
		else if(choice == 2)
		{
		try{
        do {
            System.out.println("---STUDENT MANAGEMENT---");
            System.out.println("1/ ADD STUDENT");
            System.out.println("2/ SEARCH STUDENT");
            System.out.println("3/ DELETE STUDENT");
            System.out.println("4/ UPDATE STUDENT");
            System.out.println("5/ EXIT");
			System.out.println("Select Option");
            int ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Number of Students to Add");
                    usr = s.nextInt();
                    ob2.add(usr);
                    break;
                case 2:
                    ob2.search();
                    break;
                case 3:
                    ob2.delete();
                    break;
                case 4:
                    ob2.update();
                    break;
                case 5:
                    System.exit(0);
            }

            System.out.println("Enter 5 to Exit");
            c = s.nextInt();
        } while (c != 5);
		}
		catch(Exception exp){
			System.out.println(exp);
		}
		}
		
		else {System.out.println("You didn't select the correct option.");}

    }
	}