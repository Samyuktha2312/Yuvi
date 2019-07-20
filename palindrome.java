import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=s.nextInt();
	int r,temp,p=0;
	temp=n;
	while(n>0)
	{
		r=n%10;
		p=p*10+r;
		n=n/10;
	}
	if(temp==p)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
	}

}
