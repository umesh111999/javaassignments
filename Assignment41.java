package one;
import java.util.Scanner;

public class Assignment41 {

	public static void main(String[] args) {
		System.out.println("Enter the First Number : ");
		Scanner sn = new Scanner(System.in);
        int a= sn.nextInt();
        System.out.println("Enter the Second Number : ");
        int b= sn.nextInt();
        System.out.println("Perform addition and division");
        int sum = a+b;
        System.out.println("additon of two numbers : " +sum);	
				try {
					int division = a/b;
					System.out.println("division of two numbers is: " +sum);
				} catch (Exception e) {
					System.out.println("Arithmetic Exception is occured");
				}

	}

}
