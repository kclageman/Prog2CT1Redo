import java.util.Scanner;
public class CheckingAccount extends BankAccount {
	public static void main(String[] args) {
		double interestRate = 4.5;
		String firstName;
		String lastName;
		int accountID;
		balance = (deposit + balance) - withdrawal;
		System.out.print("What is your name and accountID?");
		Scanner user = new Scanner(System.in);
		firstName = user.next();
		lastName = user.next();
		accountID = user.nextInt();
		System.out.print("Please enter 1 for balance check, 2 for account summary, 3 for withdrawal, 4 for interest rate.");
		int menuOption = user.nextInt();
		if (menuOption == 1) {
			System.out.print("Your current balance is: $");
			System.out.print(balance);
			}
		if (menuOption == 2) {
			System.out.print("Account holder name is: ");
			System.out.println(firstName + " " + lastName);
			System.out.print("Account ID is: ");
			System.out.println(accountID);
			}
		if (menuOption == 3) {
			System.out.print("How much would you like to withdraw?");
			int cash = user.nextInt();
			double cashd = (double) cash;
			if (balance < cash) {
				balance = (balance - cash)- 30;
				System.out.print("Your account is now overdrawn. A $30 fee will be applied.");
				}
			if (balance >= cash) {
				balance = balance - cash;
			}
			System.out.print("Your new balance is: ");
			System.out.println(balance);
			}}}
