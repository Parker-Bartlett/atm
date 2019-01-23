package atm;
import java.util.Scanner;
public class Atm {
	Scanner input = new Scanner(System.in);
	
	private int balance;
	private String pid;
	private String password;

	public Atm(int balance, String pid, String password) {
		this.balance = balance;
		this.pid = pid;
		this.password = password;
	}

	public String checkBalance() {
		return "Your current balance is " +balance+ " dollars.";
	}

	public String withdraw(int amount) {
		if (amount < balance) {
			if (amount % 10 == 0) {
				balance -= amount;
			} else {
				System.out.println("Please withdraw a multiple of ten.");
			}
		} else {
			System.out.println("You can't take out more than you have.");
		}
		return "You have withdrawn " +amount+ " dollars, and your current balance is " +balance+ " dollars.";
	}

	public String deposit(int amount) {
		balance += amount;
		return "You have deposited " +amount+ " dollars, and your balance is " +balance+ " dollars.S";
	}

	public void checkPidPassword() {
		String acct1Pid = "1234";
		String acct2Pid = "2345";
		String acct3Pid = "3456";
		String acct1Password = "parker";
		String acct2Password = "sara";
		String acct3Password = "mayla";
		int attempts = 0;

		while (attempts < 2) {
			if (pid.equals(acct1Pid) && password.equals(acct1Password)) {
				System.out.println("\nWelcome to Parker's ATM!");
				break;
			} else if (pid.equals(acct2Pid) && password.equals(acct2Password)) {
				System.out.println("\nWelcome to Parker's ATM!");
				break;
			} else if (pid.equals(acct3Pid) && password.equals(acct3Password)) {
				System.out.println("\nWelcome to Parker's ATM!");
				break;
			} else {
				System.out.print("Incorrect PID or Password \nPlease re-enter you Personal Identification number: ");
				pid = input.next();
				System.out.print("Please re-enter your Password: ");
				password = input.next();
			}
			
			attempts++;
			
			if (attempts == 2) {
				System.out.println("Too many attempts, you are now locked out.");
				System.exit(0);
			}
		}
	}
}
