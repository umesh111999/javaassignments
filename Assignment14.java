package one;
import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner ys = new Scanner(System.in);
		a=ys.nextInt();
		b=ys.nextInt();
		c=ys.nextInt();
	if(a>=60   &&  b>=60 && c>=60)
		{
			System.out.println("pass");
			
		}
	else if((a>=60 && b>=60)||(b>=60 && c>=60)||(c>=60 && a>=60))
	   {
		System.out.println("student promoted");	
		}
	else if ((a>=60&&b<=60&&c<60)||(a<=60&&b>=60&&c<60)||(a<=60&&b<=60&&c>=60)) {
		System.out.println("student fail");
		
	}
	else {
		System.out.println("student fail all");
	}
}

}
