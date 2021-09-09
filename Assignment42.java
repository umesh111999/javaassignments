package one;
import java.util.Scanner;

public class Assignment42 {

	public static void main(String[] args) {
		
			System.out.println("Enter the First Number : ");
			Scanner sn = new Scanner(System.in);
	        int a= sn.nextInt();
	        System.out.println("Enter the Second Number : ");
	        int b= sn.nextInt();
	        System.out.println("Perform addition and division");
	        int sum = a+b;
	        System.out.println("additon of two numbers is: " +sum);
				if(b==0) {
					System.out.println("Unsupported Operation Exception");
				}
				try{
					int div = a/b;
				System.out.println("division of two numbers is: " +div);
			} catch (Exception e) {
				
				System.out.println("Unsupported Exception was Handled..!");
			}

	}

}
