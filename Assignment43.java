package one;
import java.util.Scanner;

public class Assignment43 {

	public static void main(String[] args) {
		Balance SavingAccount = new Balance();
		SavingAccount.withdraw();
		}
}
class InsufficientBalanceException extends Exception{
	
}
class IllegalBankTransactionException extends Exception{
}
class Balance {
	public void withdraw() {
	Scanner availBal=new Scanner(System.in);
	System.out.println("Enter Available balance: ");
	int availableBalance = availBal.nextInt();
	System.out.println("Enter amount to withdraw: ");
	int inputamount=availBal.nextInt();
	
		try {
			
			if(inputamount>availableBalance||availableBalance==0) {
				throw new InsufficientBalanceException ();
			}
			if(inputamount<0) {
				throw new IllegalBankTransactionException();
			}
			else {
				System.out.println("process is success");
			}
			     
			}catch(IllegalBankTransactionException | InsufficientBalanceException e){
				System.out.println(e);
			}

	}

}
