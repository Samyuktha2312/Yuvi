import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the value:");
	int n=s.nextInt();
	boolean b=true;
	for(int i=2;i<=n-1;i++)
	{
	 if(n%i==0)
	 {
	 	 b=false;
	 }
	 }
		if(b) {
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
