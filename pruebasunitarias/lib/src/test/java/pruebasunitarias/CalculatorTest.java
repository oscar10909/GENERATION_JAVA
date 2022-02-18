package pruebasunitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	private final Calculator calculator = new Calculator();
	
	@Test
	//void test() {
		//fail("Not yet implemented");
	//}
	
	void addition() {
		assertEquals(8, calculator.addNumbers(5, 3));
	}
	@Test
	void sustraction() {
		assertEquals(8, calculator.subtractNumbers(10, 2));
	}
	@Test
	void div() {
		assertEquals(5, calculator.divideNumbers(15, 3));
	}
	@Test
	void multi() {
		assertEquals(15, calculator.multiplyNumbers(5, 3));
	}

}
