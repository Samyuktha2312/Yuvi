import java.util.Scanner;

public class sum_of_kintegers {

	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter the value:");
	  int n=s.nextInt();
	  int k=s.nextInt();
	  int sum=0;
	  int a[]=new int[n];
	  for(int i=0;i<n;i++)
	  {
		  a[i]=s.nextInt();
	  }
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<k;j++)
		  {
			  if(i==j)
			  {
				  sum=sum+a[i];
			  }
			}
		   }
	  System.out.println(sum);
	}
}
