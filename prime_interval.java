
import java.util.Scanner;

public class prime_interval {

	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the number:");
	    int n=s.nextInt();
	    int m=s.nextInt();
	    int count=0;
		for(int i=n;i<=m;i++)
	    {
			count=0;
	    	for(int j=i;j>=1;j--)
	    	{
	    		if(i%j==0)
	    		{
	    			count++;
	    		}
	    	}
	    		if(count==2)
	    		{
	    			System.out.println(i);
	             }
	       }
	}
}
		


