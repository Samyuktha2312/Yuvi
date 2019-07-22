import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=s.nextInt();
		int r;
		int sum=0;
		int temp=n;
		while(n>0)
		{
		r=n%10;
		sum=sum+(r*r*r);
		n=n/10;
		}
		if(temp==sum)
		{
     	System.out.println("yes");
		}
	   else
	    {
		System.out.println("no");
	    }

	}

}
