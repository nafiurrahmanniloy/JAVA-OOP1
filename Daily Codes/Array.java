import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
	String name;
	int id;
	String courseName[];
	int number=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of students : ");
		int size = sc.nextInt();

		Student students[] = new Student[size];
		sc.nextLine();

		for(int i=0;i<size;i++)
	    {
		System.out.println("Enter name : ");
		name=sc.nextLine();
		System.out.println("Enter id : ");
		id= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter total course number : " );
	    number = sc.nextInt();
		courseName = new String [number];
		System.out.println("Enter total course names : " );
		for(int j=0;j<number;j++)
		{
			courseName[j]= sc.nextLine();
		}
	  students[i]=new Student(name,id,courseName);

	   }

	for(int i=0;i<size;i++)
		{
			int x=i+1;
			System.out.println("Student-"+x+" info");
			System.out.println("Name: "+students[i].name);
			System.out.println("Id: "+students[i].id);
			System.out.println("Course Name: ");
			for (int j = 0; j <number ; j++) 
				{
				 int y=j+1;
				System.out.println("Course : "+students[i].courseName[j]);
				System.out.println(" ");

				}
		
				System.out.println(" ");

				}



		

		
// for (int i=0;i<size;i++)
// 		{
// 			System.out.println(students[i]);
// 		}


		// // students[0] = new Student(1, "kawsur", new String[]{"C++", "JAVA", "PHP"});
		// // students[1] = new Student(1, "Tamim", new String[]{"JAVA", "PHP"});
		// // students[2] = new Student(1, "Rifat", new String[]{});

		// // for(int i = 0; i < 3; i++) {
		// // 	System.out.print("Id: " + students[i].id + ", " + "Name: " + students[i].name + ", Course Name: ");
		// // 	for (int j = 0; j < students[i].courseName.length; j++) {
		// // 		System.out.print(" " + students[i].courseName[j] + ",");
		// // 	}
		// 	System.out.println();
		// }
	}
}
