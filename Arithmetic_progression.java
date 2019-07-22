package rough;
import java.util.*;
public class Arithmetic_progression {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N =s.nextInt();
		int A =s.nextInt();
		int D =s.nextInt();
		int x = 2*A;
		int y = (N-1)*D;
		float z = N/2f;
		System.out.println(x);
		System.out.println(z);
		System.out.println(y);
		double sum = z*(x+y);
		System.out.println((int)sum);
	}

}
