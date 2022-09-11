import java.util.Scanner;
public class myinfo
{
	public static void main(String[] args)
	{
		Scanner info = new Scanner (System.in);
		System.out.println("Enter your name        :");
		String name=info.nextLine();
		System.out.println("enter your age         :");
		int age =info.nextInt();
		System.out.println("enter your mail address:");
		info.nextLine();
		String mail=info.nextLine();
		System.out.println("what is your cgpa       :");
		float cg=info.nextFloat();
		System.out.println("NAME        :"+name );
		System.out.println("age         : "+age );
		System.out.println("Mail address:"+mail );
		System.out.println("CGPAN       :"+cg );
	}
}