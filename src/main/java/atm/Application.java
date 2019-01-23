package atm;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//login prompt
		System.out.print("Please enter your Personal Identification Number: ");
		String pid = input.next();
		System.out.print("Please enter your Password: ");
		String password = input.next();

		//Create ATM object
		Atm atm = new Atm(500, pid, password);
		
		//Check pid and password
		atm.checkPidPassword();
		
		// Main menu
		menuOutput();
		// Main menu choice
		System.out.print("> ");
		String menuChoice = input.next();
		menuChoice = menuAction(input, atm, menuChoice);
	}

	private static String menuAction(Scanner input, Atm atm, String menuChoice) {
		while (menuChoice.equalsIgnoreCase("1") || menuChoice.equalsIgnoreCase("2") || menuChoice.equalsIgnoreCase("3") || menuChoice.equals("4")){
			if (menuChoice.equals("1")) {
				System.out.println(atm.checkBalance());
			} else if (menuChoice.contentEquals("2")) {
				System.out.print("How much would you like to withdrawal? ");
				int amount = input.nextInt();
				System.out.println(atm.withdraw(amount));
			} else if (menuChoice.contentEquals("3")) {
				System.out.print("How much would you like to deposit? ");
				int amount = input.nextInt();
				System.out.println(atm.deposit(amount));
			} else if (menuChoice.contentEquals("4")) {
				System.out.print("Are you sure? ");
				String areYouSure = input.next();
				if (areYouSure.equalsIgnoreCase("no")) {
		
				} else if (areYouSure.equalsIgnoreCase("yes")) {
					System.exit(0);
				}
			}
			menuOutput();
			System.out.print("> ");
			menuChoice = input.next();
		}
		return menuChoice;
	}

	private static void menuOutput() {
		System.out.println("\nPlease select an option:");
		System.out.println("1. Check Balance");
		System.out.println("2. Withdraw");
		System.out.println("3. Deposit");
		System.out.println("4. Exit ATM");
	}

}
