
import java.util.Scanner;

public class sum_of_natural_numbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter n value:");
		int N=s.nextInt();
		int sum=0;
		for(int i=0;i<=N;i++)
		{
			sum=sum+i;
		}
        System.out.println(sum);
	}

}
