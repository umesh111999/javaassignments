package one;
import java.util.Scanner;

public class Assignment13 {
	public static void main(String[] args) {
		double p,t,r;
		
		try (Scanner sc = new Scanner(System.in)) {
			p =sc.nextInt();
			t=sc.nextInt();
			r=sc.nextInt();
		}
		double simple,compound;
		simple=(p*t*r)/100;
		r=Math.pow(r+1, t);
		compound=(p*r)-p;
		System.out.println(simple+","+compound);

	}
}

