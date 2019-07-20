import java.util.*;
public class special_characters {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the character:");
	char i=s.next().charAt(0);
	
	int x=(int)i;
		if((int)i>=97 && (int)i<=122||(int)i>=65 && (int)i<=90)
	{
		System.out.println("alphabet");
	}
	else if((int)i>=48 && (int)i<=57)
	{
		System.out.println("not a alphabet");
	}
	else
	{
		System.out.println("special character");
	}
		s.close();
	
}
}
