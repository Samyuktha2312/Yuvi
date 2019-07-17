import java.util.Scanner;

public class positive_negative_Equal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int i=s.nextInt();
		if(i>0)
		{
			System.out.println("positive");
		}
		else 
		{
			System.out.println("negative");
		}
		if(i==0)
		{
			System.out.println("Zero");
		}
	}

}
