import java.util.Scanner;

public class armstrong_intervals {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number:");
        int n=s.nextInt();
        System.out.println("Enter the second number:");
        int m=s.nextInt();
        for(int i=n;i<m;i++)
        {
        	int sum=0,r;
        	int check=i;
        	while(check!=0)
        	{
        	r=check%10;
        	sum=sum+(r*r*r);
        	check=check/10;
        	}
        	if(sum==i)
        	{
        		 System.out.println(+i);
        	}
        }
       
	}

}
