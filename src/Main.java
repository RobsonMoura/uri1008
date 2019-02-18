import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, h;
		double s, m;
		
		n = sc.nextInt();
		h = sc.nextInt();
		s = sc.nextDouble();
		m = h * s;
		
		System.out.println("NUMBER = " + n);
		System.out.printf("SALARY = U$ %.2f%n",m);
		
		sc.close();
		
		
	}

}
