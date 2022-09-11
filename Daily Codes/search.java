import java.util.Scanner;
public class search{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter size of the array : ");
		int size = sc.nextInt();
		System.out.println(" size of the array : "+size);

		int number[]=new int[size];

		// for (int i=0;i<size;i++)
		// {
		// 	System.out.println(number[i]);  //user input of array size
		// }
		System.out.println("Enter "+ size+ " numbers of elements : ");
		for (int i=0;i<size;i++)
		{
			number[i]=  sc.nextInt();
		}
		System.out.println(" all numbers of elements : ");

		for (int i=0;i<size;i++)
		{
			System.out.println (number[i]);
		}
int bt;
do{
		System.out.print("Search an element:  ");
		int x=sc.nextInt();
		System.out.print("Searched element is : "+x);
		System.out.println();
		for (int i=0;i<size;i++)
		{								//i<number.length can also be used
			if (x==number[i])
			{
				System.out.println ("element Found!!! and it is at the index of : "+i);
			}
			else 
			{
				System.out.println("Element not found!!!");
				
			}

		}
		break;

		}
		while (bt!='1');
		
	}

}