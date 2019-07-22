import java.util.*;
public class first_5_multiples {

	public static void main(String[] args) 
	{
		 Scanner input = new Scanner(System.in);

		  int i = 0;
		  int n = 0;
		  do
		  {
			  System.out.print("Enter i :");
		      i = input.nextInt();
		      System.out.print("\nEnter n :");
		      n = input.nextInt();
		  }
		  while(i <= 1 || n <= 1);
		  {
			  System.out.print(n + " multiples of " + i + " are: ");
			  for (int counter = 0 ; counter < n ; counter++) {
		       System.out.print(i*(2 + counter) + " ");
		  }
	 }
	}

}
