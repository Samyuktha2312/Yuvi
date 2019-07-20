import java.util.Scanner;

public class count_all_digits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=s.nextInt();
		int r=0;int count=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			count++;
		}
    System.out.println(count);
	}

}
