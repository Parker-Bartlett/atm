package atm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AtmTest {

//	@Test
//	public void shouldReturnOneHundredForBalance() {
//		// Arrange
//		Atm underTest = new Atm(200, "test", "test");		
//		// Act
//		int actual = underTest.checkBalance();
//		// Assert
//		assertEquals(100, actual);
//	}
//
//	@Test
//	public void shouldReturnTwoHundredForBalance() {
//		// Arrange
//		Atm underTest = new Atm(200, "test", "test");
//		// Act
//		int actual = underTest.checkBalance();
//		// Assert
//		assertEquals(200, actual);
//	}
//
//	@Test
//	public void shouldWithdraw() {
//		// Arrange
//		Atm underTest = new Atm(200, "test", "test");		
//		// Act
//		int withdrawalAmount = underTest.withdraw(50);
//		// Assert
//		assertEquals(150, withdrawalAmount);
//	}
//
//	@Test
//	public void shouldDecreaseWhenMoneyIsWithdrawn() {
//		// Arrange
//		Atm underTest = new Atm(200, "test", "test");		
//		// Act
//		String originalBalance = underTest.checkBalance();
//		underTest.withdraw(50);
//		String newBalance = underTest.checkBalance();
//		// Assert
//		assertEquals(originalBalance - 50, newBalance);
//	}
//
//	@Test
//	public void shouldIncreaseWhenMoneyIsDeposited() {
//		// Arrange
//		Atm underTest = new Atm(200, "test", "test");		
//		// Act
//		String originalBalance = underTest.checkBalance();
//		underTest.deposit(50);
//		String newBalance = underTest.checkBalance();
//		// Assert
//		assertEquals(originalBalance + 50, newBalance);
//	}
//
//	@Test
//	public void shouldWithdrawCustomAmount() {
//		// Arrange
//		Atm underTest = new Atm(200, "test", "test");		
//		// Act
//		String withdrawalAmount = underTest.withdraw(100);
//		// Assert
//		assertEquals(100, withdrawalAmount);
//	}
//	
//	@Test
//	public void shouldDepositCustomAmount() {
//		// Arrange
//		Atm underTest = new Atm(200, "test", "test");		
//		// Act
//		int depositAmount = underTest.deposit(100);
//		// Assert
//		assertEquals(100, depositAmount);
//	}
//	
//	@Test
//	public void shouldOnlyBeAbleToWithdrawalByTens() {
//		// Arrange
//		Atm underTest = new Atm(200, "test", "test");		
//		// Act
//		int withdrawalAmount = underTest.withdraw(11);
//		// Assert
//		assertEquals(200, withdrawalAmount);
//	}
}