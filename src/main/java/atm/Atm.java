package atm;

public class Atm {
	private int balance;

	public Atm(int balance) {
		this.balance = balance;
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
		return amount;
	}
}
