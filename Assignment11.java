package one;
import java.util.Scanner;

public class Assignment11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to check if it is an ARMSTRONG or not: ");
        int inputNumber= in.nextInt();     
        int rem;
        double sum=0;
        int temp;
        temp=inputNumber;
        while(inputNumber!=0) {
       	rem=inputNumber%10;
       	sum=sum+(Math.pow(rem,3));
       	inputNumber/=10;
        }
        if(temp==sum) {
       	 System.out.println(temp+ " is Armstrong number......!");
        }
       	 else {
       		 System.out.println(temp+ " is not Armstrong number....");
        }

	}

}
