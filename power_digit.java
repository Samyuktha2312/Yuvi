import java.util.Scanner;

public class power_digit {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the value:");
     int n=s.nextInt();
     int k=s.nextInt();
     int p=(int)Math.pow(n,k);
     System.out.println(p);
    
	}

}
