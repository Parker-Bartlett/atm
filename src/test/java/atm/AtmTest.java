package atm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AtmTest {

	@Test
	public void shouldReturnOneHundredForBalance() {
		// Arrange
		Atm underTest = new Atm(100);
		// Act
		int actual = underTest.checkBalance();
		// Assert
		assertEquals(100, actual);
	}

	@Test
	public void shouldReturnTwoHundredForBalance() {
		// Arrange
		Atm underTest = new Atm(200);
		// Act
		int actual = underTest.checkBalance();
		// Assert
		assertEquals(200, actual);
	}

	@Test
	public void shouldWithdraw() {
		// Arrange
		Atm underTest = new Atm(200);
		// Act
		int withdrawalAmount = underTest.withdraw(50);
		// Assert
		assertEquals(50, withdrawalAmount);
	}

	@Test
	public void shouldDecreaseWhenMoneyIsWithdrawn() {
		// Arrange
		Atm underTest = new Atm(200);
		// Act
		int originalBalance = underTest.checkBalance();
		underTest.withdraw(50);
		int newBalance = underTest.checkBalance();
		// Assert
		assertEquals(originalBalance - 50, newBalance);
	}

	@Test
	public void shouldIncreaseWhenMoneyIsDeposited() {
		// Arrange
		Atm underTest = new Atm(200);
		// Act
		int originalBalance = underTest.checkBalance();
		underTest.deposit();
		int newBalance = underTest.checkBalance();
		// Assert
		assertEquals(originalBalance + 50, newBalance);
	}

	@Test
	public void shouldWithdrawCustomAmount() {
		// Arrange
		Atm underTest = new Atm(200);
		// Act
		int withdrawalAmount = underTest.withdraw(100);
		// Assert
		assertEquals(100, withdrawalAmount);
	}
}