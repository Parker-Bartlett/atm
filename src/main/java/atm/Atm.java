package atm;

public class Atm {
	private int balance;
	private String pid;
	private String password;

	public Atm(int balance, String pid, String password) {
		this.balance = balance;
		this.pid = pid;
		this.password = password;
	}

	public int checkBalance() {
		return balance;
	}

	public int withdraw(int amount) {
		if (amount < balance) {
			if (amount % 10 == 0) {
				balance -= amount;
			} else {
				System.out.println("Please withdraw a multiple of ten.");
			}
		} else {
			System.out.println("You can't take out more than you have.");
		}
		return balance;
	}

	public int deposit(int amount) {
		balance += amount;
		return balance;
	}

	public void checkPidPassword() {
		String acct1Pid = "1234";
		String acct2Pid = "2345";
		String acct3Pid = "3456";
		String acct1Password = "parker";
		String acct2Password = "sara";
		String acct3Password = "mayla";
		int attempts = 0;

		while (attempts < 3) {
			if (pid.equals(acct1Pid) && password.equals(acct1Password)) {
				System.out.println("Welcome to Parker's ATM!");
				break;
			} else if (pid.equals(acct2Pid) && password.equals(acct2Password)) {
				System.out.println("Welcome to Parker's ATM!");
				break;
			} else if (pid.equals(acct3Pid) && password.equals(acct3Password)) {
				System.out.println("Welcome to Parker's ATM!");
				break;
			}
			attempts++;
			
		}
	}
}
