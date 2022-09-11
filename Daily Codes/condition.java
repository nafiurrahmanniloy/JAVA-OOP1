import java.util.Scanner;
public class condition{
	public static void main(String args[])
	{
		Scanner a = new Scanner (System.in);
		System.out.println("-----------------------------------------------------");
		System.out.println("enter your age : ");
		int age =a.nextInt();
		

		if(age>18){
			System.out.println("You can watch video");
		} else if (age>69){
			System.out.println("you are too old to watch video");
		}	
			else {
				System.out.println("your are not able to watch video");
			}
			
		}


	}
