import java.util.Scanner;

public class odd_numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two values");
		int n=s.nextInt();
		int m=s.nextInt();
		for(int i=n;i<=m;i++)
			{
			if(i%2!=0)
			{
			System.out.println(i);
			}
			}
		
        s.close();
	}

}
