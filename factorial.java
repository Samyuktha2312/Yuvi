import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=s.nextInt();
	int m=s.nextInt();
	int j=1;
	for(int i=1;i<=m;i++)
	{
		j=j*i;
	}
	System.out.println(j);
	}

}
